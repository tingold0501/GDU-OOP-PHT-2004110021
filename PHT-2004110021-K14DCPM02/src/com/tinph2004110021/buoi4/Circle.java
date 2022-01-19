package com.tinph2004110021.buoi4;

public class Circle {
    String fileSound;

    public String getFileSound() {
        return fileSound;
    }

    public void setFileSound(String fileSound) {
        this.fileSound = fileSound;
    }

    public Circle(String fileSound) {
        this.fileSound = fileSound;
    }
    public Circle(){
        
    }
    public void circle(){
        System.out.println("    ------");
        System.out.println("  -         -");
        System.out.println(" -           -");
        System.out.println("  -         -");
        System.out.println("    ------");
    }
    public void soundCircle(){
        System.out.println("Ting Ting Ting");
    }
    public void roateCircle(){
        System.out.println("Đang xoay 360 độ...");
    }
}
