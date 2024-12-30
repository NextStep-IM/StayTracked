/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import customexceptions.FailureException;
import customexceptions.InvalidDateException;
import db.AccountsDb;
import db.ProjectsDB;
import helper.CurrentSession;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.NormalAccount;
import model.Priority;
import model.Project;
import model.Status;

/**
 *
 * @author samtheradiant
 */
public class CreateProjectScreen extends javax.swing.JDialog {

    ProjectsScreen obj;

    /**
     * Creates new form CreateProjectScreen
     *
     * @param parent
     * @param modal
     * @param obj
     */
    public CreateProjectScreen(java.awt.Frame parent, boolean modal, ProjectsScreen obj) {
        super(parent, modal);
        this.obj = obj;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        descLbl = new javax.swing.JLabel();
        startDateLbl = new javax.swing.JLabel();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        //startDateChooser.setDateFormatString("dd-MM-yyyy");

        for (Component c : startDateChooser.getComponents()) {
            ((JComponent) c).setBackground(new Color(40, 40, 39));
        }

        // JComponent editorUI = startDateChooser.getDateEditor().getUiComponent();
        // editorUI.setForeground(new Color(221, 255, 255));
        endDateLbl = new javax.swing.JLabel();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        // endDateChooser.setDateFormatString("dd-mm-yyyy");

        for (Component c : endDateChooser.getComponents()) {
            ((JComponent) c).setBackground(new Color(40, 40, 39));
        }
        okButton = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        descTextArea = new javax.swing.JTextArea();
        statusLbl = new javax.swing.JLabel();
        statusComBox = new javax.swing.JComboBox<>();
        priorityLbl = new javax.swing.JLabel();
        priorityComBox = new javax.swing.JComboBox<>();
        membersLbl = new javax.swing.JLabel();
        membersComBox = new javax.swing.JComboBox<>();
        listScrollPane = new javax.swing.JScrollPane();
        selectedMembersList = new javax.swing.JList<>();
        selecetedMembersLbl = new javax.swing.JLabel();
        addMemberBtn = new javax.swing.JButton();
        deleteMemberBtn = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create Project");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 25, 34));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleLbl.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(221, 255, 255));
        titleLbl.setText("Title:");

        titleField.setBackground(new java.awt.Color(40, 40, 39));
        titleField.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        titleField.setForeground(new java.awt.Color(221, 255, 255));
        titleField.setCaretColor(new java.awt.Color(221, 255, 255));

        descLbl.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        descLbl.setForeground(new java.awt.Color(221, 255, 255));
        descLbl.setText("Description:");

        startDateLbl.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        startDateLbl.setForeground(new java.awt.Color(221, 255, 255));
        startDateLbl.setText("Start Date:");

        startDateChooser.setBackground(new java.awt.Color(40, 40, 39));
        startDateChooser.setForeground(new java.awt.Color(221, 255, 255));
        startDateChooser.setDateFormatString("yyyy-MM-dd");
        startDateChooser.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N

        endDateLbl.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        endDateLbl.setForeground(new java.awt.Color(221, 255, 255));
        endDateLbl.setText("End Date:");

        endDateChooser.setBackground(new java.awt.Color(40, 40, 39));
        endDateChooser.setDateFormatString("yyyy-MM-dd");
        endDateChooser.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N

        okButton.setBackground(new java.awt.Color(45, 168, 216));
        okButton.setForeground(new java.awt.Color(21, 25, 34));
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(45, 168, 216));
        cancelBtn.setForeground(new java.awt.Color(21, 25, 34));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        descTextArea.setBackground(new java.awt.Color(40, 40, 39));
        descTextArea.setColumns(20);
        descTextArea.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        descTextArea.setForeground(new java.awt.Color(221, 255, 255));
        descTextArea.setRows(5);
        descTextArea.setCaretColor(new java.awt.Color(221, 255, 255));
        jScrollPane2.setViewportView(descTextArea);

