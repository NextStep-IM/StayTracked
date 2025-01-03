/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import db.DBConnectionManager;
import db.DatabaseUtils;
import db.ProjectsDB;
import helper.CurrentSession;
import helper.CustomTableHeader;
import helper.JDateChooserEditor;
import helper.TableCellListener;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import model.Status;
import model.Priority;
import model.Project;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author samtheradiant
 */
public class ProjectsScreen extends javax.swing.JPanel {

    /**
     * Creates new form ProjectsScreen
     */
    public ProjectsScreen() {
        
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel1 = new javax.swing.JPanel();
        centerPanel = new javax.swing.JPanel();
        hintLbl = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        deleteBtn = new javax.swing.JButton();
        createProjectBtn = new javax.swing.JButton();
        scanBtn = new javax.swing.JButton();
        infoBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        showTasksBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectsTable = new javax.swing.JTable();

        jFormattedTextField1.setText("jFormattedTextField1");

        setBackground(new java.awt.Color(21, 25, 34));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(21, 25, 34));
        jPanel1.setLayout(new java.awt.BorderLayout());

        centerPanel.setBackground(new java.awt.Color(21, 25, 34));
        centerPanel.setLayout(new java.awt.BorderLayout());

        hintLbl.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        hintLbl.setForeground(new java.awt.Color(45, 168, 216));
        hintLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hintLbl.setLabelFor(jPanel1);
        hintLbl.setText("Double click to edit!");
        hintLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hintLbl.setVisible(false);
        centerPanel.add(hintLbl, java.awt.BorderLayout.CENTER);

        jPanel1.add(centerPanel, java.awt.BorderLayout.CENTER);

        rightPanel.setBackground(new java.awt.Color(21, 25, 34));

