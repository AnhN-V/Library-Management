package com.libmanfinal.Model;

import java.util.Date;

public class HoaDonNhap067 {
    private int id;
    private int NhanVienThuVienId;
    private Date ngayNhap;
    private int NhaCungCapId;
    private Double TongTien;

    public HoaDonNhap067() {
    }
    public HoaDonNhap067(int id, int nhanVienThuVienId, Date ngayNhap, int nhaCungCapId, Double tongTien) {
        this.id = id;
        NhanVienThuVienId = nhanVienThuVienId;
        this.ngayNhap = ngayNhap;
        NhaCungCapId = nhaCungCapId;
        TongTien = tongTien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNhanVienThuVienId() {
        return NhanVienThuVienId;
    }

    public void setNhanVienThuVienId(int nhanVienThuVienId) {
        NhanVienThuVienId = nhanVienThuVienId;
    }


    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getNhaCungCapId() {
        return NhaCungCapId;
    }

    public void setNhaCungCapId(int nhaCungCapId) {
        NhaCungCapId = nhaCungCapId;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double tongTien) {
        TongTien = tongTien;
    }

    @Override
    public String toString() {
        return "HoaDonNhap067{" +
                "id=" + id +
                ", NhanVienThuVienId=" + NhanVienThuVienId +
                ", ngayNhap=" + ngayNhap +
                ", NhaCungCapId=" + NhaCungCapId +
                ", TongTien=" + TongTien +
                '}';
    }
}
