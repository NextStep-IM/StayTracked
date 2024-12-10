/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import model.currentSession;

/**
 *
 * @author i c
 */
public class ProfileScreen extends javax.swing.JPanel {

    /**
     * Creates new form ProfileScreen
     */
    public ProfileScreen() {
        initComponents();
        
        //Initially hide textFields
        txtContact.setVisible(false);
        txtUserName.setVisible(false);
        txtLastName1.setVisible(false);
        txtFirstName1.setVisible(false);
        txtEmail1.setVisible(false);
        
        //Initially hide update buttons
        updateEmailBtn.setVisible(false);
        updateFirstNameBtn.setVisible(false);
        updateLastNameBtn.setVisible(false);
        updateUserNameBtn.setVisible(false);
        updatecontactBtn1.setVisible(false);
        
        
        
        //Set labels according to current User
        lblCurrentUserName.setText(currentSession.getUserName());
        lblCurrentFirstName.setText(currentSession.getFirstName());
        lblCurrentLastName.setText(currentSession.getLastName());
        lblCurrentEmail.setText(currentSession.getEmail());
        lblCurrentContact.setText(currentSession.getContact());
        
        //Set text of textFields according to current User
        txtUserName.setText(currentSession.getUserName());
        txtFirstName1.setText(currentSession.getFirstName());
        txtLastName1.setText(currentSession.getLastName());
        txtEmail1.setText(currentSession.getEmail());
        txtContact.setText(currentSession.getContact());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblCurrentContact = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        JLabel10 = new javax.swing.JLabel();
        editUserNamebtn = new javax.swing.JButton();
        updateUserNameBtn = new javax.swing.JButton();
        updateFirstNameBtn = new javax.swing.JButton();
        editFirstNamebtn = new javax.swing.JButton();
        updateLastNameBtn = new javax.swing.JButton();
        editLastNamebtn = new javax.swing.JButton();
        updateEmailBtn = new javax.swing.JButton();
        editEmailbtn = new javax.swing.JButton();
        changePassBtn = new javax.swing.JButton();
        editContactbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblCurrentUserName = new javax.swing.JLabel();
        lblCurrentFirstName = new javax.swing.JLabel();
        lblCurrentLastName = new javax.swing.JLabel();
        lblCurrentEmail = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        updatecontactBtn1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtFirstName1 = new javax.swing.JTextField();
        txtLastName1 = new javax.swing.JTextField();
        txtEmail1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(21, 25, 34));
        setForeground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1000, 720));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 168, 216));
        jLabel2.setText("PERSONAL DETAILS");
        add(jLabel2);
        jLabel2.setBounds(30, 50, 334, 48);

        jSeparator1.setForeground(new java.awt.Color(45, 168, 216));
        add(jSeparator1);
        jSeparator1.setBounds(30, 100, 939, 10);

        lblCurrentContact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCurrentContact.setForeground(new java.awt.Color(204, 204, 204));
        lblCurrentContact.setText("contact");
        add(lblCurrentContact);
        lblCurrentContact.setBounds(630, 470, 270, 20);

        jSeparator2.setMaximumSize(new java.awt.Dimension(32767, 2));
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 2));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 2));
        add(jSeparator2);
        jSeparator2.setBounds(30, 170, 939, 10);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("First Name");
        add(jLabel4);
        jLabel4.setBounds(30, 220, 91, 25);
        add(jSeparator3);
        jSeparator3.setBounds(30, 246, 939, 10);
        add(jSeparator4);
        jSeparator4.setBounds(30, 329, 939, 10);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Email");
        add(jLabel6);
        jLabel6.setBounds(30, 380, 46, 20);
        add(jSeparator5);
        jSeparator5.setBounds(30, 410, 939, 10);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Password");
        add(jLabel7);
        jLabel7.setBounds(30, 610, 80, 25);
        add(jSeparator6);
        jSeparator6.setBounds(30, 495, 939, 10);

        JLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLabel10.setForeground(new java.awt.Color(204, 204, 204));
        JLabel10.setText("Last Name");
        add(JLabel10);
        JLabel10.setBounds(30, 300, 89, 25);

        editUserNamebtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        editUserNamebtn.setForeground(new java.awt.Color(45, 168, 216));
        editUserNamebtn.setText("Edit");
        editUserNamebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 168, 216), 1, true));
        editUserNamebtn.setContentAreaFilled(false);
        editUserNamebtn.setMinimumSize(new java.awt.Dimension(60, 17));
        editUserNamebtn.setPreferredSize(new java.awt.Dimension(60, 17));
        editUserNamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserNamebtnActionPerformed(evt);
            }
        });
        add(editUserNamebtn);
        editUserNamebtn.setBounds(900, 180, 60, 23);

        updateUserNameBtn.setBackground(new java.awt.Color(45, 168, 216));
        updateUserNameBtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        updateUserNameBtn.setForeground(new java.awt.Color(21, 25, 34));
        updateUserNameBtn.setText("Update");
        updateUserNameBtn.setBorder(null);
        updateUserNameBtn.setMinimumSize(new java.awt.Dimension(80, 17));
        updateUserNameBtn.setPreferredSize(new java.awt.Dimension(80, 17));
        updateUserNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserNameBtnActionPerformed(evt);
            }
        });
        add(updateUserNameBtn);
        updateUserNameBtn.setBounds(810, 180, 80, 23);

        updateFirstNameBtn.setBackground(new java.awt.Color(45, 168, 216));
        updateFirstNameBtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        updateFirstNameBtn.setForeground(new java.awt.Color(21, 25, 34));
        updateFirstNameBtn.setText("Update");
        updateFirstNameBtn.setBorder(null);
        updateFirstNameBtn.setMinimumSize(new java.awt.Dimension(80, 17));
        updateFirstNameBtn.setPreferredSize(new java.awt.Dimension(80, 17));
        updateFirstNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFirstNameBtnActionPerformed(evt);
            }
        });
        add(updateFirstNameBtn);
        updateFirstNameBtn.setBounds(812, 257, 80, 23);

        editFirstNamebtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        editFirstNamebtn.setForeground(new java.awt.Color(45, 168, 216));
        editFirstNamebtn.setText("Edit");
        editFirstNamebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 168, 216), 1, true));
        editFirstNamebtn.setContentAreaFilled(false);
        editFirstNamebtn.setMinimumSize(new java.awt.Dimension(60, 17));
        editFirstNamebtn.setPreferredSize(new java.awt.Dimension(60, 17));
        editFirstNamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFirstNamebtnActionPerformed(evt);
            }
        });
        add(editFirstNamebtn);
        editFirstNamebtn.setBounds(898, 257, 60, 23);

        updateLastNameBtn.setBackground(new java.awt.Color(45, 168, 216));
        updateLastNameBtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        updateLastNameBtn.setForeground(new java.awt.Color(21, 25, 34));
        updateLastNameBtn.setText("Update");
        updateLastNameBtn.setBorder(null);
        updateLastNameBtn.setMinimumSize(new java.awt.Dimension(80, 17));
        updateLastNameBtn.setPreferredSize(new java.awt.Dimension(80, 17));
        add(updateLastNameBtn);
        updateLastNameBtn.setBounds(812, 340, 80, 23);

        editLastNamebtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        editLastNamebtn.setForeground(new java.awt.Color(45, 168, 216));
        editLastNamebtn.setText("Edit");
        editLastNamebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 168, 216), 1, true));
        editLastNamebtn.setContentAreaFilled(false);
        editLastNamebtn.setMinimumSize(new java.awt.Dimension(60, 17));
        editLastNamebtn.setPreferredSize(new java.awt.Dimension(60, 17));
        editLastNamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLastNamebtnActionPerformed(evt);
            }
        });
        add(editLastNamebtn);
        editLastNamebtn.setBounds(898, 340, 60, 23);

        updateEmailBtn.setBackground(new java.awt.Color(45, 168, 216));
        updateEmailBtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        updateEmailBtn.setForeground(new java.awt.Color(21, 25, 34));
        updateEmailBtn.setText("Update");
        updateEmailBtn.setBorder(null);
        updateEmailBtn.setMinimumSize(new java.awt.Dimension(80, 17));
        updateEmailBtn.setPreferredSize(new java.awt.Dimension(80, 17));
        add(updateEmailBtn);
        updateEmailBtn.setBounds(812, 423, 80, 23);

        editEmailbtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        editEmailbtn.setForeground(new java.awt.Color(45, 168, 216));
        editEmailbtn.setText("Edit");
        editEmailbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 168, 216), 1, true));
        editEmailbtn.setContentAreaFilled(false);
        editEmailbtn.setMinimumSize(new java.awt.Dimension(60, 17));
        editEmailbtn.setPreferredSize(new java.awt.Dimension(60, 17));
        editEmailbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmailbtnActionPerformed(evt);
            }
        });
        add(editEmailbtn);
        editEmailbtn.setBounds(898, 423, 60, 23);

        changePassBtn.setBackground(new java.awt.Color(45, 168, 216));
        changePassBtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        changePassBtn.setForeground(new java.awt.Color(21, 25, 34));
        changePassBtn.setText("Change Password");
        changePassBtn.setBorder(null);
        changePassBtn.setMinimumSize(new java.awt.Dimension(80, 17));
        changePassBtn.setPreferredSize(new java.awt.Dimension(80, 17));
        add(changePassBtn);
        changePassBtn.setBounds(810, 610, 150, 23);

        editContactbtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        editContactbtn.setForeground(new java.awt.Color(45, 168, 216));
        editContactbtn.setText("Edit");
        editContactbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 168, 216), 1, true));
        editContactbtn.setContentAreaFilled(false);
        editContactbtn.setMinimumSize(new java.awt.Dimension(60, 17));
        editContactbtn.setPreferredSize(new java.awt.Dimension(60, 17));
        editContactbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editContactbtnActionPerformed(evt);
            }
        });
        add(editContactbtn);
        editContactbtn.setBounds(897, 511, 60, 23);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Username");
        add(jLabel5);
        jLabel5.setBounds(30, 140, 85, 25);

        lblCurrentUserName.setBackground(new java.awt.Color(21, 25, 34));
        lblCurrentUserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCurrentUserName.setForeground(new java.awt.Color(204, 204, 204));
        lblCurrentUserName.setText("Username");
        add(lblCurrentUserName);
        lblCurrentUserName.setBounds(630, 145, 270, 20);

        lblCurrentFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCurrentFirstName.setForeground(new java.awt.Color(204, 204, 204));
        lblCurrentFirstName.setText("Firstname");
        add(lblCurrentFirstName);
        lblCurrentFirstName.setBounds(630, 220, 270, 25);

        lblCurrentLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCurrentLastName.setForeground(new java.awt.Color(204, 204, 204));
        lblCurrentLastName.setText("lastname");
        add(lblCurrentLastName);
        lblCurrentLastName.setBounds(630, 300, 270, 25);

        lblCurrentEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCurrentEmail.setForeground(new java.awt.Color(204, 204, 204));
        lblCurrentEmail.setText("email");
        add(lblCurrentEmail);
        lblCurrentEmail.setBounds(630, 380, 270, 25);

        jSeparator7.setForeground(new java.awt.Color(45, 168, 216));
        add(jSeparator7);
        jSeparator7.setBounds(30, 600, 939, 10);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 168, 216));
        jLabel3.setText("PASSWORD & SECURITY");
        add(jLabel3);
        jLabel3.setBounds(30, 550, 470, 48);

        updatecontactBtn1.setBackground(new java.awt.Color(45, 168, 216));
        updatecontactBtn1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        updatecontactBtn1.setForeground(new java.awt.Color(21, 25, 34));
        updatecontactBtn1.setText("Update");
        updatecontactBtn1.setBorder(null);
        updatecontactBtn1.setMinimumSize(new java.awt.Dimension(80, 17));
        updatecontactBtn1.setPreferredSize(new java.awt.Dimension(80, 17));
        add(updatecontactBtn1);
        updatecontactBtn1.setBounds(811, 511, 80, 23);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Contact Number");
        add(jLabel8);
        jLabel8.setBounds(30, 470, 140, 25);

        txtUserName.setBackground(new java.awt.Color(21, 25, 34));
        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(204, 204, 204));
        txtUserName.setText("Username");
        txtUserName.setBorder(null);
        txtUserName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUserName.setOpaque(true);
        add(txtUserName);
        txtUserName.setBounds(630, 140, 270, 30);

        txtContact.setBackground(new java.awt.Color(21, 25, 34));
        txtContact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtContact.setForeground(new java.awt.Color(204, 204, 204));
        txtContact.setText("contact");
        txtContact.setBorder(null);
        txtContact.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtContact.setOpaque(true);
        add(txtContact);
        txtContact.setBounds(630, 470, 330, 25);

        txtFirstName1.setBackground(new java.awt.Color(21, 25, 34));
        txtFirstName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFirstName1.setForeground(new java.awt.Color(204, 204, 204));
        txtFirstName1.setText("Firstname");
        txtFirstName1.setBorder(null);
        txtFirstName1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtFirstName1.setOpaque(true);
        add(txtFirstName1);
        txtFirstName1.setBounds(630, 220, 330, 20);

        txtLastName1.setBackground(new java.awt.Color(21, 25, 34));
        txtLastName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLastName1.setForeground(new java.awt.Color(204, 204, 204));
        txtLastName1.setText("lastname");
        txtLastName1.setBorder(null);
        txtLastName1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtLastName1.setOpaque(true);
        add(txtLastName1);
        txtLastName1.setBounds(630, 300, 330, 30);

        txtEmail1.setBackground(new java.awt.Color(21, 25, 34));
        txtEmail1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail1.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail1.setText("email");
        txtEmail1.setBorder(null);
        txtEmail1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtEmail1.setOpaque(true);
        add(txtEmail1);
        txtEmail1.setBounds(630, 380, 330, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void editUserNamebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserNamebtnActionPerformed
        // TODO add your handling code here:
        lblCurrentUserName.setVisible(false);
        editUserNamebtn.setVisible(false);
        txtUserName.setVisible(true);
        updateUserNameBtn.setVisible(true);
    }//GEN-LAST:event_editUserNamebtnActionPerformed

    private void editFirstNamebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFirstNamebtnActionPerformed
        // TODO add your handling code here:
        lblCurrentFirstName.setVisible(false);
        editFirstNamebtn.setVisible(false);
        txtFirstName1.setVisible(true);
        updateFirstNameBtn.setVisible(true);
    }//GEN-LAST:event_editFirstNamebtnActionPerformed

    private void editLastNamebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLastNamebtnActionPerformed
        // TODO add your handling code here:
        lblCurrentLastName.setVisible(false);
        editLastNamebtn.setVisible(false);
        txtLastName1.setVisible(true);
        updateLastNameBtn.setVisible(true);
    }//GEN-LAST:event_editLastNamebtnActionPerformed

    private void editEmailbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmailbtnActionPerformed
        // TODO add your handling code here:
        lblCurrentEmail.setVisible(false);
        editEmailbtn.setVisible(false);
        txtEmail1.setVisible(true);
        updateEmailBtn.setVisible(true);
    }//GEN-LAST:event_editEmailbtnActionPerformed

    private void editContactbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editContactbtnActionPerformed
        // TODO add your handling code here:
        lblCurrentContact.setVisible(false);
        editContactbtn.setVisible(false);
        txtContact.setVisible(true);
        updatecontactBtn1.setVisible(true);
    }//GEN-LAST:event_editContactbtnActionPerformed

    private void updateUserNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserNameBtnActionPerformed
        // TODO add your handling code here:
        String newUserName = txtUserName.getText();
        currentSession.setUserName(newUserName);
        
        //add a function to modify username of current logined user
        
        
        //set text of label again
        lblCurrentUserName.setText(newUserName);
        
        //again hide update button , txtField and show edit button, label
        lblCurrentUserName.setVisible(true);
        editUserNamebtn.setVisible(true);
        txtUserName.setVisible(false);
        updateUserNameBtn.setVisible(false);
        
        
    }//GEN-LAST:event_updateUserNameBtnActionPerformed

    private void updateFirstNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFirstNameBtnActionPerformed
        // TODO add your handling code here:
        String newFirstName = txtFirstName1.getText();
        currentSession.setFirstName(newFirstName);
        
        //add a function to modify username of current logined user
        
        
        //set text of label again
        lblCurrentFirstName.setText(newFirstName);
        
        //again hide update button , txtField and show edit button, label
        lblCurrentFirstName.setVisible(true);
        editFirstNamebtn.setVisible(true);
        txtFirstName1.setVisible(false);
        updateFirstNameBtn.setVisible(false);
    }//GEN-LAST:event_updateFirstNameBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel10;
    private javax.swing.JButton changePassBtn;
    private javax.swing.JButton editContactbtn;
    private javax.swing.JButton editEmailbtn;
    private javax.swing.JButton editFirstNamebtn;
    private javax.swing.JButton editLastNamebtn;
    private javax.swing.JButton editUserNamebtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblCurrentContact;
    private javax.swing.JLabel lblCurrentEmail;
    private javax.swing.JLabel lblCurrentFirstName;
    private javax.swing.JLabel lblCurrentLastName;
    private javax.swing.JLabel lblCurrentUserName;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtFirstName1;
    private javax.swing.JTextField txtLastName1;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JButton updateEmailBtn;
    private javax.swing.JButton updateFirstNameBtn;
    private javax.swing.JButton updateLastNameBtn;
    private javax.swing.JButton updateUserNameBtn;
    private javax.swing.JButton updatecontactBtn1;
    // End of variables declaration//GEN-END:variables
}
