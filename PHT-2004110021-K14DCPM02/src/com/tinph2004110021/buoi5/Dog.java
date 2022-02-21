package com.tinph2004110021.buoi5;

public class Dog {
    private int size;
    private String breed, name;
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
    public Dog(){

    }
    public void setSize(int size){
        if(size > 0)
            this.size = size;
        else
            System.out.println("Size Không Hợp Lệ!!!");
    }
    public int getSize(){
        return this.size;
    }
}
