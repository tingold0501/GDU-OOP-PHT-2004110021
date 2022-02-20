package com.tinph2004110021.lab4LopDoiTuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPham {
   private String tenSp;
   private double giaSp, giamGiaSp;
   Scanner sc = new Scanner(System.in);
   List<SanPham> lPhams = new ArrayList<>();
public SanPham(){

}
public String getTenSp() {
    return tenSp;
}
public void setTenSp(String tenSp) {
    this.tenSp = tenSp;
}
public double getGiaSp() {
    return giaSp;
}
public void setGiaSp(double giaSp) {
    this.giaSp = giaSp;
}
public double getGiamGiaSp() {
    return giamGiaSp;
}
public void setGiamGiaSp(double giamGiaSp) {
    this.giamGiaSp = giamGiaSp;
}
public SanPham(String tenSp, double giaSp, double giamGiaSp) {
    this.tenSp = tenSp;
    this.giaSp = giaSp;
    this.giamGiaSp = giamGiaSp;
}
public SanPham(String tensp, double donGia){
    this(tensp, donGia,0);
}
public void inBangSp(){
    System.out.println("===========THÔNG TIN SẢN PHẨM========");
    System.out.printf("%-20S %-20S %-20S %-20S\n", "tên sản phẩm", "đơn giá", "giảm giá", "thuế nhập nhẩu");
}
public void xuat(){
    System.out.printf("%-9S %15.3fVNĐ %15.3fVNĐ %15.3fVNĐ\n", this.getTenSp(), this.getGiaSp(), this.getGiamGiaSp(), this.giaSp * 0.1);
}
public void nhap(){
    System.out.println("Nhập Tên Sản Phẩm");
    this.tenSp = sc.nextLine();
    System.out.println("Nhập Đơn Giá Sản Phẩm");
    this.giaSp = sc.nextDouble();
    System.out.println("Nhập Giảm Giá Sản Phẩm");
    this.giamGiaSp = sc.nextDouble();
} 
public void nhapS()
{
    System.out.println("Nhập Số Lượng Sản Phẩm Muốn Thêm:");
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
        SanPham sp = new SanPham();
        sp.nhap();
        lPhams.add(sp);
    }
}
public void xuatS(){
    System.out.printf("%-20S %-20S %-20S %-20S\n", "tên sản phẩm", "đơn giá", "giảm giá", "thuế nhập nhẩu");
    for (SanPham sanPham : lPhams) {
        sanPham.xuat();
    }
}
}
