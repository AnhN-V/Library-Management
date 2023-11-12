package com.libmanfinal.Model;

public class DauTaiLieu067 extends TaiLieu067{
    private String taiLieuId;
    private int soLuongHienCo;


    public DauTaiLieu067(String id, String tenTaiLieu, String tacGia, int namXuatBan, int tongSoLuong, String theLoai, String ngonNgu, String taiLieuId, int soLuongHienCo) {
        super(id, tenTaiLieu, tacGia, namXuatBan, tongSoLuong, theLoai, ngonNgu);
        this.taiLieuId = taiLieuId;
        this.soLuongHienCo = soLuongHienCo;
    }

    public DauTaiLieu067(String taiLieuId, int soLuongHienCo) {
        this.taiLieuId = taiLieuId;
        this.soLuongHienCo = soLuongHienCo;
    }

    public String getTaiLieuId() {
        return taiLieuId;
    }

    public void setTaiLieuId(String taiLieuId) {
        taiLieuId = taiLieuId;
    }

    public int getSoLuongHienCo() {
        return soLuongHienCo;
    }

    public void setSoLuongHienCo(int soLuongHienCo) {
        this.soLuongHienCo = soLuongHienCo;
    }

    @Override
    public String toString() {
        return "DauTaiLieu067{" +
                "taiLieuId=" + taiLieuId +
                ", soLuongHienCo=" + soLuongHienCo +
                '}';
    }
}
