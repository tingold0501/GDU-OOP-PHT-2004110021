package com.tinph2004110021.buoi6;

import java.util.Scanner;

public class SinhVien {
    private int maSv;
    private String hoTen;
    private float diemLt , diemTh ;
    private Scanner sc = new Scanner(System.in);
    public int getMaSv() {
        return maSv;
    }
    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public float getDiemLt() {
        return diemLt;
    }
    public void setDiemLt(float diemLt) {
        this.diemLt = diemLt;
    }
    public float getDiemTh() {
        return diemTh;
    }
    public void setDiemTh(float diemTh) {
        this.diemTh = diemTh;
    }
    public SinhVien(int maSv, String hoTen, float diemLt, float diemTh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diemLt = diemLt;
        this.diemTh = diemTh;
    }
    private float tinhDiemTb(){
       float tb = (this.diemLt + this.diemTh) / 2;
       return tb;
    }
    public void hienThiBang(){
        System.out.println("===========THÔNG TIN SINH VIÊN============");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S\n","mã sinh viên", "tên sinh viên", "điểm thực hành", "điểm lý thuyết","điểm trung bình");
        this.hienThiDuLieu();
        
    }
    public void hienThiDuLieu(){
        System.out.printf("%-20d %-20S %-20f %-20f %-20f\n", this.getMaSv(), this.getHoTen(), this.getDiemTh(), this.getDiemLt(), this.tinhDiemTb());
    }
    private void nhapSv(){
        System.out.println("Nhập Mã Sinh Viên: ");
        this.maSv = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Họ Tên Sinh Viên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập Điểm Thực Hành Sinh Viên: ");
        this.diemTh = sc.nextFloat();
        System.out.println("Nhập Điểm Lý Thuyết Sinh Viên: ");
        this.diemLt = sc.nextFloat();
        this.setMaSv(maSv);
        this.setHoTen(hoTen);
        this.setDiemTh(diemTh);
        this.setDiemLt(diemLt);
    }
    public void nhap(){
        this.nhapSv();
    }
    @Override
    public String toString() {
        
        return super.toString();
    }
} 
