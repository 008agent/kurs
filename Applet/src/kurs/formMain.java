package kurs;

import javax.swing.JFileChooser;
import javax.xml.bind.JAXBElement;

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
        combo_persons = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        label_profession = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_wage = new javax.swing.JLabel();
        combo_tasks = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label_asset = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combo_expertizes = new javax.swing.JComboBox();
        label_date = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuOpen = new javax.swing.JMenuItem();
        menuConnect = new javax.swing.JCheckBoxMenuItem();
        menu_closeConn = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
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

        combo_persons.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_personsItemStateChanged(evt);
            }
        });

        jLabel1.setText("Выберите человека");

        jLabel3.setText("Должность");

        jLabel4.setText("Ставка по должности");

        combo_tasks.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tasksItemStateChanged(evt);
            }
        });

        jLabel2.setText("Выберите дело");

        jLabel5.setText("Статус дела");

        jLabel6.setText("Статья по делу");

        jLabel7.setText("Проведенные экспертизы по делу");

        jLabel8.setText("Дата экспертизы");

        combo_expertizes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_expertizesItemStateChanged(evt);
            }
        });

        menuFile.setText("Файл");

        menuOpen.setText("Открыть файл базы");
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
        menuConnect.setText("Открыть соединение");
        menuConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConnectActionPerformed(evt);
            }
        });
        menuFile.add(menuConnect);

        menu_closeConn.setText("Закрыть соединение");
        menu_closeConn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_closeConnActionPerformed(evt);
            }
        });
        menuFile.add(menu_closeConn);

        menuExit.setText("Выход");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        jMenuBar1.add(menuFile);

        jMenu1.setText("Редактор");
        jMenuBar1.add(jMenu1);

        menuHelp.setText("Помощь");

        menuShowHelp.setText("О программе");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo_persons, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_profession, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_wage, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo_tasks, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_asset, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_expertizes, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_date, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_persons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_profession)
                    .addComponent(label_wage))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_tasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_status)
                    .addComponent(label_asset))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_expertizes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_date))
                .addContainerGap(220, Short.MAX_VALUE))
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

    private void menuConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConnectActionPerformed
        Globals.global_connection = new dbConn(Globals.FD_database);
        this.setTitle(Globals.FD_database + " Connected=" +Globals.global_connection.get_connection_state());
        combo_persons.removeAllItems();
        for(String S:Globals.global_connection.t_людиName_список())
        {
            combo_persons.addItem(S);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConnectActionPerformed

    private void menuShowHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuShowHelpActionPerformed
        formHelp fh = new formHelp();
        fh.setAlwaysOnTop(true);
        fh.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuShowHelpActionPerformed

    private void combo_personsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_personsItemStateChanged
        //заносим в глобальную переменную ID выбранного человека
        Globals.idCurrentActivePerson = Globals.global_connection.t_людиID_from_t_людиName((String)combo_persons.getSelectedItem());
        //заносим в шлобальную переменную ID профессии выбранного человека
        Globals.idCurrentProfession = Globals.global_connection.t_должностьId_from_t_людиID(Globals.idCurrentActivePerson);
        //метка профессия
        label_profession.setText(Globals.global_connection.t_должностиName_from_t_должностьID(Globals.idCurrentProfession));
        //метка ставка по должности
        label_wage.setText( String.valueOf(Globals.global_connection.t_должностиID_to_t_должностиСтавка( Globals.idCurrentProfession )) );
        // комбо , список дел
        combo_tasks.removeAllItems();
        //комбо экспертизы
        combo_expertizes.removeAllItems();
        for(int IDs:Globals.global_connection.t_экспертизы_from_id_человека(Globals.idCurrentActivePerson))
        {
            combo_expertizes.addItem(IDs);
        }
        for(int ID:Globals.global_connection.t_людиID_to_t_делаIDs(Globals.idCurrentActivePerson))
        {
            combo_tasks.addItem(ID);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_personsItemStateChanged

    private void combo_tasksItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tasksItemStateChanged
        //заносим в глобальную переменную текущий ID дела
        try
        {
            Globals.idCurrentTask = Integer.parseInt(String.valueOf(combo_tasks.getSelectedItem()));
        }
        catch(NumberFormatException nfe)
        {
            Globals.idCurrentTask = 0;
        }
        label_status.setText( Globals.global_connection.t_делаID_to_t_дела_статус(Globals.idCurrentTask) );
        //глобальная переменная, текущая статья(ID)
        Globals.idCurrentAsset = Globals.global_connection.t_статьиId_from_t_дело_id( Globals.idCurrentTask );
        //метка, статья
        label_asset.setText( Globals.global_connection.t_статьиName_from_t_статьи_id( Globals.idCurrentAsset ) );
        //комбо экспертизы
        combo_expertizes.removeAllItems();
        for(int IDs:Globals.global_connection.t_экспертизы_from_id_человека(Globals.idCurrentActivePerson))
        {
            combo_expertizes.addItem(IDs);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tasksItemStateChanged

    private void combo_expertizesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_expertizesItemStateChanged
        //заносим в глобальную переменную текущую ID экспертизы
        try
        {
            Globals.idCurrentExpertize = Integer.parseInt(String.valueOf(combo_expertizes.getSelectedItem()));
        }
        catch(NumberFormatException nfe)
        {
            Globals.idCurrentTask = 0;
        } 
        label_date.setText( Globals.global_connection.t_экспертизы_дата_from_t_экспертизы_id(Globals.idCurrentExpertize) );
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_expertizesItemStateChanged

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
    private javax.swing.JComboBox combo_expertizes;
    private javax.swing.JComboBox combo_persons;
    private javax.swing.JComboBox combo_tasks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel label_asset;
    private javax.swing.JLabel label_date;
    private javax.swing.JLabel label_profession;
    private javax.swing.JLabel label_status;
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
