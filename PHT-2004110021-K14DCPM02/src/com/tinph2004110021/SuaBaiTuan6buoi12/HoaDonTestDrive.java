package com.tinph2004110021.SuaBaiTuan6buoi12;

public class HoaDonTestDrive {
    public static void main(String[] args) {
        DanhSachHoaDon dHoaDon = new DanhSachHoaDon();
        ConsoleInput consoleInput = new ConsoleInput();
        String nhapTiep = null;
        do{
            HoaDon hoaDon = consoleInput.input();
            dHoaDon.them(hoaDon);
            System.out.println("Nhap Tiep Khong");
            nhapTiep = consoleInput.sc.nextLine();
        }while(nhapTiep.equalsIgnoreCase("Y"));
        dHoaDon.inDanhSach();
        double tienT3_2022 = dHoaDon.tinhTienHDT9_2013();
        System.out.println(tienT3_2022);
    }
}
