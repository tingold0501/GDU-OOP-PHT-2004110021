package com.tinph2004110021.buoi4;

public class Triangle {
    String fileSound;

    public String getFileSound() {
        return fileSound;
    }

    public void setFileSound(String fileSound) {
        this.fileSound = fileSound;
    }

    public Triangle(String fileSound) {
        this.fileSound = fileSound;
    }
    public Triangle(){
        
    }
    // public void triangle(){
    //     System.out.println("     +     ");
    //     System.out.println("   +   +   ");
    //     System.out.println("  +     +  ");
    //     System.out.println(" +++++++++ ");
    // }
    public void soundTriangle()
    {
        System.out.println("Tang Tang Tang");
    }
    public void xoay()
    {
        System.out.println("Đang Xoay 360 Độ.....");
    }
}
