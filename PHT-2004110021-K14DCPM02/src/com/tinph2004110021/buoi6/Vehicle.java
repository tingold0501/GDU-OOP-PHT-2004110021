package com.tinph2004110021.buoi6;
public class Vehicle {
    private String tenChuXe, loaiXe;
    private int dungTich;
    private float triGia,thueXe = 0;
   
    public String getTenChuXe() {
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
    public float getThueXe() {
        return thueXe;
    }
    public void setThueXe(float thueXe) {
        this.thueXe = thueXe;
    }
    public Vehicle(String tenChuXe, String loaiXe, int dungTich, float triGia, float thueXe) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.thueXe = thueXe;
    }
    public Vehicle(){
        
    }
    // @Override
    // public String toString() {
    //     return "Vehicle [dungTich=" + dungTich + ", loaiXe=" + loaiXe + ", tenChuXe=" + tenChuXe + ", triGia=" + triGia
    //             + "]";
    // }
    private void tinhThueVehicle(){
        if(this.dungTich < 100){
            this.thueXe = this.triGia * (1/100);
        }
        else if(this.dungTich >= 100 && this.dungTich <= 200){
            this.thueXe = this.triGia * (3/100);
        }
        else if(this.dungTich > 200){
            this.thueXe = this.triGia * (5/100);
        }
    }
    public void hienThiCotVehicle(){
        System.out.printf("%-20S %-20S %-20S %-20S %-20S\n", "tên chủ xe", "loại xe","dung tích", "trị giá", "thuế phải nộp");
        System.out.println("===============================================================================================");
        this.hienThiDuLieuVehicle();
    }
    private void hienThiDuLieuVehicle(){ 
        System.out.printf("%-20S %-20S %-20d %-20.2f %-20.2f\n", this.getTenChuXe(), this.getLoaiXe(), this.getDungTich(), this.getTriGia(),this.tinhThueVehicle(this.thueXe));
    }
}

