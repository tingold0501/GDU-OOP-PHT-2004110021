package com.tinph2004110021.buoi4;

public class Square {
    private String fileSound;

    public String getFileSound() {
        return fileSound;
    }

    public void setFileSound(String fileSound) {
        this.fileSound = fileSound;
    }

    public Square(String fileSound) {
        this.fileSound = fileSound;
    }
    public Square(){

    }
    // public void square(){
    //     System.out.println("---------------");
    //     System.out.println("|             |");
    //     System.out.println("|             |");
    //     System.out.println("|             |");
    //     System.out.println("---------------");
    // }
    public void soundSquare(){
        System.out.println("Teng Teng Teng");
    }
    public void roateSquare()
    {
        System.out.println("Đang Xoay 360 Độ...");
    }
}
