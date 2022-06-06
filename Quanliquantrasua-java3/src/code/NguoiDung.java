/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code;

/**
 *
 * @author IT Supporter
 */
public class NguoiDung {
    private String MaNhanVien;
    private String TenNhanVien;
    private String Sdt;
    private String SoNgayLuong;
    private String ChucVu;
    private String Luong;

    public NguoiDung() {
    }

    public NguoiDung(String MaNhanVien, String TenNhanVien, String Sdt, String SoNgayLuong, String ChucVu, String Luong) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.Sdt = Sdt;
        this.SoNgayLuong = SoNgayLuong;
        this.ChucVu = ChucVu;
        this.Luong = Luong;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    
    
    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getSoNgayLuong() {
        return SoNgayLuong;
    }

    public void setSoNgayLuong(String SoNgayLuong) {
        this.SoNgayLuong = SoNgayLuong;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MaNhanVien=" + MaNhanVien + ", HoTenNhanVien=" + TenNhanVien + "So dien thoai=" + Sdt + "SoNgayLuong=" + SoNgayLuong + "ChucVu=" + ChucVu + "Luong=" + Luong + '}';
    }
    
    
    
}
