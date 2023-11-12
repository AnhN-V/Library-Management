package com.libmanfinal.Model;

public class TaiLieuDaNhap067 {
    private int HoaDonNhapId;
    private String DauTaiLieu067Id;
    private int soLuongNhap;
    private double donGia;

    public TaiLieuDaNhap067() {
    }

    public TaiLieuDaNhap067(String dauTaiLieu067Id, int soLuongNhap, double donGia) {
        DauTaiLieu067Id = dauTaiLieu067Id;
        this.soLuongNhap = soLuongNhap;
        this.donGia = donGia;
    }

    public TaiLieuDaNhap067(int hoaDonNhapId, String dauTaiLieu067Id, int soLuongNhap, double donGia) {
        HoaDonNhapId = hoaDonNhapId;
        DauTaiLieu067Id = dauTaiLieu067Id;
        this.soLuongNhap = soLuongNhap;
        this.donGia = donGia;
    }

    public int getHoaDonNhapId() {
        return HoaDonNhapId;
    }

    public void setHoaDonNhapId(int hoaDonNhapId) {
        HoaDonNhapId = hoaDonNhapId;
    }

    public String getDauTaiLieu067Id() {
        return DauTaiLieu067Id;
    }

    public void setDauTaiLieu067Id(String dauTaiLieu067Id) {
        DauTaiLieu067Id = dauTaiLieu067Id;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "TaiLieuDaNhap067{" +
                "HoaDonNhapId=" + HoaDonNhapId +
                ", DauTaiLieu067Id='" + DauTaiLieu067Id + '\'' +
                ", soLuongNhap=" + soLuongNhap +
                ", donGia=" + donGia +
                '}';
    }
}
