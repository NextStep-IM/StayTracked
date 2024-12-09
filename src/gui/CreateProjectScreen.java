/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import com.formdev.flatlaf.FlatLightLaf;
import customexceptions.InvalidDateException;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.DataLayer;
import model.Priority;
import model.Project;
import model.Status;

/**
 *
 * @author samtheradiant
 */
public class CreateProjectScreen extends javax.swing.JDialog {

    /**
     * Creates new form CreateProjectScreen
     *
     * @param parent
     * @param modal
     */
    public CreateProjectScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        startDateChooser.setDateFormatString("dd-mm-yyyy");

        for (Component c : startDateChooser.getComponents()) {
            ((JComponent) c).setBackground(new Color(40, 40, 39));
        }

        endDateLbl = new javax.swing.JLabel();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        endDateChooser.setDateFormatString("dd-mm-yyyy");

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 25, 34));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleLbl.setForeground(new java.awt.Color(221, 255, 255));
        titleLbl.setText("Title:");

        titleField.setBackground(new java.awt.Color(40, 40, 39));
        titleField.setForeground(new java.awt.Color(221, 255, 255));
        titleField.setCaretColor(new java.awt.Color(221, 255, 255));
        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });

        descLbl.setForeground(new java.awt.Color(221, 255, 255));
        descLbl.setText("Description:");

        startDateLbl.setForeground(new java.awt.Color(221, 255, 255));
        startDateLbl.setText("Start Date:");

        startDateChooser.setBackground(new java.awt.Color(40, 40, 39));
        startDateChooser.setForeground(new java.awt.Color(221, 255, 255));

        endDateLbl.setForeground(new java.awt.Color(221, 255, 255));
        endDateLbl.setText("End Date:");

        endDateChooser.setBackground(new java.awt.Color(40, 40, 39));

        okButton.setBackground(new java.awt.Color(86, 86, 87));
        okButton.setForeground(new java.awt.Color(221, 255, 255));
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(86, 86, 87));
        cancelBtn.setForeground(new java.awt.Color(221, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        descTextArea.setBackground(new java.awt.Color(40, 40, 39));
        descTextArea.setColumns(20);
        descTextArea.setForeground(new java.awt.Color(221, 255, 255));
        descTextArea.setRows(5);
        descTextArea.setCaretColor(new java.awt.Color(221, 255, 255));
        jScrollPane2.setViewportView(descTextArea);

        statusLbl.setForeground(new java.awt.Color(221, 255, 255));
        statusLbl.setText("Status:");

        statusComBox.setBackground(new java.awt.Color(40, 40, 39));
        statusComBox.setForeground(new java.awt.Color(221, 255, 255));
        statusComBox.setModel(new DefaultComboBoxModel<>(Status.values()));

        priorityLbl.setForeground(new java.awt.Color(221, 255, 255));
        priorityLbl.setText("Priority:");

        priorityComBox.setBackground(new java.awt.Color(40, 40, 39));
        priorityComBox.setForeground(new java.awt.Color(221, 255, 255));
        priorityComBox.setModel(new DefaultComboBoxModel<>(Priority.values()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(descLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleField, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(okButton)
                                .addComponent(statusLbl, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(startDateLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(startDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(endDateLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(endDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addComponent(statusComBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priorityLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(cancelBtn)))
                    .addComponent(priorityComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(startDateLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(endDateLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(statusLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(priorityLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priorityComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelBtn))
                .addContainerGap())
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

    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleFieldActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        String title = titleField.getText();
        if (title.isEmpty()) {
            title = "Unknown";
        }
        String desc = descTextArea.getText();
        Date startDate = startDateChooser.getDate();
        // Set start date to current date if user leaves the field empty
        if (startDate == null) {
            startDate = new Date();
        }
        Date endDate = null;
        try {
            endDate = endDateChooser.getDate();
            if (!(startDate.compareTo(endDate) < 0)) {
                throw new InvalidDateException("End Date cannot be before than Start Date.");
            }
        } catch (InvalidDateException invD) {
            JOptionPane.showMessageDialog(rootPane, invD.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
        Status projectStatus = Status.getEnum(statusComBox.getSelectedItem().toString());
        Priority projectPriority = Priority.getEnum(priorityComBox.getSelectedItem().toString());
        Project project;
        if (endDate != null) {
            project = new Project(title, desc, projectStatus, startDate, endDate, projectPriority);
        } else {
            project = new Project(title, desc, projectStatus, startDate, projectPriority);
        }
        DataLayer.saveProjecttoDB(project);
    }//GEN-LAST:event_okButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateProjectScreen dialog = new CreateProjectScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel descLbl;
    private javax.swing.JTextArea descTextArea;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JLabel endDateLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox<Priority> priorityComBox;
    private javax.swing.JLabel priorityLbl;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JLabel startDateLbl;
    private javax.swing.JComboBox<Status> statusComBox;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
