package com.tinph2004110021.baitapvenhaBuoi6;

import java.util.Scanner;

public class Student {
    private int idSv;
    private String nameSv;
    private float diemLt, diemTh; // Attributes private for Sinh Vien.
    Scanner sc = new Scanner(System.in);
    public Student(){ // Contructor khởi tạo với các thông tin số = 0, chuỗi = rỗng.
        this.diemLt = 0;
        this.diemTh = 0;
        this.nameSv = "";
    }

    public Student(int idSv, String nameSv, float diemLt, float diemTh) {
        this.idSv = idSv;
        this.nameSv = nameSv;
        this.diemLt = diemLt;
        this.diemTh = diemTh;
    }// Contructor khởi tạo đầy đủ các biến

    // Hàm get và set của các biến
    public int getIdSv() {
        return idSv;
    }
    private void setIdSv(int idSv) {
        this.idSv = idSv;
    }
    public String getNameSv() {
        return nameSv;
    }
    private void setNameSv(String nameSv) {
        this.nameSv = nameSv;
    }
    public float getDiemLt() {
        return diemLt;
    }
    private void setDiemLt(float diemLt) {
        this.diemLt = diemLt;
    }
    public float getDiemTh() {
        return diemTh;
    }
    private void setDiemTh(float diemTh) {
        this.diemTh = diemTh;
    }

    // Các Methods xử lý theo yêu cầu đề
    private float tinhDiemTrungBinh(){
        float diemTb = (this.diemLt + this.diemTh) / 2;
        return diemTb;
    }
    public void nhapThongTinSinhVien(){
        System.out.println("Nhập Mã Sinh Viên: ");
        this.idSv = sc.nextInt();
        sc.nextLine();       
        System.out.println("Nhập Tên Sinh Viên: ");
        this.nameSv = sc.nextLine();
        System.out.println("Nhập Điểm Thực Hành Sinh Viên: ");
        this.diemTh = sc.nextFloat();
        System.out.println("Nhập Điểm Lý Thuyết Sinh Viên: ");
        this.diemLt = sc.nextFloat();
        this.setIdSv(idSv);
        this.setNameSv(nameSv);
        this.setDiemTh(diemTh);
        this.setDiemLt(diemLt);
    }
    // Phương thức toString diễn tả đối tượng ở dạng chuỗi
    @Override
    public String toString() {
        return "Student [Điểm Lý Thuyết=" + diemLt + 
        ", Điểm Thực Hành=" + diemTh + 
        ", ID Sinh Viên=" + idSv + 
        ", Tên Sinh Viên=" + nameSv + 
        ", Điểm Trung Bình=]"+ this.tinhDiemTrungBinh();
    }
    


}
