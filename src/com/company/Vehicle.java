package com.company;

public class Vehicle  {

    int year;
    String make;
    String model;
    String color;
    Engine engine;

    public Vehicle(int year, String make, String model, String color, Engine engine){
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    @Override
    public String toString(){
       return "Year: " + year + " | " + "Make: " + make + " | " + "Model: "+ model + " | " + "Color: " + color + " | " + "Engine: " + engine + " | ";
    }
}
