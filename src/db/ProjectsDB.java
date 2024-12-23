/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import customexceptions.FailureException;
import model.Project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Priority;
import model.Status;
import helper.CurrentSession;

/**
 *
 * @author samtheradiant
 */
public class ProjectsDB {

    // Attributes
    private static Connection conn = DBConnectionManager.getConnection();

    // Queries
    private static final String insertProjectQuery = "INSERT INTO projects (title, description, status, priority, start_date, end_date) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String assignUserIDQuery = "INSERT INTO assigned_to VALUES (?, ?)";
    private static final String getProjectsQuery = "SELECT project_id, title, start_date, end_date, status, priority FROM projects WHERE project_id IN (SELECT project_id FROM assigned_to WHERE account_id = ?);";
    private static final String getNewProjectQuery = "SELECT project_id, title, start_date, end_date, status, priority FROM projects WHERE project_id = ?";
    private static final String countProjectsQuery = "SELECT t.total, d.done FROM (SELECT COUNT(project_id) AS total FROM projects WHERE project_id IN (SELECT project_id FROM assigned_to WHERE account_id =  ?)) AS t, (SELECT COUNT(project_id) AS done FROM projects WHERE status = 'DONE' AND project_id IN (SELECT project_id FROM assigned_to WHERE account_id = ?)) AS d";
    private static final String deleteProjectsQuery = "DELETE FROM projects WHERE project_id = ?";
    private static final String updateTitleQuery = "UPDATE projects SET title = ? WHERE project_id = ?";
    private static final String updateDescQuery = "UPDATE projects SET description = ? WHERE project_id = ?";
    private static final String updateStartDateQuery = "UPDATE projects SET start_date = ? WHERE project_id = ?";
    private static final String updateEndDateQuery = "UPDATE projects SET end_date = ? WHERE project_id = ?";
    private static final String updateStatusQuery = "UPDATE projects SET status = ? WHERE project_id = ?";
    private static final String updatePriorityQuery = "UPDATE projects SET priority = ? WHERE project_id = ?";
    private static final String getDescQuery = "SELECT description FROM projects WHERE project_id = ?";

    // For newly created projects at runtime  
    private static ArrayList<Integer> newProjectIDs = new ArrayList<>();
    // For projects extracted from database at runtime
    private static ArrayList<Integer> projectIDs = new ArrayList<>();

