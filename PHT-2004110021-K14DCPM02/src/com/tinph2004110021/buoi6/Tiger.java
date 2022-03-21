package com.tinph2004110021.buoi6;

public class Tiger extends Canime {
    @Override
    public void eat() {
        System.out.println("Tiger Eating...");
    }
    @Override
    protected void makeNoise() {
        System.out.println("Tiger Make Noise...");
    }
    @Override
    protected void roam() {
        System.out.println("Tiger Roaming....");
    }
}
