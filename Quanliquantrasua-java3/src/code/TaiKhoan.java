/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Love you
 */
public class TaiKhoan {
    private String Hoten;
    private String Username;
    private String Password;

    public TaiKhoan() {
    }

    public TaiKhoan(String Hoten, String Username, String Password) {
        this.Hoten = Hoten;
        this.Username = Username;
        this.Password = Password;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    @Override
    public String toString() {
        return "NguoiDung{" + "Hoten" + Hoten + "username=" + Username + ", password=" + Password + '}';
    }
}
