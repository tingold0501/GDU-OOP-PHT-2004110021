package com.tinph2004110021.baitapvenhaBuoi6;

public class Account {
    private long soTk;
    private String tenTk;
    private double soTien;
    
    @Override
    public String toString() {
        return "Account [soTien=" + soTien + ", soTk=" + soTk + ", tenTk=" + tenTk + "]";
    }
    public Account(long soTk, String tenTk, double soTien) {
        this.soTk = soTk;
        this.tenTk = tenTk;
        this.soTien = soTien;
    }
    public Account(){

    }
    public long getSoTk() {
        return soTk;
    }
    public void setSoTk(long soTk) {
        this.soTk = soTk;
    }
    public String getTenTk() {
        return tenTk;
    }
    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }
    public double getSoTien() {
        return soTien;
    }
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
   
}
