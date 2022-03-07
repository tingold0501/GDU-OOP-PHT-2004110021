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
   
   
}
