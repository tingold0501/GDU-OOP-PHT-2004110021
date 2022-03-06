package com.tinph2004110021.baitapvenhaBuoi6;

import java.util.Scanner;

public class Vehicle {
    Scanner sc = new Scanner(System.in);
    private String tenChuXe, loaiXe;
    private int dungTich;
    private float triGia;// Attributes private for Vehicle.
     
  
    public String getTenChuXe() {// Hàm get và set của các biến
        return tenChuXe;
    }
    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }
    public String getLoaiXe() {
        return loaiXe;
    }
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
    public int getDungTich() {
        return dungTich;
    }
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
    public float getTriGia() {
        return triGia;
    }
    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }
   public Vehicle(String tenChuXe, String loaiXe, int dungTich, float triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }
    // Contructor khởi tạo đầy đủ các biến
    public Vehicle(){

    }
    // Các hàm xử lý theo đề
    private float tinhTienThueXe(){
        float thueXe = 0;
        if(dungTich < 100){
            thueXe = triGia * (1/100);
        }
        if(dungTich >= 100 && dungTich <= 200){
            thueXe = triGia * (3/100);
        }
        if(dungTich > 200){
            thueXe = triGia * (5/100);
        }
        return thueXe;
    }
    public void nhapThongTinXe(){
        System.out.println("Nhập Tên Chủ Xe: ");
        this.tenChuXe = sc.nextLine();
        System.out.println("Nhập Loại Xe: ");
        this.loaiXe = sc.nextLine();
        System.out.println("Nhập Dung Tích Xe: ");
        this.dungTich = sc.nextInt();
        System.out.println("Nhập Giá Trị Xe: ");
        this.triGia = sc.nextFloat();
    }
    private void xuatDuLieuXe(){
        System.out.printf("%-20S %-20S %-20d %-20.2f %-20.2f\n", this.getTenChuXe(), this.getLoaiXe(), this.getDungTich(),this.getTriGia(), this.tinhTienThueXe());
    }
    public void xuatThongTin(){
        System.out.printf("%-20S %-20S %-20S %-20S %-20S\n", "tên chủ xe", "loại xe","dung tích","trị giá","thuế phải trả");
        this.xuatDuLieuXe();
    }
    @Override
    public String toString() {
        return "Vehicle [dungTich=" + dungTich + 
        ", loaiXe=" + loaiXe + 
        ", sc=" + sc + 
        ", tenChuXe=" + tenChuXe + 
        ", triGia=" + triGia + "]";
    }
}
