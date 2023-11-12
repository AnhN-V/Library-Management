package com.libmanfinal.Model;

public class TaiLieu067 {
    private String id;
    private String tenTaiLieu;
    private String tacGia;
    private int namXuatBan;
    private int tongSoLuong;
    private String theLoai;
    private String ngonNgu;

    public TaiLieu067() {
    }

    public TaiLieu067(String tenTaiLieu, String tacGia, int namXuatBan, int tongSoLuong, String theLoai, String ngonNgu) {
        this.tenTaiLieu = tenTaiLieu;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.tongSoLuong = tongSoLuong;
        this.theLoai = theLoai;
        this.ngonNgu = ngonNgu;
    }

    public TaiLieu067(String id, String tenTaiLieu, String tacGia, int namXuatBan, int tongSoLuong, String theLoai, String ngonNgu) {
        this.id = id;
        this.tenTaiLieu = tenTaiLieu;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.tongSoLuong = tongSoLuong;
        this.theLoai = theLoai;
        this.ngonNgu = ngonNgu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getTongSoLuong() {
        return tongSoLuong;
    }

    public void setTongSoLuong(int tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    @Override
    public String toString() {
        return "TaiLieu067{" +
                "id='" + id + '\'' +
                ", tenTaiLieu='" + tenTaiLieu + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", tongSoLuong=" + tongSoLuong +
                ", theLoai='" + theLoai + '\'' +
                ", ngonNgu='" + ngonNgu + '\'' +
                '}';
    }
}
