package com.libmanfinal.Model;

import java.util.Date;

public class PhieuMuon067 {
    private int id;
    private Date ngayMuon;
    private Date ngayTraDuKien;
    private int TheBanDocId;
    private int NhanVienThuVienId;
    private int TaiLieuDaMuonId;

    public PhieuMuon067(int id, Date ngayMuon, Date ngayTraDuKien, int theBanDocId, int nhanVienThuVienId, int taiLieuDaMuonId) {
        this.id = id;
        this.ngayMuon = ngayMuon;
        this.ngayTraDuKien = ngayTraDuKien;
        TheBanDocId = theBanDocId;
        NhanVienThuVienId = nhanVienThuVienId;
        TaiLieuDaMuonId = taiLieuDaMuonId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayTraDuKien() {
        return ngayTraDuKien;
    }

    public void setNgayTraDuKien(Date ngayTraDuKien) {
        this.ngayTraDuKien = ngayTraDuKien;
    }

    public int getTheBanDocId() {
        return TheBanDocId;
    }

    public void setTheBanDocId(int theBanDocId) {
        TheBanDocId = theBanDocId;
    }

    public int getNhanVienThuVienId() {
        return NhanVienThuVienId;
    }

    public void setNhanVienThuVienId(int nhanVienThuVienId) {
        NhanVienThuVienId = nhanVienThuVienId;
    }

    public int getTaiLieuDaMuonId() {
        return TaiLieuDaMuonId;
    }

    public void setTaiLieuDaMuonId(int taiLieuDaMuonId) {
        TaiLieuDaMuonId = taiLieuDaMuonId;
    }

    @Override
    public String toString() {
        return "PhieuMuon067{" +
                "id=" + id +
                ", ngayMuon=" + ngayMuon +
                ", ngayTraDuKien=" + ngayTraDuKien +
                ", TheBanDocId=" + TheBanDocId +
                ", NhanVienThuVienId=" + NhanVienThuVienId +
                ", TaiLieuDaMuonId=" + TaiLieuDaMuonId +
                '}';
    }
}
