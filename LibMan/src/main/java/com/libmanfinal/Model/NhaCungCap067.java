package com.libmanfinal.Model;

public class NhaCungCap067 {
    private int NCCId;
    private String tenNCC;
    private String diaChi;
    private String soDienThoai;
    private String email;

    public NhaCungCap067(String tenNCC, String diaChi, String soDienThoai, String email) {
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public NhaCungCap067(int NCCId, String tenNCC, String diaChi, String soDienThoai, String email) {
        this.NCCId = NCCId;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }


    public int getNCCId() {
        return NCCId;
    }

    public void setNCCId(int NCCId) {
        this.NCCId = NCCId;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "NhaCungCap067{" +
                "NCCId=" + NCCId +
                ", tenNCC='" + tenNCC + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
