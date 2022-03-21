package com.tinph2004110021.SuaBaiHoaDon;

import java.util.Date;

public class HoaDonTheoNgay extends HoaDon {
    private float soNgayThue;

    public float getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(float soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay(String maHoaDon, String tenKhachHang, String maPhong, Date ngayHoaDon, double donGia,
            float soNgayThue) {
        super(maHoaDon, tenKhachHang, maPhong, ngayHoaDon, donGia);
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay(float soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    protected double tinhTien() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String toString() {
        String string = "Số Giờ Thuê" + this.getSoNgayThue();
        return super.toString()+ string;
    }
}
