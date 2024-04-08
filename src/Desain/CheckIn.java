
package Desain;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CheckIn extends javax.swing.JFrame {
   Connection con;
    Statement stat;
    ResultSet rs;
    String sql,dateChooser;
    public CheckIn() {
        initComponents();
       Tampilkan_Data();
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
    public void Tampilkan_Data(){
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
       private void Kosongkan_Form(){
   Nama.setText(null); 
   KdTamu.setText(null);
   TglIn.setDate(null);
   JK.setSelectedItem(null); 
   Alamat.setText(null);
   NoKamar.setText(null);
   JnKamar.setSelectedItem(null);
   Lantai.setText(null);
   NoTelp.setText(null);
   
   Nama.requestFocus();
       }
       public void getTanggalfromTable(){
    try{
    if(TglIn.getDate() != null){
     String pattern = "yyyy-MM-dd";
     SimpleDateFormat format = new SimpleDateFormat(pattern);
     dateChooser= String.valueOf(format.format(TglIn.getDate()));
    }
}catch (Exception e) {
}
       }
       public void get(){
       int jTable = TabCheckIn.getSelectedRow();
        String a = TabCheckIn.getValueAt(jTable,0).toString();
        String b = TabCheckIn.getValueAt(jTable,1).toString();
        Date c = (Date) TabCheckIn.getValueAt(jTable,2);
        String d = TabCheckIn.getValueAt(jTable,3).toString();
        String e = TabCheckIn.getValueAt(jTable,4).toString();
        String f = TabCheckIn.getValueAt(jTable,5).toString();
        String g = TabCheckIn.getValueAt(jTable,6).toString();
        String h = TabCheckIn.getValueAt(jTable,7).toString();
        String i = TabCheckIn.getValueAt(jTable,8).toString();
        
        Nama.setText(a);
        KdTamu.setText(b);
        TglIn.setDate(c);
        JK.setSelectedItem(d);
        Alamat.setText(e);
        NoKamar.setText(f);
        JnKamar.setSelectedItem(g);
        Lantai.setText(h);
        NoTelp.setText(i);
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        KdTamu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NoTelp = new javax.swing.JTextField();
        TglIn = new com.toedter.calendar.JDateChooser();
        Alamat = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        JnKamar = new javax.swing.JComboBox<>();
        NoKamar = new javax.swing.JTextField();
        Lantai = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabCheckIn = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Cari = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Tambah = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        BtnCari = new javax.swing.JButton();
        Refresh = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        JK = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("C h e c k  I n  T a m u");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Kode Tamu :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        KdTamu.setBackground(new java.awt.Color(204, 204, 204));
        KdTamu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(KdTamu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 170, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Tgl CheckIn :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Jenis Kelamin :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Alamat :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("No. Kamar :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Jenis Kamar :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Lantai :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("No. Telp :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText(" Nama :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        NoTelp.setBackground(new java.awt.Color(204, 204, 204));
        NoTelp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(NoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 170, -1));

        TglIn.setBackground(new java.awt.Color(255, 153, 153));
        TglIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TglInPropertyChange(evt);
            }
        });
        jPanel1.add(TglIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 170, 30));

        Alamat.setBackground(new java.awt.Color(204, 204, 204));
        Alamat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, -1));

        Nama.setBackground(new java.awt.Color(204, 204, 204));
        Nama.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, -1));

        JnKamar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JnKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "===PILIHAN===", "1. Regular ", "2. Deluxe", "3. Superior" }));
        jPanel1.add(JnKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 170, -1));

        NoKamar.setBackground(new java.awt.Color(204, 204, 204));
        NoKamar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(NoKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 170, -1));

        Lantai.setBackground(new java.awt.Color(204, 204, 204));
        Lantai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(Lantai, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 170, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 40, -1));

        TabCheckIn.setBackground(new java.awt.Color(204, 204, 255));
        TabCheckIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama ", "Kd. Tamu", "Tgl CheckIn", "Jenis Kelamin", "Alamat", "No.Kamar", "Jenis Kamar", "lLantai", "No.Telp"
            }
        ));
        TabCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabCheckInMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabCheckIn);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 770, 90));

        jPanel2.setOpaque(false);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));

        Cari.setBackground(new java.awt.Color(255, 204, 204));
        Cari.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Cari2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 260, 60));

        Tambah.setBackground(new java.awt.Color(255, 204, 204));
        Tambah.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        jPanel1.add(Tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

        Hapus.setBackground(new java.awt.Color(255, 204, 204));
        Hapus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, -1));

        Edit.setBackground(new java.awt.Color(255, 204, 204));
        Edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, -1, -1));

        Back.setBackground(new java.awt.Color(255, 204, 204));
        Back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Back.setText("Kembali");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        BtnCari.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnCari.setText("Cari");
        BtnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCariActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));
        jPanel1.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Refresh.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Simpan.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Hapus.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Tambah.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, 40));

        JK.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - laki", "Perempuan" }));
        jPanel1.add(JK, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/a5.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        try {
            koneksi();
         sql = "INSERT INTO `checkin` VALUES ('"+Nama.getText()+"','"+KdTamu.getText()+"','"+dateChooser+"','"+JK.getSelectedItem()+"','"+Alamat.getText()+"','"+NoKamar.getText()+"','"+JnKamar.getSelectedItem()+"','"+Lantai.getText()+"','"+NoTelp.getText()+"')";
                 stat.executeUpdate(sql);
                con.close();
           JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
           Tampilkan_Data();
           Kosongkan_Form();
     }  catch (SQLException ex) {
            Logger.getLogger(Kamar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TambahActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Menu rgf = new Menu();
        rgf.setVisible(true);
        dispose();// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_BackActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        try {
            koneksi();
           sql ="UPDATE `checkin` SET `KdTamu`='"+KdTamu.getText()+"',`TglIn`='"+dateChooser+"',"
                   + "`Alamat`='"+Alamat.getText()+"',`JK`='"+JK.getSelectedItem()+"',"
                   + "`NoKamar`='"+NoKamar.getText()+"',JnKamar='"+JnKamar.getSelectedItem()+"',"
                   + "`Lantai`='"+Lantai.getText()+"',`Notelp`='"+NoTelp.getText()+"' WHERE NamaL='"+Nama.getText()+"'";
            stat.executeUpdate(sql);
                con.close();
           JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
           Tampilkan_Data();
           Kosongkan_Form();
        } catch (SQLException ex) {
            Logger.getLogger(Kamar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        try {
            koneksi();
            sql = "DELETE FROM `checkin` WHERE NamaL='"+Nama.getText()+"'";
             stat.executeUpdate(sql);
                con.close();
           JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
           Tampilkan_Data();
           Kosongkan_Form();

        } catch (SQLException ex) {
            Logger.getLogger(Kamar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void BtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCariActionPerformed
  DefaultTableModel tabelnyo = new DefaultTableModel();
  tabelnyo.addColumn("NAMA");
  tabelnyo.addColumn("JENIS");
  tabelnyo.addColumn("TANGGAL");
  tabelnyo.addColumn("JENIS KELAMIN");
  tabelnyo.addColumn("ALAMAT");
  tabelnyo.addColumn("NOMOR KAMAR");
  tabelnyo.addColumn("JENIS");
  tabelnyo.addColumn("LANTAI");
  tabelnyo.addColumn("TELEPON");
try{
koneksi();
 sql = "Select * from `checkin` where `NamaL` like '%"+Cari.getText()+"%'"+"or `NoKamar` like '%"+Cari.getText() +"%'";
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
  
    }//GEN-LAST:event_BtnCariActionPerformed

    private void TabCheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabCheckInMouseClicked
get();
    }//GEN-LAST:event_TabCheckInMouseClicked

    private void TglInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TglInPropertyChange
getTanggalfromTable();        // TODO add your handling code here:
    }//GEN-LAST:event_TglInPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Kosongkan_Form();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JButton Back;
    private javax.swing.JButton BtnCari;
    private javax.swing.JTextField Cari;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JComboBox<String> JK;
    private javax.swing.JComboBox<String> JnKamar;
    private javax.swing.JTextField KdTamu;
    private javax.swing.JTextField Lantai;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField NoKamar;
    private javax.swing.JTextField NoTelp;
    private javax.swing.JLabel Refresh;
    private javax.swing.JTable TabCheckIn;
    private javax.swing.JButton Tambah;
    private com.toedter.calendar.JDateChooser TglIn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    void setDefaulCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}