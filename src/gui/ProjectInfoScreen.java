/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import db.ProjectsDB;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author samtheradiant
 */
public class ProjectInfoScreen extends javax.swing.JDialog {

    private int projectID;
    private String desc;
    private String title;

    /**
     * Creates new form projectInfoScreen
     *
     * @param parent
     * @param modal
     * @param projectID
     * @param title
     * @param desc
     */
    public ProjectInfoScreen(java.awt.Frame parent, boolean modal, int projectID, String title, String desc) {
        super(parent, modal);
        this.projectID = projectID;
        this.desc = desc;
        this.title = title;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        descLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        editDescBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 25, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 455));

        titleLbl.setFont(new java.awt.Font("Myriad Pro", 3, 18)); // NOI18N
        titleLbl.setText(this.title);

        descLbl.setFont(new java.awt.Font("Myriad Pro", 1, 16)); // NOI18N
        descLbl.setText("Description:");

        descTextArea.setEditable(false);
        descTextArea.setBackground(new java.awt.Color(21, 25, 34));
        descTextArea.setColumns(20);
        descTextArea.setLineWrap(true);
        descTextArea.setRows(5);
        descTextArea.setText(this.desc);
        descTextArea.setWrapStyleWord(true);
        descTextArea.setFocusable(false);
        jScrollPane2.setViewportView(descTextArea);

        jButton1.setBackground(new java.awt.Color(21, 25, 34));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close-pressed.png"))); // NOI18N
        jButton1.setToolTipText("Close");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(45, 168, 216));
        cancelBtn.setForeground(new java.awt.Color(21, 25, 34));
        cancelBtn.setText("Cancel");
        cancelBtn.setVisible(false);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        okBtn.setBackground(new java.awt.Color(45, 168, 216));
        okBtn.setForeground(new java.awt.Color(21, 25, 34));
        okBtn.setText("Ok");
        okBtn.setVisible(false);
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        editDescBtn.setBackground(new java.awt.Color(21, 25, 34));
        editDescBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editDescBtn.setBorderPainted(false);
        editDescBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit-pressed.png"))); // NOI18N
        editDescBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDescBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(descLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editDescBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 499, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editDescBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(okBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editDescBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDescBtnActionPerformed
        if (!(editDescBtn.isSelected())) {
            editDescBtn.setSelected(true);
            descTextArea.setFocusable(true);
            descTextArea.setEditable(true);
            descTextArea.requestFocusInWindow();
            okBtn.setVisible(true);
            cancelBtn.setVisible(true);
        }
    }//GEN-LAST:event_editDescBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        String newDesc = descTextArea.getText();
        if (newDesc == null) {
            newDesc = "No description";
        }
        try {
            ProjectsDB.updateDesc(this.projectID, newDesc);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.dispose();
    }//GEN-LAST:event_okBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        if (editDescBtn.isSelected()) {
            descTextArea.setText(this.desc);
            descTextArea.setEditable(false);
            okBtn.setVisible(false);
            cancelBtn.setVisible(false);
            editDescBtn.setSelected(false);
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ProjectInfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ProjectInfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ProjectInfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ProjectInfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ProjectInfoScreen dialog = new ProjectInfoScreen(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel descLbl;
    private javax.swing.JTextArea descTextArea;
    private javax.swing.JButton editDescBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
