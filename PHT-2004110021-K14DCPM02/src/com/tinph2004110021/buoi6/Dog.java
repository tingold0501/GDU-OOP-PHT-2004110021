package com.tinph2004110021.buoi6;

public class Dog extends Animal {
    @Override
    protected void eat() {
        System.out.println("Dog Eating...");
    }
    @Override
    protected void makeNoise() {
        System.out.println("Dog Make Noise...");
    }
    public void chaseCatFly(){
        System.out.println("Dog Chase Cat...");
    }
}
