package com.tinph2004110021.buoi6;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1, "Phạm Huỳnh Tín", 5, 5);
        SinhVien sv2 = new SinhVien(2, "Phạm Huỳnh Tín", 5, 5);
        SinhVien sv3 = new SinhVien(3, "hoTen", 6, 6);
        sv3.nhap();
        sv3.hienThiBang();
        sv1.hienThiDuLieu();
        sv2.hienThiDuLieu();
    }
}