    // METHODS
    public static void save(Project project) throws FailureException {
        try (PreparedStatement saveStmnt = conn.prepareStatement(insertProjectQuery, Statement.RETURN_GENERATED_KEYS); PreparedStatement assignStmnt = conn.prepareStatement(assignUserIDQuery)) {
            conn.setAutoCommit(false);
            saveStmnt.setString(1, project.getTitle());
            saveStmnt.setString(2, project.getDesc());
            saveStmnt.setString(3, project.getStatus());
            saveStmnt.setString(4, project.getPriority());
            saveStmnt.setDate(5, Date.valueOf(project.getStartDate()));
            saveStmnt.setDate(6, Date.valueOf(project.getEndDate()));

            int affectedRows = saveStmnt.executeUpdate();
            int projectId = 0;
            if (affectedRows > 0) {
                try (ResultSet keys = saveStmnt.getGeneratedKeys()) {
                    if (keys.next()) {
                        projectId = keys.getInt(1);
                    }
                } catch (SQLException keyExcep) {
                    System.err.print(keyExcep.getMessage());
                }
            } else {
                conn.rollback();
                throw new FailureException("Insert did not work in projects table!");
            }
            newProjectIDs.add(projectId);

            assignStmnt.setInt(1, CurrentSession.getAccountID());
            assignStmnt.setInt(2, projectId);

            // FK: Foriegn Keys
            int affectedFKRows = assignStmnt.executeUpdate();
            if (!(affectedFKRows > 0)) {
                conn.rollback();
                throw new FailureException("Insert did not work in assigned_to table");
            }
            conn.commit();
        } catch (SQLException sqle) {
            throw new FailureException(sqle.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true);
                }
            } catch (SQLException e) {
                throw new FailureException(e.getMessage());
            }
        }
    }

    public static ArrayList<Project> getProjects() throws FailureException {
        if (conn == null) {
            throw new FailureException("Database connection is null");
        }
        ArrayList<Project> projects = new ArrayList<>();
        try (PreparedStatement listProjectsStmnt = conn.prepareStatement(getProjectsQuery)) {
            listProjectsStmnt.setInt(1, CurrentSession.getAccountID());
            try (ResultSet list = listProjectsStmnt.executeQuery()) {
                if (!list.isBeforeFirst()) {
                    return null;
                }
                while (list.next()) {
                    int project_id = list.getInt(1);
                    String title = list.getString(2);
                    LocalDate startDate = list.getDate(3).toLocalDate();
                    LocalDate endDate = list.getDate(4).toLocalDate();
                    Status projectStatus = Status.getEnum(list.getString(5));
                    Priority projectPriority = Priority.getEnum(list.getString(6));

                    projects.add(new Project(project_id, title, startDate, endDate, projectStatus, projectPriority));
                    projectIDs.add(project_id);
                }
            } catch (SQLException sqle) {
                //conn.rollback();
                System.err.print(sqle.getMessage());
            }

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            if (conn != null) {
                try {
                    System.err.print("Transaction is being rolled back");
                    conn.rollback();
                } catch (SQLException sqlexcep) {
                    System.err.print(sqlexcep.getMessage());
                }
            }
        }
        return projects;
    }

    public static ArrayList<Project> getNewProjects() throws FailureException {
        ArrayList<Project> projects = new ArrayList<>();
        ArrayList<Integer> tempIDs = new ArrayList<>();
        if (newProjectIDs.isEmpty()) {
            throw new FailureException("Already updated to latest project");
        }
        try (PreparedStatement newProjectStmnt = conn.prepareStatement(getNewProjectQuery)) {
            for (int id : newProjectIDs) {
                newProjectStmnt.setInt(1, id);
                try (ResultSet list = newProjectStmnt.executeQuery()) {
                    while (list.next()) {
                        int projectID = list.getInt(1);
                        String title = list.getString(2);
                        LocalDate startDate = list.getDate(3).toLocalDate();
                        LocalDate endDate = list.getDate(4).toLocalDate();
                        Status projectStatus = Status.getEnum(list.getString(5));
                        Priority projectPriority = Priority.getEnum(list.getString(6));

                        projects.add(new Project(projectID, title, startDate, endDate, projectStatus, projectPriority));
                        tempIDs.add(id);
                    }
                } catch (SQLException ex) {
                    throw new FailureException(ex.getMessage());
                }
            }
            for (int id : tempIDs) {
                projectIDs.add(newProjectIDs.remove(newProjectIDs.indexOf(id)));
            }
        } catch (SQLException ex) {
            throw new FailureException(ex.getMessage());
        }
        return projects;
    }

    public static int getProjectCompletion() throws FailureException {
        if (conn == null) {
            throw new FailureException("Database connection is null");
        }
        double percentage;
        percentage = 0;
        double done = 0, total = 0;
        try (PreparedStatement completionStmnt = conn.prepareStatement(countProjectsQuery)) {
            completionStmnt.setInt(1, CurrentSession.getAccountID());
            completionStmnt.setInt(2, CurrentSession.getAccountID());
            try (ResultSet projectsData = completionStmnt.executeQuery()) {
                projectsData.next();
                total = projectsData.getInt(1);
                done = projectsData.getInt(2);
            } catch (SQLException ex) {
                throw new FailureException(ex.getMessage());
            }

        } catch (SQLException ex) {
            throw new FailureException(ex.getMessage());
        }
        percentage = (done / total) * 100;
//        System.out.println(total);
//        System.out.println(done);
//        System.out.println(percentage);
        return (int) percentage;
    }

    public static void deleteProjects(ArrayList<Integer> trashProjectIDs) throws FailureException {
        for (int id : trashProjectIDs) {
            try (PreparedStatement deleteStmnt = conn.prepareStatement(deleteProjectsQuery)) {
                conn.setAutoCommit(false);
                deleteStmnt.setInt(1, id);
                int affectedRows = deleteStmnt.executeUpdate();
                if (!(affectedRows > 0)) {
                    conn.rollback();
                    throw new FailureException("Could not delete project. (ID: " + id + ")");
                }
            } catch (SQLException ex) {
                throw new FailureException(ex.getMessage());
            } finally {
                try {
                    conn.setAutoCommit(true);
                } catch (SQLException e) {
                    throw new FailureException(e.getMessage());
                }
            }
        }
    }

    public static void updateTitle(int targetProjectID, String title) throws SQLException {
        try (PreparedStatement updateStmnt = conn.prepareStatement(updateTitleQuery)) {
            conn.setAutoCommit(false);
            updateStmnt.setString(1, title);
            updateStmnt.setInt(2, targetProjectID);
            int affectedRows = updateStmnt.executeUpdate();
            if (affectedRows == 0) {
                conn.rollback();
                throw new SQLException("Updating title failed, no rows affected.");
            }
            conn.commit();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
                throw new SQLException(ex.getMessage());
            }
        }
    }

    public static void updateDesc(int targetProjectID, String desc) throws SQLException {
        try (PreparedStatement updateStmnt = conn.prepareStatement(updateDescQuery)) {
            conn.setAutoCommit(false);
            updateStmnt.setString(1, desc);
            updateStmnt.setInt(2, targetProjectID);
            int affectedRows = updateStmnt.executeUpdate();
            if (affectedRows == 0) {
                conn.rollback();
                throw new SQLException("Updating description failed, no rows affected.");
            }
            conn.commit();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
                throw new SQLException(ex.getMessage());
            }
        }
    }

    public static void updateStartDate(int targetProjectID, LocalDate startDate) throws SQLException {
        try (PreparedStatement updateStmnt = conn.prepareStatement(updateStartDateQuery)) {
            conn.setAutoCommit(false);
            updateStmnt.setDate(1, Date.valueOf(startDate));
            updateStmnt.setInt(2, targetProjectID);
            int affectedRows = updateStmnt.executeUpdate();
            if (affectedRows == 0) {
                conn.rollback();
                throw new SQLException("Updating start date failed, no rows affected.");
            }
            conn.commit();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
                throw new SQLException(ex.getMessage());
            }
        }
    }

    public static void updateEndDate(int targetProjectID, LocalDate endDate) throws SQLException {
        try (PreparedStatement updateStmnt = conn.prepareStatement(updateEndDateQuery)) {
            conn.setAutoCommit(false);
            updateStmnt.setDate(1, Date.valueOf(endDate));
            updateStmnt.setInt(2, targetProjectID);
            int affectedRows = updateStmnt.executeUpdate();
            if (affectedRows == 0) {
                conn.rollback();
                throw new SQLException("Updating end date failed, no rows affected.");
            }
            conn.commit();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
                throw new SQLException(ex.getMessage());
            }
        }
    }

    public static void updateStatus(int targetProjectID, Status newStatus) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(updateStatusQuery)) {
            conn.setAutoCommit(false);
            pstmt.setString(1, newStatus.name());
            pstmt.setInt(2, targetProjectID);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows == 0) {
                conn.rollback();
                throw new SQLException("Updating status failed, no rows affected.");
            }
            conn.commit();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
                throw new SQLException(ex.getMessage());
            }
        }
    }

    public static void updatePriority(int targetProjectID, Priority newPriority) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(updatePriorityQuery)) {
            conn.setAutoCommit(false);
            pstmt.setString(1, newPriority.name());
            pstmt.setInt(2, targetProjectID);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows == 0) {
                conn.rollback();
                throw new SQLException("Updating priority failed, no rows affected.");
            }
            conn.commit();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
                throw new SQLException(ex.getMessage());
            }
        }
    }

    public static String getDesc(int projectId) throws SQLException {
        String desc = "";
        try (PreparedStatement pstmt = conn.prepareStatement(getDescQuery)) {
            pstmt.setInt(1, projectId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    desc = rs.getString(1);
                } else {
                    throw new SQLException("No project found with project_id: " + projectId);
                }
            }
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
        return desc;
    }
}
