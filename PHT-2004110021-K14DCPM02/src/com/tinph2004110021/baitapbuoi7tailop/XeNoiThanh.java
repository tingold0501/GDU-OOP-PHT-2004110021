package com.tinph2004110021.baitapbuoi7tailop;

public class XeNoiThanh extends CompanyTravelV {
    private int soTuyen;
    private double kmDiDuoc;
    CompanyTravelV companyTravelV = new CompanyTravelV();
    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getKmDiDuoc() {
        return kmDiDuoc;
    }

    public void setKmDiDuoc(double kmDiDuoc) {
        this.kmDiDuoc = kmDiDuoc;
    }

    public XeNoiThanh(int soTuyen, double kmDiDuoc) {
        this.soTuyen = soTuyen;
        this.kmDiDuoc = kmDiDuoc;
    }

    public XeNoiThanh(int idChuyenXe, int soXe, String hoTenTaiXe, double doanhThu, int soTuyen, double kmDiDuoc) {
        super(idChuyenXe, soXe, hoTenTaiXe, doanhThu);
        this.soTuyen = soTuyen;
        this.kmDiDuoc = kmDiDuoc;
    }

    public XeNoiThanh() {

    }

    @Override
    public void nhapChuyenXe() {
        companyTravelV.nhapChuyenXe();
        System.out.println("Nhập Số Tuyến:");
        this.soTuyen = sc.nextInt();
        System.out.println("Nhập Số Km Đi Được:");
        this.kmDiDuoc = sc.nextDouble();
    }

    @Override
    public void xuatDanhSachXe() {
        companyTravelV.xuatDanhSachXe();
        System.out.printf("%-20S %-20S\n", "số tuyến", "số km đi được");
        System.out.printf("%-20f %-20d", this.getKmDiDuoc(), this.getSoTuyen());
    }
}
