package com.tinph2004110021.buoi6;

public class Lion extends Canime {
    @Override
    protected void makeNoise() {
        System.out.println("Lion Make Noise...");
    }
    @Override
    public void eat() {
        System.out.println("Lion Eating...");
    }
    @Override
    protected void roam() {
        System.out.println("Lion Roaming...");
    }
}
