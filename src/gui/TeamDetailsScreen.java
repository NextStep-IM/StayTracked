
package gui;

import customexceptions.FailureException;
import db.AccountsDb;
import helper.CurrentSession;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.NormalAccount;

/**
 *
 * @author i c
 */
public class TeamDetailsScreen extends javax.swing.JPanel {

    /**
     * Creates new form TeamDetailsScreen
     */
    public TeamDetailsScreen() {
        initComponents();
        //Table header color
        JTableHeader tableHeader = tableTeamMembers.getTableHeader();
        tableHeader.setBackground(new Color(45,168,216));
        tableHeader.setForeground(new Color(21,25,34));
        
     
        //initially hide these 
        txtTeamName.setVisible(false);
        updateTeamNameBtn.setVisible(false);

        //set text according to current session
        txtTeamName.setText(CurrentSession.getTeamName());
        lblTeamrName.setText(CurrentSession.getTeamName());
        
        if(CurrentSession.getAccountType().equalsIgnoreCase("manager")){
            removeBtn.setVisible(true);
            addTeamMemberBtn.setVisible(true);
            editTeamNameBtn.setVisible(true);
        }
        else{
            removeBtn.setVisible(false);
            addTeamMemberBtn.setVisible(false);
            editTeamNameBtn.setVisible(false);
        }
        //populate table 
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTeamName = new javax.swing.JTextField();
        updateTeamNameBtn = new javax.swing.JButton();
        editTeamNameBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTeamrName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTeamMembers = new javax.swing.JTable();
        addTeamMemberBtn = new javax.swing.JButton();
        lblTeamNameError = new javax.swing.JLabel();
        removeBtn = new javax.swing.JButton();
        lblTeamMembersError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(21, 25, 34));
        setMinimumSize(new java.awt.Dimension(1000, 720));
        setLayout(null);

        txtTeamName.setBackground(new java.awt.Color(21, 25, 34));
        txtTeamName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTeamName.setForeground(new java.awt.Color(204, 204, 204));
        txtTeamName.setText("Team Name");
        txtTeamName.setBorder(null);
        txtTeamName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTeamName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtTeamName.setOpaque(true);
        add(txtTeamName);
        txtTeamName.setBounds(630, 140, 270, 30);

