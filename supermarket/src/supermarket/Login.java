/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame { 
    Connection con=null;
    Statement st=null;
    PreparedStatement pst=null;
    ResultSet rs= null;
    String user;
    
    public Login() {
        initComponents();
        cbPass.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        cmbUser = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbPass = new javax.swing.JCheckBox();
        txtPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new java.awt.Color(0, 0, 0));
        txtUser.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 204, 51));
        txtUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        txtUser.setCaretColor(new java.awt.Color(255, 204, 51));
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUser.setMinimumSize(new java.awt.Dimension(2, 25));
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 234, 190, 30));

        cmbUser.setBackground(new java.awt.Color(0, 0, 0));
        cmbUser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbUser.setForeground(new java.awt.Color(255, 204, 51));
        cmbUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ADMIN", "SELLER" }));
        cmbUser.setToolTipText("Select the user");
        cmbUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        jPanel2.add(cmbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 190, -1));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Enter Username");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 240, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Enter Password ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 282, -1, -1));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("USER LOGIN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 153, 51));
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 190, -1));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("Select User");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lblpass.setForeground(new java.awt.Color(0, 0, 153));
        lblpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpassMouseClicked(evt);
            }
        });
        jPanel2.add(lblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 170, 20));

        lblError.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 324, 23));

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/mush/NetBeansProjects/supermarket/img/login.png")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        cbPass.setBackground(new java.awt.Color(0, 0, 0));
        cbPass.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        cbPass.setForeground(new java.awt.Color(255, 255, 255));
        cbPass.setText("Show");
        cbPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPassActionPerformed(evt);
            }
        });
        jPanel2.add(cbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 60, 20));

        txtPass.setBackground(new java.awt.Color(0, 0, 0));
        txtPass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 204, 51));
        txtPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        txtPass.setCaretColor(new java.awt.Color(255, 204, 51));
        txtPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPass.setMinimumSize(new java.awt.Dimension(2, 25));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 274, 190, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("FAMILY");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("MARKET");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon("/home/mush/NetBeansProjects/supermarket/img/su.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(52, 52, 52)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        if(cmbUser.getSelectedItem()=="" || txtUser.getText().isEmpty() | txtPass.getText().isEmpty()){
            lblError.setText("Please fill all the above fields");
        }
        else{
            user=cmbUser.getSelectedItem().toString();
            String query=null;
            if (user.equals("ADMIN")){
                query="SELECT * FROM admin WHERE username=? AND password=?";
            }
            else{
                query="SELECT * FROM seller WHERE username=? AND password=?";
            }
            
            
            dbconn db=new dbconn();
            con=db.getConn();
            try{
                pst=con.prepareStatement(query);
                pst.setString(1,txtUser.getText());
                pst.setString(2,txtPass.getText());

                rs=pst.executeQuery();

                if(rs.next()){
                    Pos p=new Pos(user);
                    p.setVisible(true);
                    this.dispose();   
                }
                else{
                    lblpass.setText("Forget password");
                    lblError.setText("Username or password is in correct");
                }
            
                pst.close();
                con.close();
            }
            catch(Exception ex){
                System.out.println(ex);
            }
        }
       
    }//GEN-LAST:event_btnLoginMouseClicked

    
    private void lblpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpassMouseClicked
       JOptionPane.showMessageDialog(null,"Contact admin");
    }//GEN-LAST:event_lblpassMouseClicked

    
    //To show and hide password
    private void cbPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPassActionPerformed
        if(cbPass.isSelected()){
            txtPass.setEchoChar((char)0);
            cbPass.setText("Hide");
        }
        else{
            txtPass.setEchoChar('*');
            cbPass.setText("Show");
        }
    }//GEN-LAST:event_cbPassActionPerformed

    //show/hide appears when the password is started to type 
    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        cbPass.setVisible(true);
    }//GEN-LAST:event_txtPassKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbPass;
    private javax.swing.JComboBox<String> cmbUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblpass;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
