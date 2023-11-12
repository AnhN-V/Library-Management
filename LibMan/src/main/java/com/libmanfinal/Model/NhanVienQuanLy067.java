package com.libmanfinal.Model;

public class NhanVienQuanLy067 extends NhanVien067 {
    private int soNamKinhNghiem;

    public NhanVienQuanLy067(int id,
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
                             String vaiTroNhanVien,
                             int soNamKinhNghiem) {
        super(id, ho, ten, username, password, soDienThoai, canCuocCongDan, email, diaChi, vaiTro, ThanhVienId, luongCoBan, heSoLuong, vaiTroNhanVien);
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public int getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public void setSoNamKinhNghiem(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    @Override
    public String toString() {
        return "NhanVienQuanLy067{" +
                "soNamKinhNghiem=" + soNamKinhNghiem +
                '}';
    }
}