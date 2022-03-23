package com.tinph2004110021.SuaBaiHoaDon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DanhSachHoaDon {
   HoaDon danhSach[] = new HoaDon[10];
   List<HoaDon> lDons = new ArrayList<>();
   Scanner sc = new Scanner(System.in);
   protected void nhap(HoaDon hoaDon){
       System.out.println("Nhập Đơn Giá:");
       double donGia = sc.nextDouble();
       System.out.println("Nhập Mã Hoá Đơn:");
       String maHoaDon = sc.nextLine();
       System.out.println("Nhập Mã Phòng:");
       String maPhong = sc.nextLine();
       System.out.println("Nhập Ngày Hoá Đơn:");
       Date ngayHoaDon;
       SimpleDateFormat sFormat = new SimpleDateFormat("dd/MM/yyyy");
       try {
         ngayHoaDon = sFormat.parse(sc.nextLine());
      } catch (ParseException e) {
         e.printStackTrace();
      }
      hoaDon.setDonGia(donGia);
      hoaDon.setMaHoaDon(maHoaDon);
      hoaDon.setMaPhong(maPhong);
      // hoaDon.setNgayHoaDon(sFormat.format(ngayHoaDon));
   }
   protected void xuat(){
       

   }
   protected void tonSLTungLoai(){

   }
   protected void tinhTBTienHD_T9_2013(){

   }

}
