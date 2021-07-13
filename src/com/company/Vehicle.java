package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    Engine engine;
    String type;
    boolean isLand;
    boolean isWater;
    boolean isAir;
    boolean isSpace;
    List<Passenger> passengers = new ArrayList<>();
    int maxPassengers;

    public Vehicle(
                    Engine engine,
                    String type,
                   boolean isAir,
                   boolean isLand,
                   boolean isSpace,
                   boolean isWater,
                   int maxPassengers){
        this.engine = engine;
        this.type = type;
        this.isAir = isAir;
        this.isLand = isLand;
        this.isSpace = isSpace;
        this.isWater = isWater;
        this.maxPassengers = maxPassengers;
    }

    public Vehicle(Engine engine){
        this.engine = engine;
    }

    public void turnOn (){
        System.out.println("On!");
    }
    public void turnOff (){
        System.out.println("Off!");
    }

    public void displayPassengers(){
        for(Passenger p: passengers){
            System.out.println(p);
        }
    }

    public void addPassenger(Passenger p){
        passengers.add(p);

    }

    public void removePassenger(){
        System.out.println("remove passenger");
    }


}
