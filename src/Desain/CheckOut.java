
package Desain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CheckOut extends javax.swing.JFrame {

String sql;
String Pilihan ="";
int Harga_Kamar;
int Lama_Inap;
int Total_Byr;

    public CheckOut() {
        initComponents();
        Tampilkann_Data();
    }
        public void koneksi(){
try{
Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_reservasi_hotel","root","");
    Statement stat = con.createStatement();
}catch (Exception e){
JOptionPane.showMessageDialog(this,"koneksi gagal..",
"Error",JOptionPane.ERROR_MESSAGE);
System.out.println(e.getMessage());
    }
        }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LamaInap = new javax.swing.JTextField();
        HrgKamar = new javax.swing.JTextField();
        TotalByr = new javax.swing.JTextField();
        KdTamu = new javax.swing.JTextField();
        JnKamar = new javax.swing.JComboBox<>();
        TglOut = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Cetak = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("T  e  r  i  m  a    K  a  s  i  h");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Kode Tamu :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Tgl Check Out :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Lama Menginap :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Jenis Kamar : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Harga Kamar : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Total Bayar :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        LamaInap.setBackground(new java.awt.Color(204, 204, 204));
        LamaInap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(LamaInap, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 130, -1));

        HrgKamar.setBackground(new java.awt.Color(204, 204, 204));
        HrgKamar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        HrgKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HrgKamarActionPerformed(evt);
            }
        });
        jPanel1.add(HrgKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 130, -1));

        TotalByr.setBackground(new java.awt.Color(204, 204, 204));
        TotalByr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TotalByr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalByrActionPerformed(evt);
            }
        });
        jPanel1.add(TotalByr, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 130, -1));

        KdTamu.setBackground(new java.awt.Color(204, 204, 204));
        KdTamu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(KdTamu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 130, -1));

        JnKamar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JnKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "===PILIHAN===", "1. Regular", "2. Deluxe ", "3. Superior" }));
        JnKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JnKamarActionPerformed(evt);
            }
        });
        jPanel1.add(JnKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        TglOut.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(TglOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 130, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Simpan 2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 40, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Cetak.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 40, 50));

        Cetak.setBackground(new java.awt.Color(255, 204, 204));
        Cetak.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cetak.setText("Cetak");
        jPanel1.add(Cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        Simpan.setBackground(new java.awt.Color(255, 204, 204));
        Simpan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("C h e c k  O u t  T a m u");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        Back.setBackground(new java.awt.Color(255, 204, 204));
        Back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Back.setText("Kembali");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/a5.jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 360));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 688, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HrgKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HrgKamarActionPerformed
        
    }//GEN-LAST:event_HrgKamarActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        
    }//GEN-LAST:event_SimpanActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
         CheckIn rgf = new CheckIn();
        rgf.setVisible(true);
        dispose();// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void TotalByrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalByrActionPerformed
        
        Harga_Kamar = Integer.parseInt (HrgKamar.getText());
        Lama_Inap = Integer.parseInt (LamaInap.getText());
        Total_Byr =Harga_Kamar*Lama_Inap;
        DecimalFormat angka = new DecimalFormat ("###,###");
        TotalByr.setText(""+Integer.toString(Total_Byr));
        
    }//GEN-LAST:event_TotalByrActionPerformed

    private void JnKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JnKamarActionPerformed
        int Harga_Kamar;
        Pilihan = (String)JnKamar.getSelectedItem();
        if(Pilihan=="Regular"){
            Harga_Kamar=500000;
            HrgKamar.setText(""+Integer.toString(Harga_Kamar));
        }      
        if(Pilihan=="Deluxe"){
            Harga_Kamar=750000;
            HrgKamar.setText(""+Integer.toString(Harga_Kamar));
        }
        if(Pilihan=="Superior"){
            Harga_Kamar=1000000;
            HrgKamar.setText(""+Integer.toString(Harga_Kamar));
        }
    
    }//GEN-LAST:event_JnKamarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Cetak;
    private javax.swing.JTextField HrgKamar;
    private javax.swing.JComboBox<String> JnKamar;
    private javax.swing.JTextField KdTamu;
    private javax.swing.JTextField LamaInap;
    private javax.swing.JButton Simpan;
    private com.toedter.calendar.JDateChooser TglOut;
    private javax.swing.JTextField TotalByr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    void setDefaulCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Tampilkann_Data() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


