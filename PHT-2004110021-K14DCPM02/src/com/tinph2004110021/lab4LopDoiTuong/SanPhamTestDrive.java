package com.tinph2004110021.lab4LopDoiTuong;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        SanPham sp = new SanPham();
        SanPham sp1 = new SanPham("sting", 15, 2);
        SanPham sp2 = new SanPham("cocacola", 10, 2);
        sp1.inBangSp();
        sp1.xuat();
        sp2.xuat();
        sp.nhap();
        sp.xuat();
        sp.nhapS();
        sp.xuatS();
    }
    
}