        statusLbl.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        statusLbl.setForeground(new java.awt.Color(221, 255, 255));
        statusLbl.setText("Status:");

        statusComBox.setBackground(new java.awt.Color(40, 40, 39));
        statusComBox.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        statusComBox.setForeground(new java.awt.Color(221, 255, 255));
        statusComBox.setModel(new DefaultComboBoxModel<>(Status.values()));

        priorityLbl.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        priorityLbl.setForeground(new java.awt.Color(221, 255, 255));
        priorityLbl.setText("Priority:");

        priorityComBox.setBackground(new java.awt.Color(40, 40, 39));
        priorityComBox.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        priorityComBox.setForeground(new java.awt.Color(221, 255, 255));
        priorityComBox.setModel(new DefaultComboBoxModel<>(Priority.values()));

        membersLbl.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        membersLbl.setForeground(new java.awt.Color(221, 255, 255));
        membersLbl.setText("Project Members:");

        membersComBox.setBackground(new java.awt.Color(40, 40, 39));
        membersComBox.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        membersComBox.setForeground(new java.awt.Color(221, 255, 255));
        membersComBox.setModel(new DefaultComboBoxModel<>(this.getUserNames())
        );
        membersComBox.setToolTipText("Select members to assign to the project");
        membersComBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyHandler(evt);
            }
        });

        selectedMembersList.setBackground(new java.awt.Color(40, 40, 39));
        selectedMembersList.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        selectedMembersList.setForeground(new java.awt.Color(221, 255, 255));
        selectedMembersList.setModel(new DefaultListModel<String>()
        );
        selectedMembersList.setFocusable(false);
        selectedMembersList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                handleDeleteBtn(evt);
            }
        });
        listScrollPane.setViewportView(selectedMembersList);

        selecetedMembersLbl.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        selecetedMembersLbl.setForeground(new java.awt.Color(221, 255, 255));
        selecetedMembersLbl.setText("Selected Members:");

        addMemberBtn.setBackground(new java.awt.Color(45, 168, 216));
        addMemberBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plus-black.png"))); // NOI18N
        addMemberBtn.setBorderPainted(false);
        addMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberBtnActionPerformed(evt);
            }
        });

        deleteMemberBtn.setBackground(new java.awt.Color(45, 168, 216));
        deleteMemberBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trash-black.png"))); // NOI18N
        deleteMemberBtn.setBorderPainted(false);
        deleteMemberBtn.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trash-can-disabled-2.png"))); // NOI18N
        deleteMemberBtn.setEnabled(false);
        deleteMemberBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trash-pressed.png"))); // NOI18N
        deleteMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMemberBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(okButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelBtn)
                .addGap(196, 196, 196))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(descLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priorityComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(statusLbl, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(startDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(endDateLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(endDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addComponent(statusComBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priorityLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addMemberBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteMemberBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(startDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(membersComBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(membersLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listScrollPane)
                            .addComponent(selecetedMembersLbl))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(descLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membersLbl)
                    .addComponent(startDateLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membersComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(endDateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(statusLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(priorityLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addMemberBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selecetedMembersLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteMemberBtn))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        if (CurrentSession.getAccountType().equalsIgnoreCase("Normal")) {
            membersLbl.setVisible(false);
            membersComBox.setVisible(false);
            selecetedMembersLbl.setVisible(false);
            selectedMembersList.setVisible(false);
            listScrollPane.setVisible(false);
            addMemberBtn.setVisible(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void handleDeleteBtn(ListSelectionEvent evt) {
        if (selectedMembersList.getSelectedIndices().length > 0) {
            deleteMemberBtn.setEnabled(true);
        }
    }

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        // For Strings
        String title = titleField.getText();
        if (title.isEmpty()) {
            title = "Untitled";
        }
        String desc = descTextArea.getText();

        // For LocalDates
        LocalDate startDate = LocalDate.ofInstant(startDateChooser.getDate().toInstant(), ZoneId.systemDefault());
        // Set start date to current date if user leaves the field empty
        if (startDate == null) {
            startDate = LocalDate.now();
        }
        LocalDate endDate = null;
        try {
            endDate = LocalDate.ofInstant(endDateChooser.getDate().toInstant(), ZoneId.systemDefault());
            if (!(startDate.compareTo(endDate) < 0)) { // If start date is less than end date
                throw new InvalidDateException("End Date cannot be before than Start Date.");
            }
        } catch (InvalidDateException invD) {
            JOptionPane.showMessageDialog(rootPane, invD.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // For Enums
        Status projectStatus = Status.getEnum(statusComBox.getSelectedItem().toString());
        Priority projectPriority = Priority.getEnum(priorityComBox.getSelectedItem().toString());

        // For Project Members
        ArrayList<Integer> memberIDs = new ArrayList<>();
        if (CurrentSession.getAccountType().equalsIgnoreCase("Manager")) {
            int numMembers = selectedMembersList.getModel().getSize();
            selectedMembersList.setSelectionInterval(0, numMembers - 1);
            String[] selectedMembers = selectedMembersList.getSelectedValuesList().toArray(new String[numMembers]);
            for (String userName : selectedMembers) {
                try {
                    for (NormalAccount acc : AccountsDb.getTeamMembers(CurrentSession.getTeamID())) {
                        if (acc.getUserName().equals(userName)) {
                            // System.out.println("Username: " + userName);
                            memberIDs.add(acc.getAccountID());
                        }
                    }
                } catch (FailureException ex) {
                    System.out.println(ex.getMessage());
                    return;
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        Project project = null;
        if (memberIDs.isEmpty()) {
            project = new Project(title, desc, projectStatus, startDate, endDate, projectPriority);
        } else {
//            System.out.println("Member IDs are not empty");
//            for (int id : memberIDs) {
//                System.out.println("Member IDs: " + id);
//            }
            project = new Project(title, desc, projectStatus, startDate, endDate, projectPriority, memberIDs);
        }
        try {
            ProjectsDB.save(project);
        } catch (FailureException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        obj.refreshTable();
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void keyHandler(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyHandler
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addSelectedMember();
        }
    }//GEN-LAST:event_keyHandler

    private void addMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberBtnActionPerformed
        addSelectedMember();
    }//GEN-LAST:event_addMemberBtnActionPerformed

    private void deleteMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMemberBtnActionPerformed
        int selectedIndex = selectedMembersList.getSelectedIndex();
        DefaultListModel model = (DefaultListModel) selectedMembersList.getModel();
        model.remove(selectedIndex);
    }//GEN-LAST:event_deleteMemberBtnActionPerformed

    private void addSelectedMember() {
        if (membersComBox.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Please select a member.", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultListModel model = (DefaultListModel) selectedMembersList.getModel();
        String userName = (String) membersComBox.getSelectedItem();
        // System.out.println("Username: " + userName);
        if (model.contains(userName)) {
            return;
        }
        model.addElement(userName);
    }

    private String[] getUserNames() {
        ArrayList<String> userNames = new ArrayList<>();
        try {
            for (NormalAccount acc : AccountsDb.getTeamMembers(CurrentSession.getTeamID())) {
                userNames.add(acc.getUserName());
            }
        } catch (FailureException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        return userNames.toArray(new String[userNames.size()]);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemberBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteMemberBtn;
    private javax.swing.JLabel descLbl;
    private javax.swing.JTextArea descTextArea;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JLabel endDateLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane listScrollPane;
    private javax.swing.JComboBox<String> membersComBox;
    private javax.swing.JLabel membersLbl;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox<Priority> priorityComBox;
    private javax.swing.JLabel priorityLbl;
    private javax.swing.JLabel selecetedMembersLbl;
    private javax.swing.JList<String> selectedMembersList;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JLabel startDateLbl;
    private javax.swing.JComboBox<Status> statusComBox;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
