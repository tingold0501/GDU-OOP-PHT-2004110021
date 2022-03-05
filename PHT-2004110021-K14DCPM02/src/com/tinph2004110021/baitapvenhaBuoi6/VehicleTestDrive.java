package com.tinph2004110021.baitapvenhaBuoi6;

import java.util.Scanner;

public class VehicleTestDrive {
    static Scanner sc = new Scanner(System.in);
    static Vehicle vehicle1 = new Vehicle();
    static Vehicle vehicle2 = new Vehicle();
    static Vehicle vehicle3 = new Vehicle();
    public static void main(String[] args) {
        System.out.println(vehicle1.toString());
        menu(); 
    }
    public static void menu(){
        do{
            System.out.println("===================MENU=================");
            System.out.println("==1======Nhập Thông Tin Cho 3 Xe========");
            System.out.println("==2======Xuất Bảng Kê Khai Tiền=========");
            System.out.println("==0===============THOÁT=================");
            System.out.println("Nhập Lựa Chọn:");
            int lc = sc.nextInt();
            switch(lc){
                case 0:
                break;
                case 1:
                vehicle1.nhapThongTinXe();
                vehicle2.nhapThongTinXe();
                vehicle3.nhapThongTinXe();
                break;
                case 2:
                
                System.out.println(vehicle1.toString());
                // vehicle2.xuatDuLieuXe();
                // vehicle3.xuatDuLieuXe();
                break;
                default: System.out.println("Lựa Chọn Không Hợp Lệ!!!");
                break;
            }
           
        }while(true);
       

    }
    
}
