package com.tinph2004110021.buoi4;

import com.tinph2004110021.buoi2.Shape;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square sp = new Square();
        Circle cl = new Circle();
        Triangle tg = new Triangle();
        Amoeba ab = new Amoeba("Music.hif", 3.4, 5.4);
        // Shape shape = new Shape();
        // Shape shape2 = new Circle();
        ab.rotate();
        ab.playSound();
        
    }
}
