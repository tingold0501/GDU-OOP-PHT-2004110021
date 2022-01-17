package com.tinph2004110021.buoi3;

public class Dog {
    int size;
    String breed, name;
    public Dog(){
        
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Dog(int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }
    public void  bard(){
        if(size < 14){
            System.out.println("Ruff! Ruff!");
        }
        else{
            System.out.println("Wroff! Wroff!");
        }
    }
    public void setBigger()
    {
        size += 5;
    }
    public void run()
    {
        System.out.println("Runing...");
        this.bard();
    }
    
}
