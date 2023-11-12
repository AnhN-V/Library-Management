package com.libmanfinal.Model;

public class BanDoc067 extends ThanhVien067 {
    private int ThanhVienId;
    private String chamNgon;
    private String ghiChu;

    public BanDoc067(int id,
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
                     String chamNgon,
                     String ghiChu) {
        super(id, username, password, soDienThoai, canCuocCongDan, email, ho, ten, diaChi, vaiTro);
        this.ThanhVienId = ThanhVienId;
        this.chamNgon = chamNgon;
        this.ghiChu = ghiChu;
    }

    public int getThanhVienId() {
        return ThanhVienId;
    }

    public void setThanhVienId(int thanhVienId) {
        ThanhVienId = thanhVienId;
    }

    public String getChamNgon() {
        return chamNgon;
    }

    public void setChamNgon(String chamNgon) {
        this.chamNgon = chamNgon;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "BanDoc067{" +
                "ThanhVienId=" + ThanhVienId +
                ", chamNgon='" + chamNgon + '\'' +
                ", ghiChu='" + ghiChu + '\'' +
                '}';
    }
}