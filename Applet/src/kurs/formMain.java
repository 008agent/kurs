package kurs;

import javax.swing.JFileChooser;

public class formMain extends javax.swing.JFrame {


    /**
     * Creates new form formMain
     */
    public formMain() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBar = new javax.swing.JMenu();
        label_wage = new javax.swing.JLabel();
        label_expertize_id = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuOpen = new javax.swing.JMenuItem();
        menuConnect = new javax.swing.JCheckBoxMenuItem();
        menu_closeConn = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuShowHelp = new javax.swing.JMenuItem();

        MenuBar.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        menuFile.setText("File");

        menuOpen.setText("Attach Database file");
        menuOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuOpenMouseClicked(evt);
            }
        });
        menuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenActionPerformed(evt);
            }
        });
        menuFile.add(menuOpen);

        menuConnect.setSelected(true);
        menuConnect.setText("Open Connection");
        menuConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConnectActionPerformed(evt);
            }
        });
        menuFile.add(menuConnect);

        menu_closeConn.setText("Close Connection");
        menu_closeConn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_closeConnActionPerformed(evt);
            }
        });
        menuFile.add(menu_closeConn);

        menuExit.setText("Exit Application");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        jMenuBar1.add(menuFile);

        jMenu1.setText("Edit Dictionary");

        jMenuItem1.setText("Edit People");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        menuHelp.setText("Help");

        menuShowHelp.setText("Show Help");
        menuShowHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuShowHelpMouseClicked(evt);
            }
        });
        menuShowHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuShowHelpActionPerformed(evt);
            }
        });
        menuHelp.add(menuShowHelp);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_wage, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_expertize_id, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(704, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(label_wage)
                .addGap(70, 70, 70)
                .addComponent(label_expertize_id)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void menuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenActionPerformed
       JFileChooser fileopen = new JFileChooser();
    int ret = fileopen.showDialog(null, "Open SQLite DB file");                
    if (ret == JFileChooser.APPROVE_OPTION) 
    {
       Globals.FD_database = fileopen.getSelectedFile().getAbsolutePath();
       this.setTitle(Globals.FD_database);
    }
        //global_connection = new dbConn("C:\\sqlitemanager_win_32_64\\skrf.db3");
        //this.setTitle("Kurs project,3105,Ratnikov,Chuglov. Connection state = " + global_connection.get_connection_state());
    }//GEN-LAST:event_menuOpenActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
         System.exit(1);
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuOpenMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuOpenMouseClicked

    private void menuShowHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuShowHelpMouseClicked

    }//GEN-LAST:event_menuShowHelpMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void menu_closeConnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_closeConnActionPerformed
        
        Globals.global_connection.close_connection();
        this.setTitle("Kurs project,3105,Ratnikov,Chuglov. Connection state = " + Globals.global_connection.get_connection_state());
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_closeConnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        formEditPeople fep = new formEditPeople();
        fep.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConnectActionPerformed
        Globals.global_connection = new dbConn(Globals.FD_database);
        this.setTitle(Globals.FD_database + " Connected=" +Globals.global_connection.get_connection_state());
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConnectActionPerformed

    private void menuShowHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuShowHelpActionPerformed
        formHelp fh = new formHelp();
        fh.setAlwaysOnTop(true);
        fh.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuShowHelpActionPerformed

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
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuBar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel label_expertize_id;
    private javax.swing.JLabel label_wage;
    private javax.swing.JCheckBoxMenuItem menuConnect;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JMenuItem menuShowHelp;
    private javax.swing.JMenuItem menu_closeConn;
    // End of variables declaration//GEN-END:variables
}
