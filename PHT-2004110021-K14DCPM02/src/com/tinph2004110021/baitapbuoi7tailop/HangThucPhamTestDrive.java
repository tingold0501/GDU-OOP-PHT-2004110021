package com.tinph2004110021.baitapbuoi7tailop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPhamTestDrive {

    public static void main(String[] args) {
        try {
            String dateTest = "20/10/2022";
            String test = null;
            SimpleDateFormat sFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sFormat.parse(dateTest);
            HangThucPham hangThucPham = new HangThucPham( test, date, date,20000);
            System.out.println(hangThucPham);
            HangThucPham hangThucPham1 = new HangThucPham( "Rau Thơm", date, date,200000);
            System.out.println(hangThucPham1);
            HangThucPham hangThucPham2 = new HangThucPham( "Rau Má", date, date,200000);
            System.out.println(hangThucPham2);
        } catch (Exception e) {
            System.out.println("Dữ Liệu Không Hợp Lê!!!");
        }

    }

}
