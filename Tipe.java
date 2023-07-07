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
public class Tipe extends Koneksi {
    String id_tipe;
    String nama_tipe;
    
    public void TampilData() {
        sql = "SELECT * FROM tipe";
    }
    
    public void Baru(String newID_tipe, String newNama_tipe) {
        try {
           newID_tipe = " ";
           newNama_tipe = " ";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Simpan() {
        try {
            sql = "INSERT INTO tipe VALUES ('"+id_tipe+"', '"+nama_tipe+"')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Edit() {
        try {
            sql = "UPDATE tipe SET nama_tipe = '"+nama_tipe+"' WHERE id_mobil = '"+id_tipe+"'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Hapus() {
        try {
            sql = "DELETE FROM tipe WHERE id_tipe = '"+id_tipe+"'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
}
