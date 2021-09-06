 
package main;
 
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import main.model.SalesExecInterface;

public class AdminViewExecutives extends javax.swing.JFrame {

    
    public AdminViewExecutives() {
        initComponents();
        found.setVisible(false);
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",1099);
            SalesExecInterface exec = (SalesExecInterface)registry.lookup("SalesExec");;
            for(int index = 0; index < exec.findAll().size(); index++) {
                String id = exec.findAll().get(index);
                index = index + 1;
                String first = exec.findAll().get(index);
                index = index + 1;
                String last = exec.findAll().get(index);
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                model.addRow(new Object[]{id,first,last});
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
    
    public AdminViewExecutives(String finame,String liname, String user) {
        initComponents();
        found.setVisible(false);
        username = finame;
        userlast = liname;
        uuser = user;
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",1099);
            SalesExecInterface exec = (SalesExecInterface)registry.lookup("SalesExec");;
            for(int index = 0; index < exec.findAll().size(); index++) {
                String id = exec.findAll().get(index);
                index = index + 1;
                String first = exec.findAll().get(index);
                index = index + 1;
                String last = exec.findAll().get(index);
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                model.addRow(new Object[]{id,first,last});
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
        addExecutiveBtn = new javax.swing.JButton();
        adminprofileBtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        removeBtn = new javax.swing.JButton();
        pName = new javax.swing.JTextField();
        found = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(180, 210, 210));

        addExecutiveBtn.setBackground(new java.awt.Color(60, 115, 136));
        addExecutiveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addExecutiveBtn.setForeground(new java.awt.Color(255, 255, 255));
        addExecutiveBtn.setText("Add Sales Executive");
        addExecutiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExecutiveBtnActionPerformed(evt);
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

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name"
            }
        ));
        jScrollPane2.setViewportView(table);

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        pName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameActionPerformed(evt);
            }
        });

        found.setBackground(new java.awt.Color(255, 51, 0));
        found.setText("ID not found try again");

        jLabel1.setText("Enter ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addExecutiveBtn)
                            .addComponent(adminprofileBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(found))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pName, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(found, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addExecutiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminprofileBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void addExecutiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExecutiveBtnActionPerformed

        //Open add sales executives page
        dispose();
        new AdminAddExecutivePage().show();

    }//GEN-LAST:event_addExecutiveBtnActionPerformed

    private void adminprofileBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminprofileBtn1ActionPerformed
        dispose();
        new AdminProfilePage(username,userlast,uuser).show();
    }//GEN-LAST:event_adminprofileBtn1ActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        try{
            Registry registry = LocateRegistry.getRegistry("localhost",1099);
            SalesExecInterface exec = (SalesExecInterface)registry.lookup("SalesExec");
            try{
                String pId = pName.getText();
                if(exec.find(pId)){
                    found.setVisible(false);
                    exec.remove(pId);
                    dispose();
                    new AdminViewExecutives(username,userlast,uuser).show();
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

    private void pNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameActionPerformed
 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewExecutives().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton addExecutiveBtn;
    public static javax.swing.JButton adminprofileBtn1;
    private javax.swing.JLabel found;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pName;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
