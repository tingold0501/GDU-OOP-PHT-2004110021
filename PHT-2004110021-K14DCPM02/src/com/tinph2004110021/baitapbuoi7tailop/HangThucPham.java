package com.tinph2004110021.baitapbuoi7tailop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private int maHang;
    private static int autoMh = 1;
    private String tenHang;
    private Date ngaySx , ngayHh;
    private double donGia;
    SimpleDateFormat sFormat = new SimpleDateFormat("dd/MM/yyyy");
    public HangThucPham(){
        if(tenHang.equals(null)){
            System.out.println("Vui Lòng Nhập Dữ Liệu Đầy Đủ, Pờ Lyyyyy");
            if(isDate()){
                System.out.println("Sản Phẩm Đã Đến Ngày Hết Hạn!!!");
                return;
            }
        }
        else{
           System.out.println("kkkkkkkkkkkkkk");
        }
    }
    public HangThucPham( String tenHang, Date ngaySx, Date ngayHh, double donGia) {
        this.maHang = autoMh++;
        this.tenHang = tenHang;
        this.ngaySx = ngaySx;
        this.ngayHh = ngayHh;
        this.donGia = donGia;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
   
    public HangThucPham(int maHang) {
        this.maHang = maHang;
    }
    public int getMaHang() {
        return maHang;
    }
    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }
    public int getAutoMh() {
        return autoMh;
    }
    public void setAutoMh(int autoMh) {
        this.autoMh = autoMh;
    }
    public String getTenHang() {
       
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public Date getNgaySx() {
        return ngaySx;
    }
    public void setNgaySx(Date ngaySx) {
        this.ngaySx = ngaySx;
    }
    public Date getNgayHh() {
        return ngayHh;
    }
    public void setNgayHh(Date ngayHh) {
        this.ngayHh = ngayHh;
    }
    @Override
    public String toString() {
        return "Hàng Thực Phẩm \n["+ 
        " Mã hàng = " + maHang + "\n" + 
        " Ngày Sản Xuất = " + ngaySx + "\n" +
        " Ngày Hết Hạn = " + ngayHh + "\n" +
        " Đơn Giá = " +donGia+ " VNĐ" + "\n"+
        " Tên Hàng = " + tenHang + "]";
    }
    private boolean isDate(){
        boolean is = false;
        if(this.ngaySx.equals(this.ngayHh)){
            System.out.println("Sản Phẩm Đã Đến Ngày Hết Hạn");
            return is;
        }
       return true;
    }
    
}
