package com.tinph2004110021.baitapbuoi7tailop;

import java.util.Scanner;

public class CompanyTravelV {
    private int idChuyenXe, soXe, autoId;
    private String hoTenTaiXe;
    private double doanhThu;
    Scanner sc = new Scanner(System.in);
    public CompanyTravelV(){
        
    }
    public int getIdChuyenXe() {
        return idChuyenXe;
    }
    private void setIdChuyenXe(int idChuyenXe) {
        this.idChuyenXe = idChuyenXe;
    }
    public int getSoXe() {
        return soXe;
    }
    private void setSoXe(int soXe) {
        this.soXe = soXe;
    }
    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }
    private void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }
    public double getDoanhThu() {
        return doanhThu;
    }
    private void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    public CompanyTravelV(int idChuyenXe, int soXe, String hoTenTaiXe, double doanhThu) {
        this.idChuyenXe = idChuyenXe;
        this.soXe = soXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.doanhThu = doanhThu;
    }
    public void nhapChuyenXe(){
        System.out.println("Nhập Mã Chuyến Xe: ");
        this.idChuyenXe = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Họ Tên Tài Xế: ");
        this.hoTenTaiXe = sc.nextLine();
        System.out.println("Nhập Số Xe: ");
        this.soXe = sc.nextInt();
        System.out.println("Nhập Doanh Thu: ");
        this.doanhThu = sc.nextDouble();
    }
    public void xuatDanhSachXe(){
       System.out.println("=====================DANH SACH THONG TIN XE==============");
       System.out.printf("%-20S %-20S %-20S %-20S\n", "mã chuyến xe", "họ tên tài xế", "số xe", "doanh thu");
       System.out.printf("%-20d %-20S %-20d %-20f\n", this.getIdChuyenXe(), this.getHoTenTaiXe(), this.getSoXe(), this.getDoanhThu());
    }
    public void menuTinhDoanhThu(){
        System.out.println("Bạn Chọn Tính Tổng Doanh Thu Của Xe Nào:");
        System.out.println("Ngoại Thành [1] OR Nội Thành [2]");
        int lc = sc.nextInt();
        switch(lc){
            case 1: System.out.println("Bạn Đang Chọn Tính Tổng Doanh Thu Của Xe Ngoại Thành");
            tongDoanhThuXeNgoaiThanh();
            break;
            case 2: System.out.println("Bạn Đang Chọn Tính Tổng Doanh Thu Của Xe Nội Thành");
            tongDoanhThuXeNoiThanh();
            break;
            default : System.out.println("Bạn Chọn Không Hợp Lệ!!!");
            break;
        }
    }
    public void menuChonLoaiChuyenXe(){
        System.out.println("Bạn Chọn Nhập Của Xe Nào:");
        System.out.println("Ngoại Thành [1] OR Nội Thành [2]");
        int lc = sc.nextInt();
        switch(lc){
            case 1: System.out.println("Bạn Đang Chọn Tính Tổng Doanh Thu Của Xe Ngoại Thành");
            tongDoanhThuXeNgoaiThanh();
            break;
            case 2: System.out.println("Bạn Đang Chọn Tính Tổng Doanh Thu Của Xe Nội Thành");
            tongDoanhThuXeNoiThanh();
            break;
            default : System.out.println("Bạn Chọn Không Hợp Lệ!!!");
            break;
        }
    }
    private double tongDoanhThuXeNoiThanh(){
        double tongDoanhThu =+ this.doanhThu;
        System.out.println("Tổng Doanh Thu Của Chuyến Xe Nội Thành: " + tongDoanhThu);
        return tongDoanhThu;
    }
    private double tongDoanhThuXeNgoaiThanh(){
        double tongDoanhThu =+ this.doanhThu;
        System.out.println("Tổng Doanh Thu Của Chuyến Xe Ngoại Thành: "+ tongDoanhThu);
        return tongDoanhThu;
    }
}
