package com.tinph2004110021.buoi3;

public class MyInteger {
    private int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public MyInteger(int initialValue){
        this.value = initialValue;
    }
    public MyInteger()
    {
        this(0);
    }
    public MyInteger(MyInteger other){
        this(other.value);
    }
    public boolean greaterThan (MyInteger other){
        return(this.value > other.value);
    }
    public boolean lessThan(MyInteger other){
        return (other.greaterThan(this));
    }
    public MyInteger increment(){
        value++;
        return this;
    }
}
