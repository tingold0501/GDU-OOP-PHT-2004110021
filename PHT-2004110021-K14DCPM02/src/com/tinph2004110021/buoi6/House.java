package com.tinph2004110021.buoi6;

public class House {
    private Kitchen kitchen;
    private Room room;
    public House(){
        
    }
    public Kitchen getKitchen() {
        return kitchen;
    }
    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public House(Kitchen kitchen, Room room) {
        this.kitchen = kitchen;
        this.room = room;
    }
   
}
