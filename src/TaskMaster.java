
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class TaskMaster extends javax.swing.JFrame {

    ArrayList<Task> list;
    ListIterator<Task> li;
    int curtask, tottask;
    Task t;

    public TaskMaster() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        curtask = 1;
        tottask = 3;

        //initalize with 3 tasks - all inserted BEFORE the iterator
        li.add(new Task("Homework", "Math, pages 12-19"));
        li.add(new Task("Groceries", "Bread, Milk, Eggs"));
        li.add(new Task("Chores", "Laundry, Clean Driveway"));

        //rewind back to first task
        while (li.hasPrevious()) {
            t = li.previous();
        }

        //update display to show first task
        showTask();
    }

    public void showTask() {
        lblctask.setText("" + curtask);
        lblttask.setText("" + tottask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblctask = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblttask = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnfirst = new javax.swing.JButton();
        btnprevious = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuShow = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuReplace = new javax.swing.JMenuItem();
        menuRemove = new javax.swing.JMenuItem();
        menuRestore = new javax.swing.JMenuItem();
        menuClear = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuBefore = new javax.swing.JMenuItem();
        menuAfter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Description:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Current Task");

        lblctask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblctask.setText("0");
        lblctask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Total Tasks");

        lblttask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblttask.setText("0");
        lblttask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblctask, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblttask, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblctask)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblttask))
                .addGap(53, 53, 53))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprevious.setText("<");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnfirst)
                .addGap(41, 41, 41)
                .addComponent(btnprevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnext)
                .addGap(41, 41, 41)
                .addComponent(btnlast)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnprevious)
                    .addComponent(btnlast)
                    .addComponent(btnnext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Program");

        menuShow.setText("Show All Tasks");
        menuShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuShowActionPerformed(evt);
            }
        });
        jMenu1.add(menuShow);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        menuReplace.setText("Replace This As Current Task");
        menuReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReplaceActionPerformed(evt);
            }
        });
        jMenu2.add(menuReplace);

        menuRemove.setText("Remove Current Task");
        menuRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRemoveActionPerformed(evt);
            }
        });
        jMenu2.add(menuRemove);

        menuRestore.setText("Restore Current Task");
        menuRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRestoreActionPerformed(evt);
            }
        });
        jMenu2.add(menuRestore);

        menuClear.setText("Clear Screen");
        menuClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClearActionPerformed(evt);
            }
        });
        jMenu2.add(menuClear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        menuBefore.setText("Before Current Task");
        menuBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBeforeActionPerformed(evt);
            }
        });
        jMenu3.add(menuBefore);

        menuAfter.setText("After Current Task");
        menuAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAfterActionPerformed(evt);
            }
        });
        jMenu3.add(menuAfter);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtname)
                                    .addComponent(txtdesc))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAfterActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        Task t = new Task(nm, d);
        if (t.validate() == false) {
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        if (tottask > 0) {
            li.next(); //go past current task if you have at least 1
        }
        li.add(t);//it always adds to the left of the iterator
        li.previous(); //always put iterator BEFORE current task
        curtask++;
        tottask++;
        lblttask.setText("" + tottask);
        lblctask.setText("" + curtask);
        JOptionPane.showMessageDialog(this, "Task Added");
    }//GEN-LAST:event_menuAfterActionPerformed

    private void menuRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRestoreActionPerformed
        li.next();
        li.next();
        li.previous();
        t = li.previous();
        showTask();
    }//GEN-LAST:event_menuRestoreActionPerformed

    private void menuClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClearActionPerformed
        txtname.setText("");
        txtdesc.setText("");
    }//GEN-LAST:event_menuClearActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed

        if (curtask == 1) {
            return;
        }
        while (li.hasPrevious()) {
            t = li.previous();
        }
        curtask = 1;
        showTask();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        if (curtask == 1) {
            return;
        }
        t = li.previous();
        curtask--;
        showTask();
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if (curtask == tottask) {
            return;
        }
        li.next();
        t = li.next();
        li.previous();
        curtask++;
        showTask();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed

        if (curtask == tottask) {
            return;
        }
        while (li.hasNext()) {
            li.next();
        }
        t = li.previous();
        curtask = tottask;
        showTask();
    }//GEN-LAST:event_btnlastActionPerformed

    private void menuBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBeforeActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        Task t = new Task(nm, d);
        if (t.validate() == false) {
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        li.add(t);
        li.previous();
        tottask++;
        lblttask.setText("" + tottask);
    }//GEN-LAST:event_menuBeforeActionPerformed

    private void menuShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuShowActionPerformed
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            t = list.get(i);
            result += "TASK " + (i + 1) + ":\n" + t.toString() + "\n";
        }
        JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_menuShowActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReplaceActionPerformed
        if (tottask == 0) {
            JOptionPane.showMessageDialog(this, "No Tasks To Replace");
        } else {
            String nm = txtname.getText();
            String d = txtdesc.getText();
            Task t = new Task(nm, d);
            if (t.validate() == false) {
                JOptionPane.showMessageDialog(this, "Error - Must enter all information");
                return;
            }
            li.next();
            li.set(t);
            li.previous();
        }

    }//GEN-LAST:event_menuReplaceActionPerformed

    private void menuRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRemoveActionPerformed
        if (list.size()==0)return;
        li.next();
        li.remove();
        tottask-=1;
        if(list.size()==0){
            curtask=0;
            txtname.setText("");
            txtdesc.setText("");
        }
        else if (list.size()==1){
            if(li.hasNext()){
                li.next();
                t= (Task)li.previous();
            }
            if (li.hasPrevious()){
                t =(Task)li.previous();
            }
            curtask=1;
            txtname.setText(t.getName());
            txtdesc.setText(t.getDescription());
        }
        else{
            if(curtask==1){
                li.next();
                t = (Task)li.previous();
            }
            else{
                t = (Task) li.previous();
                curtask--;
            }
            txtname.setText(t.getName());
            txtdesc.setText(t.getDescription());
        }
       lblttask.setText("" + tottask);
       lblctask.setText("" + curtask);
    }//GEN-LAST:event_menuRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblctask;
    private javax.swing.JLabel lblttask;
    private javax.swing.JMenuItem menuAfter;
    private javax.swing.JMenuItem menuBefore;
    private javax.swing.JMenuItem menuClear;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuRemove;
    private javax.swing.JMenuItem menuReplace;
    private javax.swing.JMenuItem menuRestore;
    private javax.swing.JMenuItem menuShow;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
