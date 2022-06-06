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
public class ThongTinHoaDon {
    private String maHD;
    private String tenKH;
    private String sdt;
    private String douong;
    private String doan;
    private String soTienDuKien;

    public ThongTinHoaDon(String maHD, String tenKH, String sdt, String douong, String doan, String soTienDuKien) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.douong = douong;
        this.doan = doan;
        this.soTienDuKien = soTienDuKien;
    }

    public ThongTinHoaDon() {
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getdouong() {
        return douong;
    }

    public void setdouong(String douong) {
        this.douong = douong;
    }

    public String getdoan() {
        return doan;
    }

    public void setdoan(String doan) {
        this.doan = doan;
    }

    public String getSoTienDuKien() {
        return soTienDuKien;
    }

    public void setSoTienDuKien(String soTienDuKien) {
        this.soTienDuKien = soTienDuKien;
    }

    @Override
    public String toString() {
        return "ThongTinDatPhong{" + "maHD=" + maHD + ", tenKH=" + tenKH + ", sdt=" + sdt + ", Do uonh=" + douong+ ",Do an=" + doan + ", soTienDuKien=" + soTienDuKien + '}';
    }
    
    
    
    
}
