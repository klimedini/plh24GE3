/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gr.eap.myteam.plh24ge3.GuiGe3;

import javax.swing.JOptionPane;

/**
 *
 * @author gnikol
 */
public class DataView extends javax.swing.JFrame {

    /**
     * Creates new form DataView
     */
    public DataView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteCityData = new javax.swing.JButton();
        processCityData = new javax.swing.JButton();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        tempLabel = new javax.swing.JTextField();
        humidityLabel = new javax.swing.JTextField();
        windLabel = new javax.swing.JTextField();
        uvLabel = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deleteCityData.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        deleteCityData.setForeground(new java.awt.Color(0, 153, 153));
        deleteCityData.setText("Διαγραφή Δεδομένων πόλης");
        deleteCityData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCityDataActionPerformed(evt);
            }
        });

        processCityData.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        processCityData.setForeground(new java.awt.Color(0, 153, 153));
        processCityData.setText("Επεξεργασία Δεδομένων Πόλης");
        processCityData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processCityDataActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        back.setForeground(new java.awt.Color(0, 153, 153));
        back.setText("<-Πίσω");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 153, 153));
        exit.setText("Έξοδος");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        tempLabel.setEditable(false);

        humidityLabel.setEditable(false);

        windLabel.setEditable(false);

        uvLabel.setEditable(false);

        descriptionLabel.setEditable(false);

        jButton1.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Θερμοκρασία");

        jButton2.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Υγρασία");

        jButton3.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Ταχ. Ανέμου");

        jButton4.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Δείκτης UV");

        jButton5.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText("Λεκτική Πρόγνωση Καιρού");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("M E N U");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(12, 12, 12)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tempLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(humidityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(windLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(back)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(processCityData, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteCityData, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(humidityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(windLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processCityData)
                    .addComponent(deleteCityData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteCityDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCityDataActionPerformed
        JOptionPane.showConfirmDialog(this,"Are you sure you want to delete?","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );
    }//GEN-LAST:event_deleteCityDataActionPerformed

    private void processCityDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processCityDataActionPerformed
        
    }//GEN-LAST:event_processCityDataActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new DataMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton deleteCityData;
    private javax.swing.JTextField descriptionLabel;
    private javax.swing.JButton exit;
    private javax.swing.JTextField humidityLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton processCityData;
    private javax.swing.JTextField tempLabel;
    private javax.swing.JTextField uvLabel;
    private javax.swing.JTextField windLabel;
    // End of variables declaration//GEN-END:variables
}