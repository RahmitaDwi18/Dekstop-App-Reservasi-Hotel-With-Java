
package Desain ;
import Desain.Dashboard_Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Tamu extends javax.swing.JFrame {
   Connection con;
    Statement stat;
    ResultSet rs;
    String sql,dateChooser;
    public Tamu() {
        initComponents();
        koneksi();
        tampildata();
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
    public void tampildata(){
     DefaultTableModel tabelnyo = new DefaultTableModel();
  tabelnyo.addColumn("NAMA");
  tabelnyo.addColumn("KODE");
  tabelnyo.addColumn("TANGGAL");
  tabelnyo.addColumn("JENIS KELAMIN");
  tabelnyo.addColumn("ALAMAT");
  tabelnyo.addColumn("NOMOR KAMAR");
  tabelnyo.addColumn("JENIS");
  tabelnyo.addColumn("LANTAI");
  tabelnyo.addColumn("TELEPON");

    try{
     koneksi();
     sql = "SELECT * FROM `checkin`";
     rs = stat.executeQuery(sql);
     while (rs.next())
        {
     tabelnyo.addRow(new Object[]{
     rs.getString(1), 
     rs.getString(2),
     rs.getDate(3),
     rs.getString(4),
     rs.getString(5), 
     rs.getString(6),
     rs.getString(7),
     rs.getString(8),
     rs.getString(9)
     });
        }
    TabCheckIn.setModel(tabelnyo);
  }catch (SQLException e)
    {
      JOptionPane.showMessageDialog(null, "Ada Kesalahan Hubungi Teknisi !!");
    }
  }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabCheckIn = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabcheckOut = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Cari = new javax.swing.JTextField();
        BtnCari = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Daftar Tamu Check Out ");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("D  a  t  a     T  a  m  u");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        TabCheckIn.setBackground(new java.awt.Color(0, 102, 102));
        TabCheckIn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TabCheckIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama ", "Kode Tamu", "Tgl CheckIn", "Jenis Kelamin", "Alamat", "No.Kamar", "Jenis Kamar", "Lantai", "No.Telp"
            }
        ));
        TabCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabCheckInMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabCheckIn);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 820, 90));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Daftar Tamu Check In ");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        TabcheckOut.setBackground(new java.awt.Color(0, 102, 102));
        TabcheckOut.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TabcheckOut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Tamu", "Tgl Check Out", "Lama Menginap", "Jenis Kamar", "Harga Kamar", "Total Bayar"
            }
        ));
        TabcheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabcheckOutMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabcheckOut);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 820, 90));

        jPanel2.setOpaque(false);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));

        Cari.setBackground(new java.awt.Color(255, 204, 204));
        Cari.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        BtnCari.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnCari.setText("Cari");
        BtnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCariActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Cari2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCari)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCari)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 340, 80));

        Back.setBackground(new java.awt.Color(255, 204, 204));
        Back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Back.setText("Kembali");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/a4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Dashboard_Admin rgf = new Dashboard_Admin();
        rgf.setVisible(true);// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaulCloseOperation(JFrame.EXIT_ON_CLOSE);
this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void BtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCariActionPerformed
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nama");
            model.addColumn("Kd Tamu");
            model.addColumn("Tgl CheckIn");
            model.addColumn("Jenis Kelamin");
            model.addColumn("Alamat");
            model.addColumn("No. Kamar");
            model.addColumn("Jenis Kamar");
            model.addColumn("Lantai");
            model.addColumn("No. Telp");
            model.addColumn("Tgl Check Out");
            model.addColumn("Lama Menginap");
            model.addColumn("Harga Kamar");
            model.addColumn("Total Bayar");
                         
            java.sql.Connection conn = (Connection) Koneksi.configDB();
        } catch (SQLException ex) {
            Logger.getLogger(Kamar.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_BtnCariActionPerformed

    private void TabCheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabCheckInMouseClicked
        int jTable = TabCheckIn.getSelectedRow();
        String a = TabCheckIn.getValueAt(jTable,0).toString();
        String b = TabCheckIn.getValueAt(jTable,1).toString();
        String c = TabCheckIn.getValueAt(jTable,2).toString();
        String d = TabCheckIn.getValueAt(jTable,3).toString();
        String e = TabCheckIn.getValueAt(jTable,4).toString();
        String f = TabCheckIn.getValueAt(jTable,6).toString();
        String g = TabCheckIn.getValueAt(jTable,7).toString();
        String h = TabCheckIn.getValueAt(jTable,8).toString();
        String i = TabCheckIn.getValueAt(jTable,9).toString();
        
        
    }//GEN-LAST:event_TabCheckInMouseClicked

    private void TabcheckOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabcheckOutMouseClicked
        int jTable = TabCheckIn.getSelectedRow();
        String a = TabCheckIn.getValueAt(jTable,0).toString();
        String b = TabCheckIn.getValueAt(jTable,1).toString();
        String c = TabCheckIn.getValueAt(jTable,2).toString();
        String d = TabCheckIn.getValueAt(jTable,3).toString();
        String e = TabCheckIn.getValueAt(jTable,4).toString();
        String f = TabCheckIn.getValueAt(jTable,6).toString();
               
                
    }//GEN-LAST:event_TabcheckOutMouseClicked

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tamu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton BtnCari;
    private javax.swing.JTextField Cari;
    private javax.swing.JTable TabCheckIn;
    private javax.swing.JTable TabcheckOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    void setDefaulCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

