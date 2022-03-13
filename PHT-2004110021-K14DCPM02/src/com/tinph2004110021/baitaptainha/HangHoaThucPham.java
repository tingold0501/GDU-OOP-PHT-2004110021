package com.tinph2004110021.baitaptainha;

import java.util.Date;

public class HangHoaThucPham {
    private int idHang;
    private static int autoIdHang = 1;
    private String nameHang;
    private double donGiaHang;
    private Date ngaySx, ngayHh;
    public int getIdHang() {
        return idHang;
    }
    private void setIdHang(int idHang) {
        this.idHang = idHang;
    }
    public String getNameHang() {
        return nameHang;
    }
    private void setNameHang(String nameHang) {
        this.nameHang = nameHang;
    }
    public double getDonGiaHang() {
        return donGiaHang;
    }
    private void setDonGiaHang(double donGiaHang) {
        this.donGiaHang = donGiaHang;
    }
    public Date getNgaySx() {
        return ngaySx;
    }
    private void setNgaySx(Date ngaySx) {
        this.ngaySx = ngaySx;
    }
    public Date getNgayHh() {
        return ngayHh;
    }
    private void setNgayHh(Date ngayHh) {
        if(ngayHh.before(ngaySx)){
            this.ngayHh = ngayHh;
        }
        else{
            System.out.println("Đã Hết Hạn!!!");
        }
    }
    public boolean kiemTraHSD(){
        boolean isHSD = false;
        Date ngayHienTai = new Date();
        if(this.ngayHh.after(ngayHienTai)){
            isHSD = true;
        }
        return isHSD;
    }
    public HangHoaThucPham(int idHang) {
        this.idHang = idHang;
    }
    public HangHoaThucPham( String nameHang, double donGiaHang, Date ngaySx, Date ngayHh) {
        this.idHang = autoIdHang++;
        this.nameHang = nameHang;
        this.donGiaHang = donGiaHang;
        this.ngaySx = ngaySx;
        this.ngayHh = ngayHh;
    }
    @Override
    public String toString() {
        return "Hàng Hoá Thực Phẩm [Đơn Giá Hàng =" + donGiaHang + 
        ", Mã Hàng =" + idHang + 
        ", Tên Hàng Hoá =" + nameHang + 
        ", Ngày Hết Hạn =" + ngayHh + 
        ", Ngày Sản Xuất =" + ngaySx + "]";
    }
}
