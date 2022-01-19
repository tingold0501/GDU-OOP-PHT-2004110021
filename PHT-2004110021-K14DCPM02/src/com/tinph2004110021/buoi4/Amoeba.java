package com.tinph2004110021.buoi4;

public class Amoeba {
    String fileSound;

    public String getFileSound() {
        return fileSound;
    }

    public void setFileSound(String fileSound) {
        this.fileSound = fileSound;
    }

    public Amoeba(String fileSound) {
        this.fileSound = fileSound;
    }
    public Amoeba(){

    }
    public void playSound(){
        System.out.println("Play " + fileSound + " Music");
    }
    public void rotate(){
        System.out.println("Đang Xoay 360 Độ...");
    }
}
