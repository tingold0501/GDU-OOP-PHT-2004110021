package com.tinph2004110021.buoi6;

public class Kitchen {
    private Stove stove;
    private Sink sink;
    public Kitchen(){
        
    }
    public Stove getStove() {
        return stove;
    }
    public void setStove(Stove stove) {
        this.stove = stove;
    }
    public Sink getSink() {
        return sink;
    }
    public void setSink(Sink sink) {
        this.sink = sink;
    }
    public Kitchen(Stove stove, Sink sink) {
        this.stove = stove;
        this.sink = sink;
    }
   
}
