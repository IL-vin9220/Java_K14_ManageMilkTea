/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Love you
 */
public class Ban {
    private String TenBan;
    private String TinhTrang;
    private String SoKhach;
    private String LoaiDoUong;
    private String LoaiDoAn;
    private String TongTien;

    public Ban() {
    }

    public Ban(String TenBan, String TinhTrang, String SoKhach, String LoaiDoUong, String LoaiDoAn, String TongTien) {
        this.TenBan = TenBan;
        this.TinhTrang = TinhTrang;
        this.SoKhach = SoKhach;
        this.LoaiDoUong = LoaiDoUong;
        this.LoaiDoAn = LoaiDoAn;
        this.TongTien = TongTien;
    }

    public String getTenBan() {
        return TenBan;
    }

    public void setTenBan(String TenBan) {
        this.TenBan = TenBan;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getSoKhach() {
        return SoKhach;
    }

    public void setSoKhach(String SoKhach) {
        this.SoKhach = SoKhach;
    }

    public String getLoaiDoUong() {
        return LoaiDoUong;
    }

    public void setLoaiDoUong(String LoaiDoUong) {
        this.LoaiDoUong = LoaiDoUong;
    }

    public String getLoaiDoAn() {
        return LoaiDoAn;
    }

    public void setLoaiDoAn(String LoaiDoAn) {
        this.LoaiDoAn = LoaiDoAn;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }

    @Override
    public String toString() {
        return "Ban{" + "TenBan=" + TenBan + "TinhTrang=" + TinhTrang + "SoKhach=" + SoKhach + "LoaiDoUong=" + LoaiDoUong + "LoaiDoAn=" + LoaiDoAn + "TongTien=" + TongTien + "}";
    }
    
    
}