        deleteBtn.setBackground(new java.awt.Color(21, 25, 34));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trash.png"))); // NOI18N
        deleteBtn.setToolTipText("Delete selected row(s)");
        deleteBtn.setBorderPainted(false);
        deleteBtn.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trash-can-disabled-2.png"))); // NOI18N
        deleteBtn.setEnabled(false);
        deleteBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trash-pressed.png"))); // NOI18N
        // deleteBtn.putClientProperty("JButton.buttonType", "roundRect");
        //deleteBtn.putClientProperty("Button.borderWidth", 2);
        //deleteBtn.putClientProperty("Button.hoverBorderColor", new Color(45, 168, 216));
        //deleteBtn.putClientProperty("Button.borderColor", new Color(21, 25, 34));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        createProjectBtn.setBackground(new java.awt.Color(21, 25, 34));
        createProjectBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plus.png"))); // NOI18N
        createProjectBtn.setToolTipText("Create project");
        createProjectBtn.setBorderPainted(false);
        createProjectBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plus-pressed.png"))); // NOI18N
        createProjectBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        // createProjectBtn.putClientProperty("JButton.buttonType", "roundRect");
        createProjectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProjectBtnActionPerformed(evt);
            }
        });

        scanBtn.setBackground(new java.awt.Color(21, 25, 34));
        scanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rotate-right.png"))); // NOI18N
        scanBtn.setToolTipText("Scan for projects");
        scanBtn.setBorderPainted(false);
        scanBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rotate-right-pressed.png"))); // NOI18N
        // scanBtn.putClientProperty("JButton.buttonType", "roundRect");
        scanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanBtnActionPerformed(evt);
            }
        });

        infoBtn.setBackground(new java.awt.Color(21, 25, 34));
        infoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info.png"))); // NOI18N
        infoBtn.setToolTipText("Show project description");
        infoBtn.setBorderPainted(false);
        infoBtn.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info-disabled.png"))); // NOI18N
        infoBtn.setEnabled(false);
        infoBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info-pressed.png"))); // NOI18N
        infoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createProjectBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scanBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoBtn)
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoBtn)
                    .addComponent(scanBtn)
                    .addComponent(createProjectBtn)
                    .addComponent(deleteBtn))
                .addContainerGap())
        );

        jPanel1.add(rightPanel, java.awt.BorderLayout.EAST);

        jPanel2.setBackground(new java.awt.Color(21, 25, 34));

        showTasksBtn.setBackground(new java.awt.Color(45, 168, 216));
        showTasksBtn.setForeground(new java.awt.Color(21, 25, 34));
        showTasksBtn.setText("Show Tasks");
        showTasksBtn.setBorderPainted(false);
        showTasksBtn.putClientProperty("JButton.buttonType", "roundRect");
        showTasksBtn.setVisible(false);
        showTasksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTasksBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(showTasksBtn)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showTasksBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.WEST);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        projectsTable.setBackground(new java.awt.Color(21, 25, 34));
        projectsTable.setForeground(new java.awt.Color(221, 255, 255));
        projectsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title ", "Start Date", "Deadline", "Status", "Priority", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        projectsTable.setFillsViewportHeight(true);
        projectsTable.setGridColor(new java.awt.Color(49, 49, 49));
        projectsTable.setRowHeight(35);
        projectsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        projectsTable.setShowGrid(false);
        projectsTable.setShowHorizontalLines(true);
        projectsTable.setTableHeader(new CustomTableHeader(projectsTable.getColumnModel()));
        // Set Enum columns' editor to be a JComboBox

        projectsTable.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(new JComboBox<>(Status.values())));
        projectsTable.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(new JComboBox<>(Priority.values())));
        projectsTable.getColumnModel().getColumn(1).setCellEditor(new JDateChooserEditor(new JTextField()));
        projectsTable.getColumnModel().getColumn(2).setCellEditor(new JDateChooserEditor(new JTextField()));

        // Listener for list selection
        projectsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent ev) {
                handleButtonsVisiblity();
            }
        });

        // Set click to start editing
        for (int i = 0; i <= 4; i++) {
            DefaultCellEditor cellEditor = (DefaultCellEditor) projectsTable.getColumnModel().getColumn(i).getCellEditor();
            try {
                cellEditor.setClickCountToStart(2);
            }
            catch (NullPointerException ex) {
                // pass
            }
        }

        // Remove column from "view". Data can still be accessed through table model
        TableColumnModel columnModel = projectsTable.getColumnModel();
        columnModel.removeColumn(projectsTable.getColumnModel().getColumn(5));

        JTableHeader tableHeader = projectsTable.getTableHeader();
        tableHeader.setFont(new Font(projectsTable.getFont().getFontName(), Font.BOLD, projectsTable.getFont().getSize()));

        Action action = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                TableCellListener tcl = (TableCellListener)e.getSource();
                updateCell(tcl);
                //        System.out.println("Row   : " + tcl.getRow());
                //        System.out.println("Column: " + tcl.getColumn());
                //        System.out.println("Old   : " + tcl.getOldValue());
                //        System.out.println("New   : " + tcl.getNewValue());
            }
        };

        TableCellListener tcl = new TableCellListener(projectsTable, action);
        projectsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickHandler(evt);
            }
        });
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane1.setViewportView(projectsTable);
        if (projectsTable.getColumnModel().getColumnCount() > 0) {
            projectsTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            projectsTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            projectsTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer );
            projectsTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            projectsTable.getColumnModel().getColumn(4).setCellRenderer(centerRenderer );
        }

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void updateCell(TableCellListener tcl) {
        int row = tcl.getRow();
        int column = tcl.getColumn();
        int projectID = (int) projectsTable.getModel().getValueAt(row, 5);
        if (CurrentSession.getAccountType().equals("Normal")) {
            try {
                if (!(DatabaseUtils.checkPermission(projectID))) {
                    JOptionPane.showMessageDialog(this, "You are not allowed to edit properties of this project.", "Permission Error", JOptionPane.ERROR_MESSAGE);
                    projectsTable.setValueAt(tcl.getOldValue(), row, column);
                    return;
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        switch (column) {
            // For "Title" Column
            case 0:
                String oldTitle = (String) tcl.getOldValue();
                String newTitle = (String) tcl.getNewValue();
                try {
                    ProjectsDB.updateTitle(projectID, newTitle);
                } catch (SQLException ex) {
                    projectsTable.setValueAt(oldTitle, row, column);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                break;
            // For "Start Date" Column
            case 1:
                // This works but I don't know how
                // The old value's origin is LocalDate so maybe that's why
                LocalDate oldStartDate = (LocalDate) tcl.getOldValue();

                // Type-casting to LocalDate wierdly gets us a String first from getNewValue() which 
                // cannot be type-casted to LocalDate
                LocalDate newStartDate = LocalDate.parse((String) tcl.getNewValue());
                LocalDate currentEndDate = (LocalDate) projectsTable.getValueAt(row, 2);
                if (newStartDate.compareTo(currentEndDate) > 0) {
                    JOptionPane.showMessageDialog(this, "Start Date cannot be greater than deadline date", "Date Error", JOptionPane.ERROR_MESSAGE);
                    projectsTable.setValueAt(oldStartDate, row, column);
                    break;
                }
                try {
                    ProjectsDB.updateStartDate(projectID, newStartDate);
                } catch (SQLException ex) {
                    projectsTable.setValueAt(oldStartDate, row, column);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                break;
            // For "Deadline" Column
            case 2:
                // This works but I don't know how
                // The old value's origin is LocalDate so maybe that's why
                LocalDate oldEndDate = (LocalDate) tcl.getOldValue();

                // Type-casting to LocalDate wierdly gets us a String first from getNewValue() which 
                // cannot be type-casted to LocalDate
                LocalDate newEndDate = LocalDate.parse(tcl.getNewValue().toString());
                LocalDate currentStartDate = LocalDate.parse(projectsTable.getValueAt(row, 1).toString());
                if (newEndDate.compareTo(currentStartDate) < 0) {
                    JOptionPane.showMessageDialog(this, "Deadline Date cannot be less than start date", "Date Error", JOptionPane.ERROR_MESSAGE);
                    projectsTable.setValueAt(oldEndDate, row, column);
                    break;
                }
                try {
                    ProjectsDB.updateEndDate(projectID, newEndDate);
                } catch (SQLException ex) {
                    projectsTable.setValueAt(oldEndDate, row, column);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                break;
            // For "Status" Column
            case 3:
                Status oldStatus = Status.getEnum(tcl.getOldValue().toString());
                Status newStatus = Status.getEnum(tcl.getNewValue().toString());
                try {
                    ProjectsDB.updateStatus(projectID, newStatus);
                } catch (SQLException ex) {
                    projectsTable.setValueAt(oldStatus, row, column);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                break;
            case 4:
                Priority oldPriority = Priority.getEnum(tcl.getOldValue().toString());
                Priority newPriority = Priority.getEnum(tcl.getNewValue().toString());
                try {
                    ProjectsDB.updatePriority(projectID, newPriority);
                } catch (SQLException ex) {
                    projectsTable.setValueAt(oldPriority, row, column);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                break;
        }
    }

    private void handleButtonsVisiblity() {
        infoBtn.setEnabled(true);
        if (projectsTable.getSelectedRows().length > 1) {
            showTasksBtn.setVisible(false);
            infoBtn.setEnabled(false);
        } else if (projectsTable.getSelectedRows().length == 1) {
            showTasksBtn.setVisible(true);
            deleteBtn.setEnabled(true);
        }
    }

    private void scanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanBtnActionPerformed
        refreshTable();
    }//GEN-LAST:event_scanBtnActionPerformed

    public void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) projectsTable.getModel();
        ArrayList<Project> projects = null;
        try {
            projects = ProjectsDB.getNewProjects();
            for (Project project : projects) {
                model.addRow(new Object[]{project.getTitle(), project.getStartDate(), project.getEndDate(), project.getStatus(), project.getPriority(), project.getId()});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void createProjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProjectBtnActionPerformed
        Window parentWindow = SwingUtilities.windowForComponent(this);
        Frame parentFrame = null;
        if (parentWindow instanceof Frame frame) {
            parentFrame = frame;
        }
        CreateProjectScreen screen1 = new CreateProjectScreen(parentFrame, true, this);
        screen1.pack();
        screen1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        screen1.setLocationRelativeTo(this);
        screen1.setVisible(true);
    }//GEN-LAST:event_createProjectBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the project(s)?", "Confirm Action", JOptionPane.YES_NO_OPTION);
        switch (option) {
            case JOptionPane.NO_OPTION:
                return;
        }
        ArrayList<Integer> projectIDs = new ArrayList<>();
        int[] rowIndices = projectsTable.getSelectedRows();
        StringBuilder managerProjectTitles = new StringBuilder();

        for (int rowIndex : rowIndices) {
            int projectID = (int) projectsTable.getModel().getValueAt(rowIndex, 5);
            if (CurrentSession.getAccountType().equals("Normal")) {
                try {
                    if (!(DatabaseUtils.checkPermission(projectID))) {
                        managerProjectTitles.append(projectsTable.getValueAt(rowIndex, 0)).append(", ");
                        continue;
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            projectIDs.add(projectID);
        }
        if (managerProjectTitles.length() > 0) {
            managerProjectTitles.setLength(managerProjectTitles.length() - 2); // Remove trailing comma and space
            JOptionPane.showMessageDialog(this, "You are not allowed to delete project(s): " + managerProjectTitles, "Permission Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            ProjectsDB.deleteProjects(projectIDs);
            DefaultTableModel model = (DefaultTableModel) projectsTable.getModel();

            for (int i = rowIndices.length - 1; i >= 0; i--) {
                model.removeRow(rowIndices[i]);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error deleting projects: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void showTasksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTasksBtnActionPerformed
        ProjectAndTasks parentPanel = (ProjectAndTasks) this.getParent();
        CardLayout cards = (CardLayout) parentPanel.getLayout();
        int projectID = (int) projectsTable.getModel().getValueAt(projectsTable.getSelectedRow(), 5);
        parentPanel.getTasksScreen().setProjectID(projectID);
        parentPanel.getTasksScreen().populateTable();
        cards.next(parentPanel);
    }//GEN-LAST:event_showTasksBtnActionPerformed

    private void clickHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickHandler
        int rowIndex = projectsTable.rowAtPoint(evt.getPoint());
        if (rowIndex < 0) {
            projectsTable.clearSelection();
            hintLbl.setVisible(false);
            showTasksBtn.setVisible(false);
            deleteBtn.setEnabled(false);
            infoBtn.setEnabled(false);
        } else {
            hintLbl.setVisible(true);
        }
    }//GEN-LAST:event_clickHandler

    private void infoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoBtnActionPerformed
        Window parentWindow = SwingUtilities.windowForComponent(this);
        Frame parentFrame = null;
        if (parentWindow instanceof Frame frame) {
            parentFrame = frame;
        }
        int rowIndex = projectsTable.getSelectedRow();
        int projectID = (int) projectsTable.getModel().getValueAt(rowIndex, 5);
        String title = (String) projectsTable.getValueAt(rowIndex, 0);
        String desc = "";
        try {
            desc = ProjectsDB.getDesc(projectID);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(parentFrame, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ProjectInfoScreen screen1 = new ProjectInfoScreen(parentFrame, true, projectID, title, desc);
        screen1.pack();
        screen1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        screen1.setLocationRelativeTo(this);
        screen1.setVisible(true);
    }//GEN-LAST:event_infoBtnActionPerformed

    private void populateTable() {
        if (DBConnectionManager.getConnection() == null) {
            System.err.println("Database connection is null");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) projectsTable.getModel();
        ArrayList<Project> projects = null;
        try {
            if ((projects = ProjectsDB.getProjects()) == null) {
                return;
            }
            for (Project project : projects) {
                model.addRow(new Object[]{project.getTitle(), project.getStartDate(), project.getEndDate(), project.getStatus(), project.getPriority(), project.getId()});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerPanel;
    private javax.swing.JButton createProjectBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel hintLbl;
    private javax.swing.JButton infoBtn;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable projectsTable;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton scanBtn;
    private javax.swing.JButton showTasksBtn;
    // End of variables declaration//GEN-END:variables
}
