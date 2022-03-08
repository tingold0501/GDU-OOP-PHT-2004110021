package com.tinph2004110021.baitapbuoi7tailop;

import java.util.Scanner;

public class CompanyTravelV {
    private int idChuyenXe, soXe;
    private static int autoId;
    private String hoTenTaiXe;
    private double doanhThu;
    Scanner sc = new Scanner(System.in);
    // LinkedListChuyenXe linkedListChuyenXe = new LinkedListChuyenXe();
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
    protected void nhapChuyenXe(){
        System.out.println("Nhập ID Xe:");
        this.idChuyenXe = sc.nextInt();
        System.out.println("Nhập Số Xe:");
        this.soXe = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Họ Tên Tài Xế:");
        this.hoTenTaiXe = sc.nextLine();
        System.out.println("Nhập Doanh Thu:");
        this.doanhThu = sc.nextDouble();
        // CompanyTravelV companyTravelV = new CompanyTravelV(idChuyenXe, soXe, hoTenTaiXe, doanhThu);
        // linkedListChuyenXe.themChuyenXe(companyTravelV);
    }
    public void menuNhapChuyenXe()
    {
        System.out.println("Bạn Muốn Nhập Chuyến Xe Nào [1: Nội Thành] [2: Ngoại Thành]");
        int lc = sc.nextInt();
        switch(lc){
            case 1:
            break;
            case 2:
            break;
            default: System.out.println("Lựa Chọn Không Hợp Lệ");
            break;
        }
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
   
    @Override
    public String toString() {
        return "CompanyTravelV Doanh Thu =" + doanhThu + ", Họ Và Tên Tài Xế =" + hoTenTaiXe + ", Mã Chuyến Xe =" + idChuyenXe
                + ", Số Xe =" + soXe + "";
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
