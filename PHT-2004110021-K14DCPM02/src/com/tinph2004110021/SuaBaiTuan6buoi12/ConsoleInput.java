package com.tinph2004110021.SuaBaiTuan6buoi12;

import java.util.Date;
import java.util.Scanner;

public class ConsoleInput {
    public Scanner sc = new Scanner(System.in);
    public HoaDon input(){
        HoaDon hoaDon = null;
        System.out.println("Nhap Ma Hoa Don");
        String maHD = sc.nextLine();
        System.out.println("Nhap Don Gia");
        double donGia = sc.nextDouble();

        System.out.println("Nhap Ngay Hay Gio");
        int loai = sc.nextInt();
        if(loai == 1){
            System.out.println("So Ngay Thue");
            float soNgayThue = sc.nextFloat();
            sc.nextLine();
            hoaDon  = new HoaDonTheoNgay(maHD, "tenKh", "maPhong", new Date(), donGia, soNgayThue);
        }
        else{
            System.out.println("So Gio Thue");
            float soGioThue = sc.nextFloat();
            sc.nextLine();
            hoaDon = new HoaDonTheoGio(maHD, "tenKh", "maPhong", new Date(), donGia, soGioThue);
            sc.nextLine();
        }
        return hoaDon;
    }
}
