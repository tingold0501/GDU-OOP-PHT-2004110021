package com.tinph2004110021.buoi4;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square sp = new Square();
        Circle cl = new Circle();
        Triangle tg = new Triangle();
        sp.square();
        sp.soundSquare();
        sp.roateSquare();
        cl.circle();
        cl.soundCircle();
        cl.roateCircle();
        tg.triangle();
        tg.xoay();
        tg.soundTriangle();
    }
}
