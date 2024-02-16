package gr.eap.myteam.plh24ge3.GuiGe3;


import gr.eap.myteam.plh24ge3.GuiGe3.DataMenu;



public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();           
        this.setLocationRelativeTo(null);
        
    }   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        openDataMenu = new javax.swing.JButton();
        viewPrintStats = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        cityList = new javax.swing.JButton();
        dateList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("M E N U");

        openDataMenu.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        openDataMenu.setForeground(new java.awt.Color(0, 153, 153));
        openDataMenu.setText("Προβολή Δεδομένων Καιρού Πόλης");
        openDataMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDataMenuActionPerformed(evt);
            }
        });

        viewPrintStats.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        viewPrintStats.setForeground(new java.awt.Color(0, 153, 153));
        viewPrintStats.setText("Προβολή/Εκτύπωση Στατιστικών");
        viewPrintStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPrintStatsActionPerformed(evt);
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

        cityList.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        cityList.setForeground(new java.awt.Color(0, 153, 153));
        cityList.setText("Λίστα Πόλεων με Αναζήτηση Καιρού");
        cityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityListActionPerformed(evt);
            }
        });

        dateList.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        dateList.setForeground(new java.awt.Color(0, 153, 153));
        dateList.setText("Λίστα Ημ/νιών με Αναζήτηση Καιρού");
        dateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dateList, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(cityList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(openDataMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewPrintStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exit)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(200, 200, 200))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(openDataMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPrintStats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityListActionPerformed
        
    }//GEN-LAST:event_cityListActionPerformed

    private void dateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateListActionPerformed

    private void openDataMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDataMenuActionPerformed
        new DataMenu().setVisible(true);
        new MainMenu().dispose();
    }//GEN-LAST:event_openDataMenuActionPerformed

    private void viewPrintStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPrintStatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewPrintStatsActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.out.println("test exit");
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cityList;
    private javax.swing.JButton dateList;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton openDataMenu;
    private javax.swing.JButton viewPrintStats;
    // End of variables declaration//GEN-END:variables
}
