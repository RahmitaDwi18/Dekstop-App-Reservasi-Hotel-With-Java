
package Desain;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
public void koneksi(){
try{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_reservasi_hotel","root","");
stat = con.createStatement();
}catch (Exception e){
JOptionPane.showMessageDialog(this,"koneksi gagal..",
"Error",JOptionPane.ERROR_MESSAGE);
System.out.println(e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_username1 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        jCheckBoxShowPass = new javax.swing.JCheckBox();
        jButtonLogin = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_username.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_username.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_username.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_username.setText("Password :");
        jPanel1.add(jLabel_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 120, -1));

        jLabel_username1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_username1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_username1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_username1.setText("Username  : ");
        jPanel1.add(jLabel_username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 120, -1));

        txt_user.setBackground(new java.awt.Color(153, 153, 153));
        txt_user.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 200, -1));

        txt_pass.setBackground(new java.awt.Color(153, 153, 153));
        txt_pass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 200, -1));

        jCheckBoxShowPass.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBoxShowPass.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCheckBoxShowPass.setText("Show Password");
        jCheckBoxShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxShowPassMouseClicked(evt);
            }
        });
        jCheckBoxShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPassActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jButtonLogin.setBackground(new java.awt.Color(255, 204, 204));
        jButtonLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jButtonCancel.setBackground(new java.awt.Color(255, 204, 204));
        jButtonCancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("F o r m   L o g i n");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        jButtonBack.setBackground(new java.awt.Color(255, 204, 204));
        jButtonBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/a65.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 340));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxShowPassActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
       txt_user.setText("");
        txt_pass.setText("");
        
        
     
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jCheckBoxShowPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxShowPassMouseClicked
        // TODO add your handling code here:
         if (jCheckBoxShowPass.isSelected()) {
      txt_pass.setEchoChar((char)0);
    } else {
     txt_pass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxShowPassMouseClicked

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
        // TODO add your handling code here:
        PreparedStatement ps = null;
        ResultSet rs;
        Connection koneksi = null;
        Statement st;
        
        // Masukkan Username dan Password
        String username = txt_user.getText();
        String pass = String.valueOf(txt_pass.getText());
        
        //Apabila username kosong
        if (username.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Masukkan Username untuk Login", "Username Kosong!",1);
        }
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Masukkan Passsword untuk Login", "Password Kosong!",2);
        }
        else
            koneksi = (Connection) new Koneksi();
            String selectQuery = "SELECT `username`, `pass` FROM `login` WHERE `username`=? AND `pass` =?";
            try {
                 
            ps = Koneksi.prepareStatement(selectQuery);
            
            ps.setString(1, username);
            ps.setString(2, pass);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                //Jika user exist dari form login dan pindah ke menu utama
                Dashboard_Admin menu = new Dashboard_Admin();
                menu.setVisible(true);
                menu.pack();
                menu.setLocationRelativeTo(null);
                menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Username atau Password Anda salah", "Login Error!",2); 
            }           
            }catch (SQLException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
            }
    }//GEN-LAST:event_jButtonLoginMouseClicked

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        Menu rgf = new Menu();
        rgf.setVisible(true);// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);

dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
if(txt_user.getText().equals("")||txt_pass.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Data tidak boleh kosong");
 }else{
    try {
        koneksi();
            sql = "SELECT * FROM login WHERE username='"+txt_user.getText()+"' AND pass='"+txt_pass.getText()+"'";
            rs = stat.executeQuery(sql);
            if(rs.next()){
                if(txt_user.getText().equals(rs.getString("username")) && txt_pass.getText().equals(rs.getString("pass"))){
                    JOptionPane.showMessageDialog(null, "LOGIN SUKSES");
                    Dashboard_Admin mnu = new Dashboard_Admin();
                    mnu.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null, "SELAMAT DATANG DI APLIKASI RESERVASI HOTEL");
                }
            }else{
                    JOptionPane.showMessageDialog(null, "USERNAME ATAU PASSWORD ANDA SALAH");
                    txt_user.setText(""); 
                    txt_pass.setText("");
                    txt_user.requestFocus();
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}
    }//GEN-LAST:event_jButtonLoginActionPerformed
   public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JCheckBox jCheckBoxShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JLabel jLabel_username1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    void setDefaulCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
