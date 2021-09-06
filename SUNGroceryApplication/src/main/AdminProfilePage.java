 
package main;
 
public class AdminProfilePage extends javax.swing.JFrame {
 
    public AdminProfilePage() {
        initComponents();
    }
    
    private String user;
    private String finame;
    private String liname;
    
    public AdminProfilePage(String paraOne,String paraTwo, String paraThree){
        initComponents();
        finame = paraOne;
        liname = paraTwo;
        firstNameLabel.setText(finame);
        lastNameLabel.setText(liname);
        user = paraThree;
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        salesLogoutBtn = new javax.swing.JButton();
        salesprofilebackBtn2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        adminLogoutBtn = new javax.swing.JButton();
        adminProfilebackBtn = new javax.swing.JButton();
        adminaddtBtn1 = new javax.swing.JButton();
        addStockBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        adminProfilebackBtn1 = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Personal Profile");

        salesLogoutBtn.setBackground(new java.awt.Color(60, 115, 136));
        salesLogoutBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salesLogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        salesLogoutBtn.setText("LogOut");
        salesLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesLogoutBtnActionPerformed(evt);
            }
        });

        salesprofilebackBtn2.setBackground(new java.awt.Color(60, 115, 136));
        salesprofilebackBtn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salesprofilebackBtn2.setForeground(new java.awt.Color(255, 255, 255));
        salesprofilebackBtn2.setText("Back");
        salesprofilebackBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesprofilebackBtn2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("First Name");

        fname.setEnabled(false);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Last Name");

        lname.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(180, 210, 210));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Personal Profile");

        adminLogoutBtn.setBackground(new java.awt.Color(60, 115, 136));
        adminLogoutBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adminLogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminLogoutBtn.setText("LogOut");
        adminLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogoutBtnActionPerformed(evt);
            }
        });

        adminProfilebackBtn.setBackground(new java.awt.Color(60, 115, 136));
        adminProfilebackBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adminProfilebackBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminProfilebackBtn.setText("View Executives");
        adminProfilebackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminProfilebackBtnActionPerformed(evt);
            }
        });

        adminaddtBtn1.setBackground(new java.awt.Color(60, 115, 136));
        adminaddtBtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adminaddtBtn1.setForeground(new java.awt.Color(255, 255, 255));
        adminaddtBtn1.setText("Add Item");
        adminaddtBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminaddtBtn1ActionPerformed(evt);
            }
        });

        addStockBtn.setBackground(new java.awt.Color(60, 115, 136));
        addStockBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addStockBtn.setForeground(new java.awt.Color(255, 255, 255));
        addStockBtn.setText("Add Stock");
        addStockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("First Name");

        firstNameLabel.setText("jLabel1");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Last Name");

        lastNameLabel.setText("jLabel2");

        adminProfilebackBtn1.setBackground(new java.awt.Color(60, 115, 136));
        adminProfilebackBtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adminProfilebackBtn1.setForeground(new java.awt.Color(255, 255, 255));
        adminProfilebackBtn1.setText("View Records");
        adminProfilebackBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminProfilebackBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminaddtBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addStockBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(adminLogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(adminProfilebackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminProfilebackBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adminaddtBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addStockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminProfilebackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(adminProfilebackBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salesLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesLogoutBtnActionPerformed

        //Go back to welcome page
        dispose();
        new SalesViewItems().show();

    }//GEN-LAST:event_salesLogoutBtnActionPerformed

    private void salesprofilebackBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesprofilebackBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salesprofilebackBtn2ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void adminLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogoutBtnActionPerformed

        //Go back to welcome page
        dispose();
        new WelcomePage().show();

    }//GEN-LAST:event_adminLogoutBtnActionPerformed

    private void adminProfilebackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminProfilebackBtnActionPerformed
        //Go back to welcome page
        dispose();
        new AdminViewExecutives(finame,liname,user).show();
    }//GEN-LAST:event_adminProfilebackBtnActionPerformed

    private void adminaddtBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminaddtBtn1ActionPerformed
        dispose();
        new AdminAddItem(finame,liname,user).show();
    }//GEN-LAST:event_adminaddtBtn1ActionPerformed

    private void addStockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStockBtnActionPerformed
        dispose();
        new AddStock(finame,liname,user).show();
    }//GEN-LAST:event_addStockBtnActionPerformed
    
    private void adminProfilebackBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminProfilebackBtn1ActionPerformed
         dispose();
        new AdminViewRecords(finame,liname,user).show();
    }//GEN-LAST:event_adminProfilebackBtn1ActionPerformed
 
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton addStockBtn;
    public static javax.swing.JButton adminLogoutBtn;
    public static javax.swing.JButton adminProfilebackBtn;
    public static javax.swing.JButton adminProfilebackBtn1;
    public static javax.swing.JButton adminaddtBtn1;
    private javax.swing.JLabel firstNameLabel;
    public static javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastNameLabel;
    public static javax.swing.JTextField lname;
    public static javax.swing.JButton salesLogoutBtn;
    public static javax.swing.JButton salesprofilebackBtn2;
    // End of variables declaration//GEN-END:variables
}
