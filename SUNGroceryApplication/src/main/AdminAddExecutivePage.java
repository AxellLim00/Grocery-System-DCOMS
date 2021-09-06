 
package main;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import static main.SalesRegsitrationPage.fNameRegister;
import static main.SalesRegsitrationPage.lNameRegister;
import static main.SalesRegsitrationPage.passportRegister;
import static main.SalesRegsitrationPage.passwordRegister;
import main.model.SalesExecInterface;

 
public class AdminAddExecutivePage extends javax.swing.JFrame {

     
    public AdminAddExecutivePage() {
        initComponents();
    }
    
    private String username;
    private String userlast;
    private String uuser;
    
    public AdminAddExecutivePage(String finame,String liname, String user) {
        initComponents();
        username = finame;
        userlast = liname;
        uuser = user;
    }  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addSalesFNameTxt = new javax.swing.JTextField();
        adminAddSalesbackBtn = new javax.swing.JButton();
        addItem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        addSalesLNameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addSalesIDTxt1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addSalesPasswordTxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(180, 210, 210));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("First Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Add New Sales Executive");

        addSalesFNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSalesFNameTxtActionPerformed(evt);
            }
        });

        adminAddSalesbackBtn.setBackground(new java.awt.Color(60, 115, 136));
        adminAddSalesbackBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adminAddSalesbackBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminAddSalesbackBtn.setText("Back");
        adminAddSalesbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddSalesbackBtnActionPerformed(evt);
            }
        });

        addItem.setBackground(new java.awt.Color(60, 115, 136));
        addItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addItem.setForeground(new java.awt.Color(255, 255, 255));
        addItem.setText("Add");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Last Name");

        addSalesLNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSalesLNameTxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("IC/Passport ID");

        addSalesIDTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSalesIDTxt1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addSalesPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(addSalesIDTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(addSalesLNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(addSalesFNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(adminAddSalesbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addSalesFNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addSalesLNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addSalesIDTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSalesPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(adminAddSalesbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSalesFNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSalesFNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSalesFNameTxtActionPerformed

    private void adminAddSalesbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddSalesbackBtnActionPerformed
        dispose();
        new AdminProfilePage(username,userlast,uuser).show();
    }//GEN-LAST:event_adminAddSalesbackBtnActionPerformed

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",1099);
            SalesExecInterface exec = (SalesExecInterface)registry.lookup("SalesExec");
            String fName = addSalesFNameTxt.getText();
            String lName = addSalesLNameTxt.getText();
            String pNo = addSalesIDTxt1.getText();
            String pwd = addSalesPasswordTxt.getText();
            exec.register(pNo,fName,lName,pwd);
            dispose();
            new AdminProfilePage(username, userlast, uuser).show();
        } catch (RemoteException ex) {
            Logger.getLogger(SalesRegsitrationPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SalesRegsitrationPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addItemActionPerformed

    private void addSalesLNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSalesLNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSalesLNameTxtActionPerformed

    private void addSalesIDTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSalesIDTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSalesIDTxt1ActionPerformed
 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddExecutivePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton addItem;
    public static javax.swing.JTextField addSalesFNameTxt;
    public static javax.swing.JTextField addSalesIDTxt1;
    public static javax.swing.JTextField addSalesLNameTxt;
    public static javax.swing.JPasswordField addSalesPasswordTxt;
    public static javax.swing.JButton adminAddSalesbackBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
