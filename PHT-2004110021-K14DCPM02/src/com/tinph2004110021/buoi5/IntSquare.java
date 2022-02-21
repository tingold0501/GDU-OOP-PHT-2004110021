package com.tinph2004110021.buoi5;

public class IntSquare {
    private int squareValue;
    int getSquare(int value){
        this.squareValue = this.calcuateSquare(value);
        return this.squareValue;
    }
    private int calcuateSquare(int value){
        return (int)Math.pow(value, 2);
    }
}
