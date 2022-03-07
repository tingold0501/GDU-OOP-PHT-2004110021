package com.tinph2004110021.buoi6;

public class Stove {
    private double width, length;
    private int numOfCookers;
    public Stove(){

    }
    public Stove(double width, double length, int numOfCookers) {
        this.width = width;
        this.length = length;
        this.numOfCookers = numOfCookers;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public int getNumOfCookers() {
        return numOfCookers;
    }
    public void setNumOfCookers(int numOfCookers) {
        this.numOfCookers = numOfCookers;
    } 
}
