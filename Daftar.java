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
public class Daftar extends Koneksi {
    int id_admin;
    String nama;
    String username;
    String password;
    String alamat;
    String no_hp;
    
    public void daftar () {
        try {
            sql = "INSERT INTO admin VALUES ('"+id_admin+"', '"+nama+"', '"+username+"', '"+password+"', '"+alamat+"', '"+no_hp+"')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void batal() {
        try {
            JOptionPane.showMessageDialog(null, "Tidak Jadi Mendaftar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Masuk() {
        try {
            JOptionPane.showMessageDialog(null, "Silahkan Login");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
}
