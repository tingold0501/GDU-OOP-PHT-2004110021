package com.tinph2004110021.SuaBaiHoaDon;

import java.util.Date;

public abstract class HoaDon {
    private String maHoaDon, tenKhachHang, maPhong;
    private Date ngayHoaDon;
    private double donGia;
    DanhSachHoaDon dHoaDon = new DanhSachHoaDon();
    protected abstract double tinhTien();
    public HoaDon(){

    }
    public HoaDon(String maHoaDon, String tenKhachHang, String maPhong, Date ngayHoaDon, double donGia) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.ngayHoaDon = ngayHoaDon;
        this.donGia = donGia;
    }
    public String getMaHoaDon() {
        return maHoaDon;
    }
    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    public String getTenKhachHang() {
        return tenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }
    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
   
    @Override
    public String toString() {
        return "Hoá Đơn [Đơn Giá =" + donGia + 
        ", Mã Hoá Đơn =" + maHoaDon + 
        ", Mã Phòng =" + maPhong + 
        ", Ngày Hoá Đơn ="+ ngayHoaDon + 
        ", Tên Khách Hàng=" + tenKhachHang + "]";
    }
    
    
}
