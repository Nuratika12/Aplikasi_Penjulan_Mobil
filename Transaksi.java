/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanmobil;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Transaksi extends Koneksi {
    String no_transaksi;
    String tanggal;
    String nama_mobil;
    String nama_tipe;
    int harga;
    
    public void TampilData() {
        sql = "SELECT * FROM transaksi";
    }
    
    public void Simpan() {
        try {
            sql = "INSERT INTO transaksi VALUES ('"+no_transaksi+"', '"+tanggal+"', '"+nama_mobil+"', '"+nama_tipe+"', '"+harga+"')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Edit() {
        try {
            sql = "UPDATE transaksi SET tanggal = '"+tanggal+"', nama_mobil = '"+nama_mobil+"', nama_tipe = '"+nama_tipe+"', harga = '"+harga+"' WHERE no_transaksi = '"+no_transaksi+"'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Hapus() {
        try {
            sql = "DELETE FROM transaksi WHERE no_transaksi = '"+no_transaksi+"'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
}
