/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationbelajar;


import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author linux
 */
public class Menu extends javax.swing.JFrame {
    
    private Connection con;
    private void StatusDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_perpustakaan_ak","root","");
            status1.setForeground(Color.green);
            status1.setText("Connected");
        }catch(ClassNotFoundException | SQLException e){
            status1.setForeground(Color.red);
            status1.setText("Disconnected");
            JOptionPane.showMessageDialog(null, "ERORR\nAnda tidak terhubung ke Database, silahkan cek port MySql atau aktifkan aplikasi MySql.\nDefault port : 3306");
            System.exit(0);
        }
    }
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        StatusDB();
        getJam();
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
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        status1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        peminjaman = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        info = new javax.swing.JLabel();
        pengembalian = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jam1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(137, 107, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelClose.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 0, 0));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 20, 40));

        jLabelMin.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 20, 40));

        status1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        status1.setForeground(new java.awt.Color(255, 245, 245));
        status1.setText("Koneksi Database");
        status1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        status1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                status1MouseClicked(evt);
            }
        });
        jPanel1.add(status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 40));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Status : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 40));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Menu");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 40));

        jPanel3.setBackground(new java.awt.Color(255, 254, 254));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koneksi/aknela.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 230));

        jPanel2.setBackground(new java.awt.Color(33, 12, 75));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        peminjaman.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        peminjaman.setForeground(new java.awt.Color(254, 254, 254));
        peminjaman.setText("Peminjaman");
        peminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peminjamanMouseClicked(evt);
            }
        });
        jPanel2.add(peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 97, 115, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 230, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 230, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 180, 203, 20));

        info.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        info.setForeground(new java.awt.Color(254, 254, 254));
        info.setText("Info");
        info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
        });
        jPanel2.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 40, 30));

        pengembalian.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        pengembalian.setForeground(new java.awt.Color(254, 254, 254));
        pengembalian.setText("Pengembalian");
        pengembalian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengembalianMouseClicked(evt);
            }
        });
        jPanel2.add(pengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 157, 130, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koneksi/201571.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 107, 130, 140));

        jam1.setBackground(new java.awt.Color(254, 250, 247));
        jam1.setFont(new java.awt.Font("UnGungseo", 1, 24)); // NOI18N
        jam1.setForeground(new java.awt.Color(255, 233, 233));
        jPanel2.add(jam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 160, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0); //Ini untuk Exit Aplikasi
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED); //Ini untuk Minimized Aplikasi
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void status1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_status1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Ini adalah status koneksi Database\nJika status anda Disconnected silahkan periksa port MySql atau aktifkan aplikasi MySql, Default port : 3306");
    }//GEN-LAST:event_status1MouseClicked

    private void peminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peminjamanMouseClicked
        // TODO add your handling code here:
        peminjaman peminjam = new peminjaman();
        peminjam.setVisible(true);
        peminjam.pack();
        peminjam.setLocationRelativeTo(null);
        peminjam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_peminjamanMouseClicked

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        // TODO add your handling code here:
        info inf = new info();
        inf.setVisible(true);
        inf.pack();
        inf.setLocationRelativeTo(null);
        inf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_infoMouseClicked

    private void pengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengembalianMouseClicked
        // TODO add your handling code here:
        pengembalian kembali = new pengembalian();
        kembali.setVisible(true);
        kembali.pack();
        kembali.setLocationRelativeTo(null);
        kembali.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_pengembalianMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    public void getJam(){
        Thread i = new Thread(){
            public void run(){
                for(;;){
                    Calendar cal = new GregorianCalendar();
                    int jam = cal.get(Calendar.HOUR);
                    int menit = cal.get(Calendar.MINUTE);
                    int detik = cal.get(Calendar.SECOND);
                    int am_pm = cal.get(Calendar.AM_PM);
                    
                    String malam = "";
                    if(am_pm==1){
                        malam = "PM";
                    }else{
                        malam = "AM";
                    }
                    String waktu1 = jam + ":" + menit + ":" + detik + " " + malam;
                    jam1.setText(waktu1);
                    try{
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        i.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jam1;
    private javax.swing.JLabel peminjaman;
    private javax.swing.JLabel pengembalian;
    private javax.swing.JLabel status1;
    // End of variables declaration//GEN-END:variables
}