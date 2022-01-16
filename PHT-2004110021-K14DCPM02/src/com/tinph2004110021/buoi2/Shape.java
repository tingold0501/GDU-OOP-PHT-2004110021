package com.tinph2004110021.buoi2;

import java.util.Scanner;

public class Shape {
    Scanner sc = new Scanner(System.in);
    String nameShape;
    public Shape()
    {

    }
    public String getNameShape() {
        return nameShape;
    }
    public void setNameShape(String nameShape) {
        this.nameShape = nameShape;
    }
    public Shape(String nameShape) {
        this.nameShape = nameShape;
    }
    public void soundSquare(){
        System.out.println("Teng Teng Teng");
    }
    public void square(){
        System.out.println("---------------");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("---------------");
    }
    public void circle(){
        System.out.println("    ------");
        System.out.println("  -         -");
        System.out.println(" -           -");
        System.out.println("  -         -");
        System.out.println("    ------");
    }
    public void triangle(){
        System.out.println("     +     ");
        System.out.println("   +   +   ");
        System.out.println("  +     +  ");
        System.out.println(" +++++++++ ");
    }
    public void soundCircle(){
        System.out.println("Ting Ting Ting");
    }
    public void soundTriangle()
    {
        System.out.println("Tang Tang Tang");
    }
    public void xoay()
    {
        System.out.println("Đang Xoay.....");
        System.out.println("360 Độ");
    }
    public void optionsShape(){
        do{
            System.out.println("=1======SQUARE======");
            System.out.println("=2======CIRCLE======");
            System.out.println("=3=====TRAINGLE=====");
            System.out.println("Bạn Chọn Hình Nào:");
            int chonH = sc.nextInt();
            switch(chonH)
            {
                case 1:
                square();
                xoay();
                soundSquare();
                break;
                case 2:
                circle();
                xoay();
                soundCircle();
                break;
                case 3:
                triangle();
                xoay();
                soundTriangle();
                break;
                default: System.out.println("Hình Không Hợp Lệ!!!!");
                break;
            }
        }while(true);
    }
}
