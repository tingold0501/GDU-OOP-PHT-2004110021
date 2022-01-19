package com.tinph2004110021.buoi4;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square sp = new Square();
        Circle cl = new Circle();
        Triangle tg = new Triangle();
        Amoeba ab = new Amoeba("Music.hif", 3.4, 5.4);
        ab.rotate();
        ab.playSound();
        // sp.soundSquare();
        // sp.roateSquare();
        // cl.soundCircle();
        // cl.roateCircle();
        // tg.xoay();
        // tg.soundTriangle();
    }
}
