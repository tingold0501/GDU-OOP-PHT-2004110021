package com.tinph2004110021.buoi6;

public class Cat extends Canime {
    @Override
    public void eat() {
        System.out.println("Cat Eating...");
    }
    @Override
    protected void makeNoise() {
        System.out.println("Cat Make Noise...");
    }
    @Override
    protected void chase() {
        System.out.println("Cat Chase Chuot....");
    }
    @Override
    protected void roam() {
        System.out.println("Cat Roaming...");
    }
}
