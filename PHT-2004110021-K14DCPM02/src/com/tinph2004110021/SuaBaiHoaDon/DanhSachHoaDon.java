package com.tinph2004110021.SuaBaiHoaDon;

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
       
    //    System.out.println("Nhập Tên Khách Hàng:");
    //    String tenKhachHang = sc.nextLine();
    //    HoaDon hoaDon2 = new HoaDon(maHoaDon,tenKhachHang,maPhong,donGia);
   }
   protected void xuat(){
       

   }
   protected void tonSLTungLoai(){

   }
   protected void tinhTBTienHD_T9_2013(){

   }

}
