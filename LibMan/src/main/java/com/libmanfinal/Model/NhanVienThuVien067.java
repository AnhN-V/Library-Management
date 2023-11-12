package com.libmanfinal.Model;

public class NhanVienThuVien067 extends NhanVien067 {
    private int soNamKinhNghiem;

    public NhanVienThuVien067(int id,
                              String username,
                              String password,
                              String soDienThoai,
                              String canCuocCongDan,
                              String email,
                              String ho,
                              String ten,
                              String diaChi,
                              String vaiTro,
                              int ThanhVienId,
                              double luongCoBan,
                              double heSoLuong,
                              String vaiTroNhanVien,
                              int soNamKinhNghiem) {
        super(id, username, password, soDienThoai, canCuocCongDan, email, ho, ten, diaChi, vaiTro, ThanhVienId, luongCoBan, heSoLuong, vaiTroNhanVien);
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
        return "NhanVienThuVien067{" +
                "soNamKinhNghiem=" + soNamKinhNghiem +
                '}';
    }
}