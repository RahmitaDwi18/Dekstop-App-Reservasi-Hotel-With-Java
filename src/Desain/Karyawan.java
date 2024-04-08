
package Desain;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class Karyawan extends javax.swing.JFrame {
    String sql;
     Connection con;
    Statement stat;
    ResultSet res;
    public Karyawan() {
        initComponents();
        Tampilkan_Data();
    }
    private void Kosongkan_Form(){
        NamaLengkap.setEditable(true);
        NamaLengkap.setText(null);
        User.setText(null);
        JK.setSelectedItem(null);
        Alamat.setText(null);
        Jabatan.setSelectedItem(null);
        NoTelp.setText(null);       
    }
    public void Tampilkan_Data() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NAMA");
        model.addColumn("USERNAME");
        model.addColumn("JENIS KELAMIN");
        model.addColumn("ALAMAT");
         model.addColumn("JABATAN");
        model.addColumn("TELEPON");
               
       try {
            sql = "SELECT * FROM 'karyawan'";
            con = (Connection) Koneksi.configDB();
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6)
                });
                            
        } 
            TabKaryawan.setModel(model);   
        } catch (SQLException e) {
          System.out.println("ERROR :"+e.getMessage());
        }    
        }   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JK_ = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        NoTelp = new javax.swing.JTextField();
        NamaLengkap = new javax.swing.JTextField();
        Jabatan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabKaryawan = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Edit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Hapus = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Tambah = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Cari = new javax.swing.JTextField();
        BtnCari1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JK = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Username  :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        JK_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JK_.setForeground(new java.awt.Color(0, 51, 51));
        JK_.setText("Jenis Kelamin :");
        jPanel4.add(JK_, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Alamat :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Jabatan : ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("No. Telp : ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Nama Lengkap :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        User.setBackground(new java.awt.Color(204, 204, 204));
        User.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel4.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 170, -1));

        Alamat.setBackground(new java.awt.Color(204, 204, 204));
        Alamat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatActionPerformed(evt);
            }
        });
        jPanel4.add(Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 170, -1));

        NoTelp.setBackground(new java.awt.Color(204, 204, 204));
        NoTelp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel4.add(NoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 170, -1));

        NamaLengkap.setBackground(new java.awt.Color(204, 204, 204));
        NamaLengkap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel4.add(NamaLengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 170, -1));

        Jabatan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Jabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "===PILIHAN===", "1. General Manager", "2. Controller", "3. Human Resources Manager", "4. Marketing", "5.Admin", " ", " " }));
        jPanel4.add(Jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        TabKaryawan.setBackground(new java.awt.Color(255, 204, 204));
        TabKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama Lengkap", "Username", "Jenis Kelamin", "Alamat", "Jabatan", "No.Telp"
            }
        ));
        TabKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabKaryawan);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 770, 90));

        jLabel9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Tambah.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 40, 50));

        Edit.setBackground(new java.awt.Color(255, 204, 204));
        Edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel4.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Simpan.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 40, 50));

        Refresh.setBackground(new java.awt.Color(255, 204, 204));
        Refresh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel4.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Refresh.png"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 40, 50));

        Hapus.setBackground(new java.awt.Color(255, 204, 204));
        Hapus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel4.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Hapus.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 40, 50));

        Tambah.setBackground(new java.awt.Color(255, 204, 204));
        Tambah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        jPanel4.add(Tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        jPanel1.setOpaque(false);

        Cari.setBackground(new java.awt.Color(255, 204, 204));
        Cari.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        BtnCari1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnCari1.setText("Cari");
        BtnCari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCari1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Cari2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(39, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(BtnCari1)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnCari1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 340, 70));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("D a t a  K a r y a w a n");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        Back.setBackground(new java.awt.Color(255, 204, 204));
        Back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Back.setText("Kembali");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel4.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        JK.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "===PILIHAN===", "1. Laki - laki", "2. Perempuan" }));
        jPanel4.add(JK, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/a5.jpg"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 540));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 531));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            sql = "INSERT INTO karyawan VALUES ('"+NamaLengkap.getText()+"','"+User.getText()+"','"+JK.getSelectedItem()+"','"+Alamat.getText()+"','"+Jabatan.getSelectedItem()+"','"+NoTelp.getText()+"')";
            
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        
        }
    }//GEN-LAST:event_TambahActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        NamaLengkap.setText(null);
        User.setText(null);
        JK.setSelectedItem(null);
        Alamat.setText(null);  
        Jabatan.setSelectedItem(this);
        NoTelp.setText(null);
    
    }//GEN-LAST:event_HapusActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Dashboard_Admin rgf = new Dashboard_Admin();
        rgf.setVisible(true);// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        
dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        try {
           String sql ="UPDATE `karyawan` SET `NmLengkap`='"+NamaLengkap.getText()+"',`User`='"+User.getText()+"',`JK`='"+JK.getSelectedItem()+"',`Alamat`='"+Alamat.getText()+"',`Jabatan`='"+Jabatan.getSelectedItem()+"',`NoTelp`='"+NoTelp.getText()+"' WHERE `NmLengkap`='"+NamaLengkap.getText()+"'";
           
           java.sql.Connection conn = (Connection) Koneksi.configDB();
           java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
           pstm.execute();
           JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
           Tampilkan_Data();
           Kosongkan_Form();
        } catch (SQLException ex) {
            Logger.getLogger(Kamar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditActionPerformed

    private void BtnCari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCari1ActionPerformed
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nama Lengkap");
            model.addColumn("Username");
            model.addColumn("Jenis Kelamin");
            model.addColumn("Alamat");
            model.addColumn("Jabatan");
            model.addColumn("No.Telp");

            String sql ="SELECT * FROM `karyawan` WHERE `NmLengkap`like'%"+NamaLengkap.getText()+"%'"
            +"or`username`like'%"+User.getText()+"%'"
            +"or`JnKamar`like'%"+JK.getSelectedItem()+"%'"
            +"or`Lantai`like'%"+Alamat.getText()+"%'"
            +"or`HrgKamar`like'%"+Jabatan.getSelectedItem()+"%'"
            +"or`NoTelp`like'%"+NoTelp+"%'";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
        } catch (SQLException ex) {
            Logger.getLogger(Kamar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCari1ActionPerformed

    private void TabKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabKaryawanMouseClicked
        int jTable = TabKaryawan.getSelectedRow();
        String a = TabKaryawan.getValueAt(jTable,0).toString();
        String b = TabKaryawan.getValueAt(jTable,1).toString();
        String c = TabKaryawan.getValueAt(jTable,2).toString();
        String d = TabKaryawan.getValueAt(jTable,3).toString();
        String e = TabKaryawan.getValueAt(jTable,4).toString();
        String f = TabKaryawan.getValueAt(jTable,5).toString();
        
        NamaLengkap.setText(a);
        User.setText(b);
        JK.setSelectedItem(c);
        Alamat.setText(d);
        Jabatan.setSelectedItem(e);
        NoTelp.setText(f);
    }//GEN-LAST:event_TabKaryawanMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karyawan().setVisible(true);
            }
        });
        }
              
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JButton Back;
    private javax.swing.JButton BtnCari1;
    private javax.swing.JTextField Cari;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JComboBox<String> JK;
    private javax.swing.JLabel JK_;
    private javax.swing.JComboBox<String> Jabatan;
    private javax.swing.JTextField NamaLengkap;
    private javax.swing.JTextField NoTelp;
    private javax.swing.JButton Refresh;
    private javax.swing.JTable TabKaryawan;
    private javax.swing.JButton Tambah;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    void setDefaulCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    
