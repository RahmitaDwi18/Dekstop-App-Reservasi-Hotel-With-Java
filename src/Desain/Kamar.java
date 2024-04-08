
package Desain;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Kamar extends javax.swing.JFrame {
String sql;
String Pilihan=""; 
String Harga_kKamar;
String LamaInap;
String TotalByr;

    public Kamar() {
        initComponents();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        NoKamar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JnKamar = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        HrgKamar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Lantai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabKamar = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Cari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Edit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Hapus = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Tambah = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        BtnCari1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Jenis Kamar :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        NoKamar.setBackground(new java.awt.Color(204, 204, 204));
        NoKamar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        NoKamar.setToolTipText("");
        NoKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoKamarActionPerformed(evt);
            }
        });
        getContentPane().add(NoKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 120, -1));

        jLabel4.setBackground(new java.awt.Color(0, 51, 51));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Harga Kamar :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        JnKamar.setBackground(new java.awt.Color(204, 204, 204));
        JnKamar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JnKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "===PILIHAN===", "1. Regular", "2.Deluxe", "3.Superior", " " }));
        JnKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JnKamarActionPerformed(evt);
            }
        });
        getContentPane().add(JnKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Lantai :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        HrgKamar.setBackground(new java.awt.Color(204, 204, 204));
        HrgKamar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        HrgKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HrgKamarActionPerformed(evt);
            }
        });
        getContentPane().add(HrgKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 150, -1));

        jLabel6.setBackground(new java.awt.Color(0, 51, 51));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("No. Kamar : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        Lantai.setBackground(new java.awt.Color(204, 204, 204));
        Lantai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Lantai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LantaiActionPerformed(evt);
            }
        });
        getContentPane().add(Lantai, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 150, -1));

        TabKamar.setBackground(new java.awt.Color(204, 204, 255));
        TabKamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.Kamar", "Jenis Kamar", "Lantai", "Harga Kamar"
            }
        ));
        TabKamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabKamarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabKamar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 650, 90));

        jPanel1.setOpaque(false);

        Cari.setBackground(new java.awt.Color(255, 204, 204));
        Cari.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Cari2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(56, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cari)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 260, 40));

        jLabel9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Tambah.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 40, 50));

        Edit.setBackground(new java.awt.Color(255, 204, 204));
        Edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        getContentPane().add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Simpan.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 40, 50));

        Refresh.setBackground(new java.awt.Color(255, 204, 204));
        Refresh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Refresh.setText("Refresh ");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Refresh.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 40, 50));

        Hapus.setBackground(new java.awt.Color(255, 204, 204));
        Hapus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/Hapus.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 40, 50));

        Tambah.setBackground(new java.awt.Color(255, 204, 204));
        Tambah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Tambah.setText("Tambah ");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        getContentPane().add(Tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("D  a  t  a   K  a  m  a  r");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        Back.setBackground(new java.awt.Color(255, 204, 204));
        Back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Back.setText("Kembali");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        Clear.setBackground(new java.awt.Color(255, 204, 204));
        Clear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        BtnCari1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnCari1.setText("Cari");
        BtnCari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCari1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/a4.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoKamarActionPerformed

    }//GEN-LAST:event_NoKamarActionPerformed

    private void HrgKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HrgKamarActionPerformed
      Pilihan =(String) JnKamar.getSelectedItem();
        int HrgKamar;
        switch (Pilihan){
            case "Regular":
            HrgKamar = 500000;
            break;
            case "Deluxe":
            HrgKamar = 750000;
            break;
            case "Superior":
            HrgKamar = 1000000;
            break;
        }            
    }//GEN-LAST:event_HrgKamarActionPerformed

    private void LantaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LantaiActionPerformed
       
    }//GEN-LAST:event_LantaiActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        try {
           String sql ="UPDATE `karyawan` SET NmLengkap='"+NoKamar.getText()
                   +"',JnKamar='"+JnKamar.getSelectedItem()
                   +"',Lantai='"+Lantai.getText()+"',HrgKamar='"+HrgKamar.getText();
           
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

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
     try {
         String sql = "INSERT INTO `kamar`VALUES ('"+NoKamar.getText()+"','"+JnKamar.getSelectedItem()
                 +"','"+HrgKamar.getText()+"','"+Lantai.getText();
         
         java.sql.Connection conn = (Connection) Koneksi.configDB();
           java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
           pstm.execute();
           JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
           Tampilkan_Data();
           Kosongkan_Form();
     }  catch (SQLException ex) {
            Logger.getLogger(Kamar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TambahActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Dashboard_Admin rgf = new Dashboard_Admin();
        rgf.setVisible(true);// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        
dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        NoKamar.setText("");
        JnKamar.setSelectedItem("");
        Lantai.setText("");
        HrgKamar.setText("");
        
    }//GEN-LAST:event_ClearActionPerformed

    private void BtnCari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCari1ActionPerformed
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nama Lengkap");
            model.addColumn("Username");
            model.addColumn("Jenis Kelamin");
            model.addColumn("Alamat");
            model.addColumn("Jabatan");
            model.addColumn("No.Telp");
            
            String sql ="SELECT * FROM `Kamar` WHERE `NoKamar`like'%"+NoKamar.getText()+"%'"
                    +"or`JnKamar`like'%"+JnKamar.getSelectedItem()+"%'"
                    +"or`LAntai`like'%"+Lantai.getText()+"%'"
                    +"or`HrgKamar`like'%"+HrgKamar.getText()+"%'";                  
            java.sql.Connection conn = (Connection) Koneksi.configDB();
        } catch (SQLException ex) {
            Logger.getLogger(Kamar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCari1ActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        try {
            String sql = "DELETE FROM `kamar` WHERE NoKamar='"+NoKamar.getText();
            java.sql.Connection conn = (Connection) Koneksi.configDB();
           java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
           pstm.execute();
           JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
           Tampilkan_Data();
           Kosongkan_Form();

        } catch (SQLException ex) {
            Logger.getLogger(Kamar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        
    }//GEN-LAST:event_RefreshActionPerformed

    private void TabKamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabKamarMouseClicked
        int jTable = TabKamar.getSelectedRow();
        String a = TabKamar.getValueAt(jTable,0).toString();
        String b = TabKamar.getValueAt(jTable,1).toString();
        String c = TabKamar.getValueAt(jTable,2).toString();
        String d = TabKamar.getValueAt(jTable,3).toString();
            
        NoKamar.setText(a);
        JnKamar.setSelectedItem(b);
        Lantai.setText(c);
        HrgKamar.setText(d);
        
    }//GEN-LAST:event_TabKamarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kamar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton BtnCari1;
    private javax.swing.JTextField Cari;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField HrgKamar;
    private javax.swing.JComboBox<String> JnKamar;
    private javax.swing.JTextField Lantai;
    private javax.swing.JTextField NoKamar;
    private javax.swing.JButton Refresh;
    private javax.swing.JTable TabKamar;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    void setDefaulCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Tampilkan_Data() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Kosongkan_Form() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
