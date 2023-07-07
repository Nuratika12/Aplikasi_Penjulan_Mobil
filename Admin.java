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
public class Admin extends Koneksi {
    String nama;    
    String username;
    String password;
    String alamat;
    String no_hp;
    
    public void TampilData() {
        sql = "SELECT * FROM admin";
    }
    
    public void Edit() {
        try {
            sql = "UPDATE admin SET nama = '"+nama+"', alamat = '"+alamat+"', no_hp = '"+no_hp+"', password = '"+password+"' WHERE username = '"+username+"'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Hapus() {
        try {
            sql = "DELETE FROM admin WHERE username = '"+username+"'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
}
