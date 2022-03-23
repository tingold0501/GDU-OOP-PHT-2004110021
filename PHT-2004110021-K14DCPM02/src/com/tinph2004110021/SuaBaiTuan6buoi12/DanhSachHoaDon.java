package com.tinph2004110021.SuaBaiTuan6buoi12;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DanhSachHoaDon {
    private List<HoaDon> lDons = new ArrayList<>();
    private int soLuongTheoGio, soLuongTheoNgay;

    public int getSoLuongTheoGio() {
        return soLuongTheoGio;
    }
    public void setSoLuongTheoGio(int soLuongTheoGio) {
        this.soLuongTheoGio = soLuongTheoGio;
    }
    public int getSoLuongTheoNgay() {
        return soLuongTheoNgay;
    }
    public void setSoLuongTheoNgay(int soLuongTheoNgay) {
        this.soLuongTheoNgay = soLuongTheoNgay;
    }
    public void them(HoaDon don){
        this.lDons.add(don);
    }
    public void inDanhSach(){
        for (HoaDon hoaDon : lDons) {
            System.out.println(hoaDon);
        }
    }
    public void tinhTongSoLuongTungLoai(){
        for (HoaDon hoaDon : lDons) {
            if(hoaDon instanceof HoaDonTheoGio){
                this.soLuongTheoGio++;
            }
            else{
                this.soLuongTheoNgay++;
            }
        }
    }
    public double tinhTienHDT9_2013(){
        int diem = 0;
        double tien = 0;
        Calendar calendar = Calendar.getInstance();
        for (HoaDon hoaDon : lDons) {
            Date ngayHoaDon = hoaDon.getNgayHd();
            calendar.setTime(ngayHoaDon);
            int month = calendar.get(Calendar.MONTH);
            int year = calendar.get(Calendar.YEAR);
            if(month == 2 && year == 2022){
                tien += hoaDon.tinhTien();
                diem ++;
            }
        }
        return (double)tien/diem;
    }
    public void xoaHD(HoaDon hoaDon){
        this.lDons.remove(hoaDon);
    }
    public void suaHD(int viTri, HoaDon don){
        this.lDons.set(viTri, don);
    }
    public HoaDon timKiem(String maHD){
        HoaDon hoaDon1 = null;
        for (HoaDon hoaDon : lDons) {
            if(hoaDon.getNgayHd().toString().equalsIgnoreCase(maHD)){
                hoaDon1 = hoaDon;
            }
        
        }
        return hoaDon1;
    }
    
}
