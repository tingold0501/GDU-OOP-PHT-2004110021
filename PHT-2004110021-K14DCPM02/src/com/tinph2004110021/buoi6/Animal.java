package com.tinph2004110021.buoi6;

public abstract class Animal {
    private String picture, food;
    private int hunger;
    protected void makeNoise(){

    }
    public void eat(){
        System.out.println("Eating...");
    }
    protected void sleep(){
        System.out.println("Spleeping...");
    }
    protected void roam(){
        System.out.println("Roaming...");
    }
}
