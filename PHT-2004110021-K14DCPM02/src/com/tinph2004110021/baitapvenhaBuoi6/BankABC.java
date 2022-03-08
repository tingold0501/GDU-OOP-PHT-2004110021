package com.tinph2004110021.baitapvenhaBuoi6;
public class BankABC {
    private long soTk;
    private String tenTk;
    private double soTienTTk;
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
    public double getSoTienTTk() {
        return soTienTTk;
    }
    public void setSoTienTTk(double soTienTTk) {
        this.soTienTTk = soTienTTk;
    }
    public BankABC(long soTk, String tenTk, double soTienTTk) {
        this.soTk = soTk;
        this.tenTk = tenTk;
        this.soTienTTk = soTienTTk;
    }
}