        updateTeamNameBtn.setBackground(new java.awt.Color(45, 168, 216));
        updateTeamNameBtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        updateTeamNameBtn.setForeground(new java.awt.Color(21, 25, 34));
        updateTeamNameBtn.setText("Update");
        updateTeamNameBtn.setBorder(null);
        updateTeamNameBtn.setMinimumSize(new java.awt.Dimension(80, 17));
        updateTeamNameBtn.setPreferredSize(new java.awt.Dimension(80, 17));
        updateTeamNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTeamNameBtnActionPerformed(evt);
            }
        });
        add(updateTeamNameBtn);
        updateTeamNameBtn.setBounds(820, 180, 80, 23);

        editTeamNameBtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        editTeamNameBtn.setForeground(new java.awt.Color(45, 168, 216));
        editTeamNameBtn.setText("Edit");
        editTeamNameBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 168, 216), 1, true));
        editTeamNameBtn.setContentAreaFilled(false);
        editTeamNameBtn.setMinimumSize(new java.awt.Dimension(60, 17));
        editTeamNameBtn.setPreferredSize(new java.awt.Dimension(60, 17));
        editTeamNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTeamNameBtnActionPerformed(evt);
            }
        });
        add(editTeamNameBtn);
        editTeamNameBtn.setBounds(910, 180, 60, 23);

        jSeparator2.setMaximumSize(new java.awt.Dimension(32767, 2));
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 2));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 2));
        add(jSeparator2);
        jSeparator2.setBounds(30, 170, 939, 10);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Team Name");
        add(jLabel5);
        jLabel5.setBounds(30, 140, 102, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 168, 216));
        jLabel2.setText("TEAM DETAILS");
        add(jLabel2);
        jLabel2.setBounds(30, 50, 250, 48);

        jSeparator1.setForeground(new java.awt.Color(45, 168, 216));
        add(jSeparator1);
        jSeparator1.setBounds(30, 100, 939, 10);

        lblTeamrName.setBackground(new java.awt.Color(21, 25, 34));
        lblTeamrName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTeamrName.setForeground(new java.awt.Color(204, 204, 204));
        lblTeamrName.setText("Team Name");
        add(lblTeamrName);
        lblTeamrName.setBounds(630, 145, 270, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 168, 216));
        jLabel3.setText("TEAM MEMBERS");
        add(jLabel3);
        jLabel3.setBounds(30, 200, 330, 48);

        jSeparator3.setForeground(new java.awt.Color(45, 168, 216));
        add(jSeparator3);
        jSeparator3.setBounds(30, 250, 939, 10);

        tableTeamMembers.setBackground(new java.awt.Color(21, 25, 34));
        tableTeamMembers.setForeground(new java.awt.Color(221, 255, 255));
        tableTeamMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Contact", "Email"
            }
        ));
        tableTeamMembers.setGridColor(new java.awt.Color(221, 255, 255));
        tableTeamMembers.setInheritsPopupMenu(true);
        tableTeamMembers.setShowGrid(true);
        jScrollPane1.setViewportView(tableTeamMembers);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 940, 402);

        addTeamMemberBtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        addTeamMemberBtn.setForeground(new java.awt.Color(45, 168, 216));
        addTeamMemberBtn.setText("Add Member");
        addTeamMemberBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 168, 216), 1, true));
        addTeamMemberBtn.setContentAreaFilled(false);
        addTeamMemberBtn.setMinimumSize(new java.awt.Dimension(60, 17));
        addTeamMemberBtn.setPreferredSize(new java.awt.Dimension(60, 17));
        addTeamMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeamMemberBtnActionPerformed(evt);
            }
        });
        add(addTeamMemberBtn);
        addTeamMemberBtn.setBounds(860, 690, 110, 23);

        lblTeamNameError.setForeground(new java.awt.Color(237, 60, 63));
        add(lblTeamNameError);
        lblTeamNameError.setBounds(30, 180, 780, 20);

        removeBtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        removeBtn.setForeground(new java.awt.Color(255, 0, 0));
        removeBtn.setText("Remove Member");
        removeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        removeBtn.setContentAreaFilled(false);
        removeBtn.setMinimumSize(new java.awt.Dimension(60, 17));
        removeBtn.setPreferredSize(new java.awt.Dimension(60, 17));
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        add(removeBtn);
        removeBtn.setBounds(730, 690, 120, 23);

        lblTeamMembersError.setForeground(new java.awt.Color(237, 60, 63));
        add(lblTeamMembersError);
        lblTeamMembersError.setBounds(320, 220, 650, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void updateTeamNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTeamNameBtnActionPerformed
        // TODO add your handling code here:
        String newTeamName = txtTeamName.getText();
        lblTeamNameError.setText("");
        //add a function to modify username of current logined user
        try {
            AccountsDb.updateTeamName(CurrentSession.getTeamID(), newTeamName);

            //set text of label again
            lblTeamrName.setText(CurrentSession.getTeamName());

        } catch (FailureException fe) {
            lblTeamNameError.setText(fe.getMessage());
        }

        //again hide update button , txtField and show edit button, label
        lblTeamrName.setVisible(true);
        editTeamNameBtn.setVisible(true);
        txtTeamName.setVisible(false);
        updateTeamNameBtn.setVisible(false);

    }//GEN-LAST:event_updateTeamNameBtnActionPerformed

    private void editTeamNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTeamNameBtnActionPerformed
        // TODO add your handling code here:
        lblTeamrName.setVisible(false);
        editTeamNameBtn.setVisible(false);
        txtTeamName.setVisible(true);
        updateTeamNameBtn.setVisible(true);
    }//GEN-LAST:event_editTeamNameBtnActionPerformed

    private void addTeamMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeamMemberBtnActionPerformed
        // TODO add your handling code here:
        AddTeamMemberDialog dialog = new AddTeamMemberDialog(null, true, this); //When you add it to mainScreen , change null to this
        dialog.setVisible(true);
    }//GEN-LAST:event_addTeamMemberBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        String memberEmail = (String)tableTeamMembers.getValueAt(tableTeamMembers.getSelectedRow(), 3);
        try{
            AccountsDb.removeTeamMember(memberEmail);
            lblTeamMembersError.setText(""); //empty label if it was not empty before
        }
        catch(FailureException fe){
            lblTeamMembersError.setText(fe.getMessage());
            
        }
        
        
        
       populateTable(); //refresh table
    }//GEN-LAST:event_removeBtnActionPerformed

    
    //Method to populate table
    public void populateTable(){
        lblTeamMembersError.setText("");
        DefaultTableModel model = (DefaultTableModel)tableTeamMembers.getModel();
        //delete all existing rows
        model.setRowCount(0);

        ArrayList<NormalAccount> members = null;
        try{
            members = AccountsDb.getTeamMembers(CurrentSession.getTeamID());
            for (NormalAccount member : members){
                model.addRow(new Object[]{member.getFirstName()+" "+member.getLastName(), member.getUserName(), member.getContactNum(), member.getEmail()});
            }
        }catch (FailureException fe){
            lblTeamMembersError.setText(fe.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTeamMemberBtn;
    private javax.swing.JButton editTeamNameBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblTeamMembersError;
    private javax.swing.JLabel lblTeamNameError;
    private javax.swing.JLabel lblTeamrName;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTable tableTeamMembers;
    private javax.swing.JTextField txtTeamName;
    private javax.swing.JButton updateTeamNameBtn;
    // End of variables declaration//GEN-END:variables
}
