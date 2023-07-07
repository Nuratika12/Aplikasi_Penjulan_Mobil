/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package penjualanmobil;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.*;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USER
 */
public class FormTransaksi extends javax.swing.JFrame {
    Transaksi trans = new Transaksi();
    private TableColumn column;

    /**
     * Creates new form FormTransaksi
     */
    public FormTransaksi() {
        initComponents();
        trans.AksesData();
        isiCBxNamaMobil();
        isiCBxTipeMobil();
        isiTabel();
    }
    
    public void isiCBxNamaMobil() {
        try {
            jNamaMobil.removeAllItems();
            trans.AksesData();
            String sql = "SELECT * FROM mobil";
            Statement stat = trans.conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            jNamaMobil.addItem("Pilih Mobil");
            while(res.next()) {
                jNamaMobil.addItem(res.getString("nama_mobil"));
            }            
        } catch (Exception e) {
        }
    }
    
    public void isiCBxTipeMobil() {
        try {
            jTipe.removeAllItems();
            trans.AksesData();
            String sql = "SELECT * FROM tipe";
            Statement stat = trans.conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            jTipe.addItem("Pilih Tipe");
            while(res.next()) {
                jTipe.addItem(res.getString("nama_tipe"));
            }            
        } catch (Exception e) {
        }
    }
    
    public void isiTabel() {
        DefaultTableModel tm = new DefaultTableModel();
        
        tm.addColumn("No Transaksi");
        tm.addColumn("Tanggal");
        tm.addColumn("Nama Mobil");
        tm.addColumn("Tipe Mobil");
        tm.addColumn("Harga");
        
        try {
            trans.AksesData();
            trans.TampilData();
            Statement stat = trans.conn.createStatement();
            ResultSet res = stat.executeQuery(trans.sql);
            while(res.next()) {
                tm.addRow(new Object[] {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),});
            }tbTransaksi.setModel(tm);
        } catch (Exception e) {
        }
    }
    
    public void Bersih(){
        txtNoTransaksi.setText("");
        jTanggal.setDate(null);
        isiCBxNamaMobil();
        isiCBxTipeMobil();
        txtHarga.setText("");
        txtNoTransaksi.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNoTransaksi = new javax.swing.JTextField();
        jNamaMobil = new javax.swing.JComboBox<>();
        jTipe = new javax.swing.JComboBox<>();
        txtHarga = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransaksi = new javax.swing.JTable();
        jTanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("FORM TRANSAKSI");

        jLabel2.setText("No Transaksi       :");

        jLabel3.setText("Tanggal               :");

        jLabel4.setText("Nama Mobil       :");

        jLabel5.setText("Tipe                      :");

        jLabel6.setText("Harga                   :");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        tbTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No Transaksi", "Tanggal", "Nama Mobil", "Tipe Mobil", "Harga"
            }
        ));
        tbTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTransaksi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNoTransaksi))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jNamaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHarga, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTipe, 0, 188, Short.MAX_VALUE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(308, 308, 308))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnSimpan)
                        .addGap(46, 46, 46)
                        .addComponent(btnEdit)
                        .addGap(28, 28, 28)
                        .addComponent(btnHapus)
                        .addGap(45, 45, 45)
                        .addComponent(btnKeluar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jNamaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit)
                        .addComponent(btnHapus)
                        .addComponent(btnKeluar)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width-this.getWidth())/2;
        int y = (posisi.height-this.getHeight())/2;
        this.setLocation(x, y);
    }//GEN-LAST:event_formWindowActivated

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        if (txtNoTransaksi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih Transaksi yang Ingin Disimpan");
        } else {
            try {
                trans.AksesData();
                trans.no_transaksi = txtNoTransaksi.getText();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                trans.tanggal = df.format(jTanggal.getDate());
                trans.nama_mobil = jNamaMobil.getSelectedItem().toString();
                trans.nama_tipe = jTipe.getSelectedItem().toString();
                String jHarga = txtHarga.getText();
                trans.harga = Integer.parseInt(jHarga);
                trans.Simpan();
                trans.res.executeUpdate(trans.sql);
                trans.conn.close();
                Bersih();
                isiTabel();
                
                JOptionPane.showMessageDialog(null, "Informasi Berhasil Disimpan");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if (txtNoTransaksi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih Transaksi yang Ingin Diedit");
        } else {
            try {
                trans.AksesData();
                trans.no_transaksi = txtNoTransaksi.getText();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                trans.tanggal = df.format(jTanggal.getDate());
                trans.nama_mobil = jNamaMobil.getSelectedItem().toString();
                trans.nama_tipe = jTipe.getSelectedItem().toString();
                String jHarga = txtHarga.getText();
                trans.harga = Integer.parseInt(jHarga);
                trans.Edit();
                trans.res.executeUpdate(trans.sql);
                trans.conn.close();
                Bersih();
                isiTabel();
                
                JOptionPane.showMessageDialog(null, "Informasi Berhasil Diedit");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            trans.AksesData();
            trans.no_transaksi = txtNoTransaksi.getText();
            trans.Hapus();
            trans.res.executeUpdate(trans.sql);
            trans.conn.close();
            isiTabel();
            Bersih();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void tbTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTransaksiMouseClicked
        // TODO add your handling code here:
        int baris = tbTransaksi.getSelectedRow();
        String kolom1 = tbTransaksi.getValueAt(baris, 0).toString();
        String kolom2 = tbTransaksi.getValueAt(baris, 1).toString();
        String kolom3 = tbTransaksi.getValueAt(baris, 2).toString();
        String kolom4 = tbTransaksi.getValueAt(baris, 3).toString();
        String kolom5 = tbTransaksi.getValueAt(baris, 4).toString();
        
        txtNoTransaksi.setText(kolom1);
        Date a = null;
        try {
            a = new SimpleDateFormat("yyyy-MM-dd").parse(kolom2);
            jTanggal.setDate(a);
        } catch (ParseException ex) {
            
        }
        jNamaMobil.removeAllItems();
        jNamaMobil.addItem(kolom3);
        jTipe.removeAllItems();
        jTipe.addItem(kolom4);
        txtHarga.setText(kolom5);
        
    }//GEN-LAST:event_tbTransaksiMouseClicked

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
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jNamaMobil;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jTanggal;
    private javax.swing.JComboBox<String> jTipe;
    private javax.swing.JTable tbTransaksi;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNoTransaksi;
    // End of variables declaration//GEN-END:variables
}
