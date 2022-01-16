package com.tinph2004110021.buoi2;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    int maSv;
    String nameSv, genderSv, khoaSv;
    float ageSv;
    double diemSv;
    public int getMaSv() {
        return maSv;
    }
    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }
    public String getNameSv() {
        return nameSv;
    }
    public void setNameSv(String nameSv) {
        this.nameSv = nameSv;
    }
    public String getGenderSv() {
        return genderSv;
    }
    public void setGenderSv(String genderSv) {
        this.genderSv = genderSv;
    }
    public String getKhoaSv() {
        return khoaSv;
    }
    public void setKhoaSv(String khoaSv) {
        this.khoaSv = khoaSv;
    }
    public float getAgeSv() {
        return ageSv;
    }
    public void setAgeSv(float ageSv) {
        this.ageSv = ageSv;
    }
    public double getDiemSv() {
        return diemSv;
    }
    public void setDiemSv(double diemSv) {
        this.diemSv = diemSv;
    }
    public Student(int maSv, String nameSv, String genderSv, String khoaSv, float ageSv, double diemSv) {
        this.maSv = maSv;
        this.nameSv = nameSv;
        this.genderSv = genderSv;
        this.khoaSv = khoaSv;
        this.ageSv = ageSv;
        this.diemSv = diemSv;
    }
    public void inputSd(){
        System.out.println("Nhập ID Sinh Viên:");
        maSv = sc.nextInt();
        System.out.println("Nhập Giới Tính Sinh Viên:");
        genderSv = sc.nextLine();
        System.out.println("Nhập Khoá Sinh Viên:");
        khoaSv = sc.nextLine();
        System.out.println("Nhập Tuổi Sinh Viên:");
        ageSv = sc.nextFloat();
        System.out.println("Nhập Điểm Trung Bình Sinh Viên:");
        diemSv = sc.nextDouble();
    }
    public void showSv(){
        System.out.println("=======================STUDENT====================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n","id student", "name student", "gender student", "khoá student", "age student", "điểm trung bình");
        System.out.printf("%-20d %-20S %-20S %-20S %-20.1f %-20.1f\n", this.getMaSv(), this.getNameSv(), this.getGenderSv(), this.getKhoaSv(), this.getAgeSv(), this.getDiemSv());
    }
}
