package com.libmanfinal.Model;

import java.util.Date;

public class PhieuTra067 {
    private int id;
    private Date ngayTraThucTe;
    private double soTienPhat;
    private int TheBanDocId;
    private int PhieuMuonId;
    private int NhanVienThuVienId;

    public PhieuTra067(int id, Date ngayTraThucTe, double soTienPhat, int theBanDocId, int phieuMuonId, int nhanVienThuVienId) {
        this.id = id;
        this.ngayTraThucTe = ngayTraThucTe;
        this.soTienPhat = soTienPhat;
        TheBanDocId = theBanDocId;
        PhieuMuonId = phieuMuonId;
        NhanVienThuVienId = nhanVienThuVienId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayTraThucTe() {
        return ngayTraThucTe;
    }

    public void setNgayTraThucTe(Date ngayTraThucTe) {
        this.ngayTraThucTe = ngayTraThucTe;
    }

    public double getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(double soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public int getTheBanDocId() {
        return TheBanDocId;
    }

    public void setTheBanDocId(int theBanDocId) {
        TheBanDocId = theBanDocId;
    }

    public int getPhieuMuonId() {
        return PhieuMuonId;
    }

    public void setPhieuMuonId(int phieuMuonId) {
        PhieuMuonId = phieuMuonId;
    }

    public int getNhanVienThuVienId() {
        return NhanVienThuVienId;
    }

    public void setNhanVienThuVienId(int nhanVienThuVienId) {
        NhanVienThuVienId = nhanVienThuVienId;
    }

    @Override
    public String toString() {
        return "PhieuTra067{" +
                "id=" + id +
                ", ngayTraThucTe=" + ngayTraThucTe +
                ", soTienPhat=" + soTienPhat +
                ", TheBanDocId=" + TheBanDocId +
                ", PhieuMuonId=" + PhieuMuonId +
                ", NhanVienThuVienId=" + NhanVienThuVienId +
                '}';
    }
}