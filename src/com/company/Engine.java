package com.company;

public class Engine {
    String type;
    boolean isOn;
    int fuel;

    public Engine(){

    }

    public Engine (String type,boolean isOn, int fuel){
        this.type = type;
        this.isOn = isOn;
        this.fuel = fuel;
    }

    public void turnOn (){
        System.out.println("Enginge is On!");
    }
    public void turnOff (){
        System.out.println("Enginge is Off!");
    }
}
