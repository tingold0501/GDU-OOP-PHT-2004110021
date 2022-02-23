package com.tinph2004110021.buoi4;

public class Amoeba {
    private String fileSound;
    private double xPoint, yPoint;

    public String getFileSound() {
        return fileSound;
    }

    public void setFileSound(String fileSound) {
        this.fileSound = fileSound;
    }

    public double getxPoint() {
        return xPoint;
    }

    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    public double getyPoint() {
        return yPoint;
    }

    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    public Amoeba(String fileSound, double xPoint, double yPoint) {
        this.fileSound = fileSound;
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    public Amoeba() {

    }

    public void playSound() {
        System.out.println("Play " + fileSound + " Music");
    }

    public void rotate() {
        System.out.println("Đang Xoay 360 Độ... Tại xPoint: " + this.xPoint + " Tại yPoint: " + this.yPoint);
    }
}
