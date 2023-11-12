package com.libmanfinal.Model;

public class NhanVien067 extends ThanhVien067 {
    private int ThanhVienId;
    private double luongCoBan;
    private double heSoLuong;
    private String vaiTroNhanVien;

    public NhanVien067(int id,
                       String ho,
                       String ten,
                       String username,
                       String password,
                       String soDienThoai,
                       String canCuocCongDan,
                       String email,
                       String diaChi,
                       String vaiTro,
                       int ThanhVienId,
                       double luongCoBan,
                       double heSoLuong,
                       String vaiTroNhanVien) {
        super(id, ho, ten, username, password, soDienThoai, canCuocCongDan, email, diaChi, vaiTro);
        this.ThanhVienId = ThanhVienId;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.vaiTroNhanVien = vaiTroNhanVien;
    }

    public NhanVien067(int ThanhVienId, double luongCoBan, double heSoLuong, String vaiTroNhanVien) {
        this.ThanhVienId = ThanhVienId;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.vaiTroNhanVien = vaiTroNhanVien;
    }

    public int getThanhVienId() {
        return ThanhVienId;
    }

    public void setThanhVienId(int ThanhVienId) {
        this.ThanhVienId = ThanhVienId;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getVaiTroNhanVien() {
        return vaiTroNhanVien;
    }

    public void setVaiTroNhanVien(String vaiTroNhanVien) {
        this.vaiTroNhanVien = vaiTroNhanVien;
    }

    @Override
    public String toString() {
        return "NhanVien067{" +
                "ThanhVienId=" + ThanhVienId +
                ", luongCoBan=" + luongCoBan +
                ", heSoLuong=" + heSoLuong +
                ", vaiTroNhanVien='" + vaiTroNhanVien + '\'' +
                '}';
    }
}
