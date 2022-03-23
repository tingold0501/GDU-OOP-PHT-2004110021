package com.tinph2004110021.SuaBaiTuan6buoi12;

import java.util.Date;

public class HoaDonTheoNgay extends HoaDon {
    private float soNgayThue;

    public float getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay(String maHD, String tenKh, String maPhong, Date ngayHd, double donGia, float soNgayThue) {
        super(maHD, tenKh, maPhong, ngayHd, donGia);
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public double tinhTien() {
        double tien = 0;
        if(this.soNgayThue > 7){
            tien = 7 * this.getDonGia() + (this.soNgayThue - 7) * this.getDonGia() * 0.8;
        }
        else{
            tien = this.soNgayThue * this.getDonGia();
        }

        return tien;
    }

    @Override
    public String toString() {
        return "HoaDonTheoNgay [soNgayThue=" + soNgayThue + "]" + super.toString();
    }
    
    
}
