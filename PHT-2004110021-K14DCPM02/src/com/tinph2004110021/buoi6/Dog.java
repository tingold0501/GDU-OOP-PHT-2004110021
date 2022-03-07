package com.tinph2004110021.buoi6;

public class Dog extends Chase {
    @Override
    protected void eat() {
        System.out.println("Dog Eating...");
    }
    @Override
    protected void makeNoise() {
        System.out.println("Dog Make Noise...");
    }
    @Override
    protected void chase() {
       System.out.println("Dog Chase Cat....");
    }
    @Override
    protected void roam() {
        System.out.println("Dog Roaming...");
    }
}
