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
public class Laporan extends Koneksi {
    String penjualan1;
    String penjualan2;
    
    public void Cetak (String newPenjualan1, String newPenjualan2) {
        try {
            penjualan1 = newPenjualan1;
            penjualan2 = newPenjualan2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    void addItem (String pilih_id) {
        throw new UnsupportedOperationException("Not Supported Yet");
    }

    void put(String newPenjualan1, String penjualan1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
