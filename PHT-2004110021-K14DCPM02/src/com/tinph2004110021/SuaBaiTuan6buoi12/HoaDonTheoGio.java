package com.tinph2004110021.SuaBaiTuan6buoi12;

import java.util.Date;

public class HoaDonTheoGio extends HoaDon {
    private float soGioThue;

    @Override
    public double tinhTien() {
        double tien = 0;
        if(this.soGioThue <=24){
            tien = this.getDonGia() * this.soGioThue;
        }
        else if(this.soGioThue > 24 && this.soGioThue < 30){
            tien = this.getDonGia() * 24;
        }
        else{
            System.out.println("Bill Duoc Tinh Theo Ngay");
        }
        return tien;
    }

    public HoaDonTheoGio(String maHD, String tenKh, String maPhong, Date ngayHd, double donGia, float soGioThue) {
        super(maHD, tenKh, maPhong, ngayHd, donGia);
        this.soGioThue = soGioThue;
    }

    public HoaDonTheoGio(float soGioThue) {
        this.soGioThue = soGioThue;
    }

    @Override
    public String toString() {
        return "HoaDonTheoGio [soGioThue=" + soGioThue + "]" + super.toString();
    }
    
    
}
