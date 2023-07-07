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
public class Login extends Koneksi {
    String username;
    String password;
    
    public void Masuk() {
        try {
            sql = "SELECT * FROM admin WHERE username = '"+ username +"' and password = '"+password+"'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Keluar() {
        try {
            JOptionPane.showMessageDialog(null, "Berhasil Keluar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Daftar() {
        try {
            JOptionPane.showMessageDialog(null, "Silahkan Daftar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            
            System.out.println(e.getMessage());
        }
    }
}
