
package Desain;
import javax.swing.JFrame;

public class Dashboard_Admin extends javax.swing.JFrame {
    
    public Dashboard_Admin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Kamar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Karyawan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CheckIn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CheckOut = new javax.swing.JButton();
        Tamu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/kamar.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 130, 130));

        Kamar.setBackground(new java.awt.Color(255, 204, 204));
        Kamar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Kamar.setText("Data Kamar");
        Kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KamarActionPerformed(evt);
            }
        });
        jPanel1.add(Kamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/checkIn.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 130, 130));

        Karyawan.setBackground(new java.awt.Color(255, 204, 204));
        Karyawan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Karyawan.setText("Data Karyawan");
        Karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KaryawanMouseClicked(evt);
            }
        });
        Karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaryawanActionPerformed(evt);
            }
        });
        jPanel1.add(Karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/karyawan.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 130, 130));

        CheckIn.setBackground(new java.awt.Color(255, 204, 204));
        CheckIn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CheckIn.setText("Check In");
        CheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInActionPerformed(evt);
            }
        });
        jPanel1.add(CheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/koper.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 120, 130));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/tamu.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 120, 130));

        CheckOut.setBackground(new java.awt.Color(255, 204, 204));
        CheckOut.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CheckOut.setText("Check Out");
        CheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutActionPerformed(evt);
            }
        });
        jPanel1.add(CheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        Tamu.setBackground(new java.awt.Color(255, 204, 204));
        Tamu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Tamu.setText("Data Tamu");
        Tamu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TamuActionPerformed(evt);
            }
        });
        jPanel1.add(Tamu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("H a l a m a n  A d m i n ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 470));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/a65.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaryawanActionPerformed
        // TODO add your handling code here:
        Karyawan rgf = new Karyawan();
        rgf.setVisible(true);// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaulCloseOperation(JFrame.EXIT_ON_CLOSE);
dispose();
    }//GEN-LAST:event_KaryawanActionPerformed

    private void KamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KamarActionPerformed
        // TODO add your handling code here:
        Kamar rgf = new Kamar();
        rgf.setVisible(true);// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaulCloseOperation(JFrame.EXIT_ON_CLOSE);
dispose();
    }//GEN-LAST:event_KamarActionPerformed

    private void CheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutActionPerformed
        // TODO add your handling code here:
        CheckOut rgf = new CheckOut();
        rgf.setVisible(true);// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaulCloseOperation(JFrame.EXIT_ON_CLOSE);
dispose();
    }//GEN-LAST:event_CheckOutActionPerformed

    private void KaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaryawanMouseClicked
        // TODO add your handling code here:
        Karyawan rgf = new Karyawan();
        rgf.setVisible(true);// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        
dispose();
    }//GEN-LAST:event_KaryawanMouseClicked

    private void CheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInActionPerformed
        // TODO add your handling code here:
        CheckIn rgf = new CheckIn();
        rgf.setVisible(true);// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaulCloseOperation(JFrame.EXIT_ON_CLOSE);
dispose();
    }//GEN-LAST:event_CheckInActionPerformed

    private void TamuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamuActionPerformed
        // TODO add your handling code here:
       Tamu rgf = new Tamu();
        rgf.setVisible(true);// Registrasi
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaulCloseOperation(JFrame.EXIT_ON_CLOSE);
this.dispose();
    }//GEN-LAST:event_TamuActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckIn;
    private javax.swing.JButton CheckOut;
    private javax.swing.JButton Kamar;
    private javax.swing.JButton Karyawan;
    private javax.swing.JButton Tamu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    void setDefaulCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
