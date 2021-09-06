/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import main.model.RecordsInterface;

/**
 *
 * @author M
 */
public class AdminViewRecords extends javax.swing.JFrame {

    /**
     * Creates new form AdminViewRecords
     */
    public AdminViewRecords() {
        initComponents();
        found.setVisible(false);
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",1099);
            RecordsInterface record = (RecordsInterface)registry.lookup("Records");;
            for(int index = 0; index < record.findAll().size(); index++) {
                String id = record.findAll().get(index);
                index = index + 1;
                String pnmae = record.findAll().get(index);
                index = index + 1;
                String type = record.findAll().get(index);
                index = index + 1;
                String qty = record.findAll().get(index);
                index = index + 1;
                String userids = record.findAll().get(index);
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                model.addRow(new Object[]{id,pnmae,type,qty,userids});
            }
        } catch (RemoteException ex) {
            Logger.getLogger(SalesRegsitrationPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SalesRegsitrationPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String username;
    private String userlast;
    private String uuser;
    
    public AdminViewRecords(String finame,String liname, String user) {
        initComponents();
        found.setVisible(false);
        username = finame;
        userlast = liname;
        uuser = user;
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",1099);
            RecordsInterface record = (RecordsInterface)registry.lookup("Records");;
            for(int index = 0; index < record.findAll().size(); index++) {
                String id = record.findAll().get(index);
                index = index + 1;
                String pnmae = record.findAll().get(index);
                index = index + 1;
                String type = record.findAll().get(index);
                index = index + 1;
                String qty = record.findAll().get(index);
                index = index + 1;
                String userids = record.findAll().get(index);
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                model.addRow(new Object[]{id,pnmae,type,qty,userids});
            }
        } catch (RemoteException ex) {
            Logger.getLogger(SalesRegsitrationPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SalesRegsitrationPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        pName = new javax.swing.JTextField();
        removeBtn = new javax.swing.JButton();
        adminprofileBtn1 = new javax.swing.JButton();
        found = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCT NAME", "TYPE", "QUANTITY", "USERID"
            }
        ));
        jScrollPane2.setViewportView(table);

        pName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameActionPerformed(evt);
            }
        });

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        adminprofileBtn1.setBackground(new java.awt.Color(60, 115, 136));
        adminprofileBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminprofileBtn1.setForeground(new java.awt.Color(255, 255, 255));
        adminprofileBtn1.setText("View Profile");
        adminprofileBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminprofileBtn1ActionPerformed(evt);
            }
        });

        found.setBackground(new java.awt.Color(255, 51, 0));
        found.setText("Record not found try again");

        jLabel1.setText("Enter ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(adminprofileBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(found)
                                    .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(101, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pName)
                    .addComponent(removeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(found)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminprofileBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        try{
            Registry registry = LocateRegistry.getRegistry("localhost",1099);
            RecordsInterface record = (RecordsInterface)registry.lookup("Records");
            try{
                long pId = Integer.parseInt(pName.getText());
                if(record.find(pId)){
                    found.setVisible(false);
                    record.remove(pId);
                    dispose();
                    new AdminViewItems(username,userlast,uuser).show();
                }else{
                    found.setVisible(true);
                }
            }catch (Exception e){

            }

        }catch (RemoteException ex){
            Logger.getLogger(AdminViewItems.class.getName()).log(Level.SEVERE, null, ex);

        } catch (NotBoundException ex) {
            Logger.getLogger(AdminViewItems.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_removeBtnActionPerformed

    private void adminprofileBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminprofileBtn1ActionPerformed
        dispose();
        new AdminProfilePage(username,userlast,uuser).show();
    }//GEN-LAST:event_adminprofileBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton adminprofileBtn1;
    private javax.swing.JLabel found;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pName;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}