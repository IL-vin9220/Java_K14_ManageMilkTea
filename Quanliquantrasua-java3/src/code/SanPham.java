/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Love you
 */
public class SanPham {
    private String MaSP;
    private String TenSP;
    private String GiaTienM;
    private String GiaTienL;
    private String Donvi;
    private String Mota;

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, String GiaTienM, String GiaTienL, String Donvi, String Mota) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.GiaTienM = GiaTienM;
        this.GiaTienL = GiaTienL;
        this.Donvi = Donvi;
        this.Mota = Mota;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getGiaTienM() {
        return GiaTienM;
    }

    public void setGiaTienM(String GiaTienM) {
        this.GiaTienM = GiaTienM;
    }

    public String getGiaTienL() {
        return GiaTienL;
    }

    public void setGiaTienL(String GiaTienL) {
        this.GiaTienL = GiaTienL;
    }

    public String getDonvi() {
        return Donvi;
    }

    public void setDonvi(String Donvi) {
        this.Donvi = Donvi;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }
    
    @Override
    public String toString() {
     return "SanPham{" + "MaSP=" + MaSP + "TenSP=" + TenSP + "GiaTienM=" + GiaTienM + "GiaTienL=" + GiaTienL + "Donvi=" + Donvi + "Mota=" + Mota + "}";   
    }
}
