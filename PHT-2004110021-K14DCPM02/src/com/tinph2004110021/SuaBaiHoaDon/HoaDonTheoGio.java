package com.tinph2004110021.SuaBaiHoaDon;

import java.util.Date;

public class HoaDonTheoGio extends HoaDon {
    private double soGioThue;

    public double getSoGioThue() {
        return soGioThue;
    }
    public void setSoGioThue(double soGioThue) {
        this.soGioThue = soGioThue;
    }
    public HoaDonTheoGio(String maHoaDon, String tenKhachHang, String maPhong, Date ngayHoaDon, double donGia,
            double soGioThue) {
        super(maHoaDon, tenKhachHang, maPhong, ngayHoaDon, donGia);
        this.soGioThue = soGioThue;
    }
    public HoaDonTheoGio(double soGioThue) {
        this.soGioThue = soGioThue;
    }
    @Override
    protected double tinhTien() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String toString() {
        String string = "Số Giờ Thuê" + this.getSoGioThue();
        return super.toString() + string;
    }
}
