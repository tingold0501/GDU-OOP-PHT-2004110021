package com.tinph2004110021.baitaptainha;

import java.text.SimpleDateFormat;

public class HangHoaThucPhamTestDrive {
    public static void main(String[] args) {
        try {
            String ngayHh = "20/03/2022";
            String ngaySx = "20/03/2020";
            SimpleDateFormat sFormat = new SimpleDateFormat("dd/MM/yyyy");
            HangHoaThucPham hThucPham = new 
            HangHoaThucPham("Rau Muong", 1000, sFormat.parse(ngaySx), sFormat.parse(ngayHh));
            System.out.println(hThucPham);
            if(hThucPham.kiemTraHSD()){
                System.out.println("Đã Hết Hạn");
            }
            else{
                System.out.println("Ăn Bình Thường");
            }
        } catch (Exception e) {
            System.out.println("Lỗi Hệ Thống!");
        }
   
    }
}
