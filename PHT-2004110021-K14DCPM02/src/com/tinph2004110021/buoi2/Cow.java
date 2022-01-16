package com.tinph2004110021.buoi2;

import java.util.Scanner;

public class Cow {
    Scanner sc = new Scanner(System.in);
    int idCow, autoIdCow = 1;
    String loaiCow = null, color, gioiTinh = null;
    float cannang = 0;
    public int getIdCow() {
        return idCow;
    }
    public void setIdCow(int idCow) {
        this.idCow = idCow;
    }
    public String getLoaiCow() {
        return loaiCow;
    }
    public void setLoaiCow(String loaiCow) {
        this.loaiCow = loaiCow;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public float getCannang() {
        return cannang;
    }
    public void setCannang(float cannang) {
        this.cannang = cannang;
    }
    public Cow(String loaiCow, String color, String gioiTinh, float cannang) {
        this.idCow = autoIdCow++;
        this.loaiCow = loaiCow;
        this.color = color;
        this.gioiTinh = gioiTinh;
        this.cannang = cannang;
    }
    public void inputCow(){
        System.out.println("Nhập Màu Của Bò:");
        color = sc.nextLine();
        System.out.println("Nhập Giới Tính Của Bò [1:Đực] [2:Cái]");
        int gt = sc.nextInt();
        switch(gt){
            case 1:
            gioiTinh = "Đực";
            break;
            case 2:
            gioiTinh = "Cái";
            break;
        }
        System.out.println("Nhập Cân Nặng Của Bò");
        cannang = sc.nextFloat();
        System.out.println("Loại Bò Có Loại:[1:Bò Mỹ] [2:Bò Châu Âu] [3:Bò Ấn Độ]");
        System.out.println("Nhập Loại Bò:");
        int loai = sc.nextInt();
        switch(loai){
            case 1: loaiCow = "Bò Mỹ";
            break;
            case 2: loaiCow = "Bò Châu Âu";
            break;
            case 3: loaiCow = "Bò Ấn Độ";
        }
    }
    public void showCow(){
        System.out.println("==============COW================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S\n", "ID COW", "Loai cow", "Màu","giới tính", "cân nặng");
        System.out.printf("%-20d %-20S %-20S %-20S %-10.1f",this.getIdCow(), this.getLoaiCow(), this.getColor(),this.getGioiTinh(),this.getCannang());
    }

}
