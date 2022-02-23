package com.tinph2004110021.buoi6;

public class Cat extends Animal {
    @Override
    protected void eat() {
        System.out.println("Cat Eating...");
    }
    @Override
    protected void makeNoise() {
        System.out.println("Cat Make Noise...");
    }
    public void chaseButterFly(){
        System.out.println("Cat Chase Butter Fly...");
    }
}
