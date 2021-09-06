package main;
 
//import sungroceryapplication.SalesProfilePage;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import main.model.ProductInterface;


public class SalesViewItems extends javax.swing.JFrame {
 
    public SalesViewItems() {
        initComponents();
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",1099);
            ProductInterface product = (ProductInterface)registry.lookup("Product");
            for(int index = 0; index < product.findAll().size(); index++) {
                String name = product.findAll().get(index);
                index = index + 1;
                String category = product.findAll().get(index);
                index = index + 1;
                String stock = product.findAll().get(index);
                index = index + 1;
                String price = product.findAll().get(index);
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                model.addRow(new Object[]{name,category, stock, price});
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
    
    public SalesViewItems(String finame,String liname, String user) {
        initComponents();
        username = finame;
        userlast = liname;
        uuser = user;
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",1099);
            ProductInterface product = (ProductInterface)registry.lookup("Product");
            for(int index = 0; index < product.findAll().size(); index++) {
                String name = product.findAll().get(index);
                index = index + 1;
                String category = product.findAll().get(index);
                index = index + 1;
                String stock = product.findAll().get(index);
                index = index + 1;
                String price = product.findAll().get(index);
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                model.addRow(new Object[]{name,category, stock, price});
            }
        } catch (RemoteException ex) {
            Logger.getLogger(SalesRegsitrationPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SalesRegsitrationPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salesprofileBtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(180, 210, 210));

        salesprofileBtn1.setBackground(new java.awt.Color(60, 115, 136));
        salesprofileBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salesprofileBtn1.setForeground(new java.awt.Color(255, 255, 255));
        salesprofileBtn1.setText("View Profile");
        salesprofileBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesprofileBtn1ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Category", "Stock", "Price"
            }
        ));
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(salesprofileBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salesprofileBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salesprofileBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesprofileBtn1ActionPerformed
        dispose();
        new SalesProfilePagee(username,userlast,uuser).show();
    }//GEN-LAST:event_salesprofileBtn1ActionPerformed
 
    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesViewItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton salesprofileBtn1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
