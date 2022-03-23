package com.tinph2004110021.SuaBaiTuan6buoi12;

import java.util.Date;

public abstract class HoaDon {
    private String maHD, tenKh, maPhong;
    private Date ngayHd;
    private double donGia;
    public HoaDon(String maHD, String tenKh, String maPhong, Date ngayHd, double donGia) {
        this.maHD = maHD;
        this.tenKh = tenKh;
        this.maPhong = maPhong;
        this.ngayHd = ngayHd;
        this.donGia = donGia;
    }
    public String getMaHD() {
        return maHD;
    }
    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }
    public String getTenKh() {
        return tenKh;
    }
    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public Date getNgayHd() {
        return ngayHd;
    }
    public void setNgayHd(Date ngayHd) {
        this.ngayHd = ngayHd;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public HoaDon(){

    }
    public abstract double tinhTien();
    @Override
    public String toString() {
        return "HoaDon [donGia=" + donGia + ", maHD=" + maHD + ", maPhong=" + maPhong + ", ngayHd=" + ngayHd
                + ", tenKh=" + tenKh + "]";
    }
    
    
}
