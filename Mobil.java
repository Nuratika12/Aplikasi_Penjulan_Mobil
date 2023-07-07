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
public class Mobil extends Koneksi{
    String id_mobil;
    String nama_mobil;
    
    public void TampilData() {
        sql = "SELECT * FROM mobil";
    }
    
    public void Baru(String newID_mobil, String newNama_mobil) {
        try {
           newID_mobil = " ";
           newNama_mobil = " ";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Simpan() {
        try {
            sql = "INSERT INTO mobil VALUES ('"+id_mobil+"', '"+nama_mobil+"')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Edit() {
        try {
            sql = "UPDATE mobil SET nama_mobil = '"+nama_mobil+"' WHERE id_mobil = '"+id_mobil+"'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Hapus() {
        try {
            sql = "DELETE FROM mobil WHERE id_mobil = '"+id_mobil+"'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
}
