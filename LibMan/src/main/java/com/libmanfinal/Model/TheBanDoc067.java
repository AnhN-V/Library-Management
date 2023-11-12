package com.libmanfinal.Model;

import java.util.Date;

public class TheBanDoc067 {
    private String id;
    private Date ngayTao;
    private int thoiHanToiDa;
    private String BanDocId;


    public TheBanDoc067(String id, Date ngayTao, int thoiHanToiDa, String banDocId) {
        this.id = id;
        this.ngayTao = ngayTao;
        this.thoiHanToiDa = thoiHanToiDa;
        BanDocId = banDocId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getThoiHanToiDa() {
        return thoiHanToiDa;
    }

    public void setThoiHanToiDa(int thoiHanToiDa) {
        this.thoiHanToiDa = thoiHanToiDa;
    }

    public String getBanDocId() {
        return BanDocId;
    }

    public void setBanDocId(String banDocId) {
        BanDocId = banDocId;
    }
    @Override
    public String toString() {
        return "TheBanDoc{" +
                "id='" + id + '\'' +
                ", ngayTao=" + ngayTao +
                ", thoiHanToiDa=" + thoiHanToiDa +
                ", BanDocId='" + BanDocId + '\'' +
                '}';
    }
}
