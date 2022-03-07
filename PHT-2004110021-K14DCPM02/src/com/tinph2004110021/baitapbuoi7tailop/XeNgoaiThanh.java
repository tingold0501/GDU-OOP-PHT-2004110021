package com.tinph2004110021.baitapbuoi7tailop;

public class XeNgoaiThanh extends CompanyTravelV {
    private String noiDen;
    private int soNgayDiDuoc;
    CompanyTravelV companyTravelV = new CompanyTravelV();
    public String getNoiDen() {
        return noiDen;
    }
    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }
    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    public XeNgoaiThanh(String noiDen, int soNgayDiDuoc) {
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    public XeNgoaiThanh(int idChuyenXe, int soXe, String hoTenTaiXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
        super(idChuyenXe, soXe, hoTenTaiXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    public XeNgoaiThanh(){
        
    }
    @Override
    public void nhapChuyenXe() {
        System.out.println("Nhập Nơi Đến:");
        this.noiDen = sc.nextLine();
        System.out.println("Nhập Số Ngày Đi Được:");
        this.soNgayDiDuoc = sc.nextInt();
    }
    @Override
    public void xuatDanhSachXe() {
        companyTravelV.xuatDanhSachXe();
        System.out.printf("%-20S %-20S\n", "nơi đến", "số ngày đi được");
        System.out.printf("%-20f %-20d", this.getNoiDen(), this.getSoNgayDiDuoc());
    }
}
