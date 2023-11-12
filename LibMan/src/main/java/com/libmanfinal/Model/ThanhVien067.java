package com.libmanfinal.Model;

public class ThanhVien067 {
    private int id;
    private String hodem;
    private String ten;
    private String username;
    private String password;
    private String soDienThoai;
    private String canCuocCongDan;
    private String email;
    private String diaChi;
    private String vaiTro;


    public ThanhVien067() {
    }
    public ThanhVien067(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public ThanhVien067(int id,
                        String hodem,
                        String ten,
                        String username,
                        String password,
                        String soDienThoai,
                        String canCuocCongDan,
                        String email,
                        String diaChi,
                        String vaiTro) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.soDienThoai = soDienThoai;
        this.canCuocCongDan = canCuocCongDan;
        this.email = email;
        this.hodem = hodem;
        this.ten = ten;
        this.diaChi = diaChi;
        this.vaiTro = vaiTro;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHodem() {
        return hodem;
    }

    public void setHodem(String hodem) {
        this.hodem = hodem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getCanCuocCongDan() {
        return canCuocCongDan;
    }

    public void setCanCuocCongDan(String canCuocCongDan) {
        this.canCuocCongDan = canCuocCongDan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "ThanhVien067{" +
                "id='" + id + '\'' +
                ", hodem='" + hodem + '\'' +
                ", ten='" + ten + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", canCuocCongDan='" + canCuocCongDan + '\'' +
                ", email='" + email + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", vaiTro='" + vaiTro + '\'' +
                '}';
    }
}
