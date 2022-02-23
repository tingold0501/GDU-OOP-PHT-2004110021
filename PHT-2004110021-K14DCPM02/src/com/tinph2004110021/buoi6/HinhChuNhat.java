package com.tinph2004110021.buoi6;

public class HinhChuNhat {
    private float dai = 0, rong = 0;
    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }
    private void ChuVi(){
        float s = dai * rong;
        System.out.println("Chu Vi: " + s);
    }
    private void DienTich(){
        float c = 2 * (dai + rong);
        System.out.println("Diện Tích: " + c);
    }
    public void KetQua(){
        System.out.println("Dài : " + dai);
        System.out.println("Rộng : " + rong);
        this.ChuVi();
        this.DienTich();
    }
}
