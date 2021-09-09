package com.company;

public class Vehicle  {

   private int year;
   private String make;
   private String model;
   private String color;
   private Engine engine;
   private int accelerationRate = 10;
   private int coastRate = 3;
   private int brakeRate = 5;
   private int MPH = 0;

   public Vehicle(){

   }

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

    public int getMPH(){
       return MPH;
    }

    public void accelerate(){
       if(MPH >= 125) {
           System.out.println("\nREDLINE!\n");
       }else{
           System.out.println("\nGAS GAS GAS\n");
           MPH += accelerationRate;
       }
    };

    public void coast(){
        if(MPH > 0){
            System.out.println("\nCoast\n");
            MPH -= coastRate;
        }else{
            System.out.println("\nVehicle is stopped\n");
        }
    };

    public void decelerate(){
        if(MPH > 0){
            System.out.println("\nBrake\n");
            MPH -= coastRate;
        }else{
            System.out.println("\nVehicle is stopped\n");
        }
    };

    @Override
    public String toString(){
       return "Year: " + year + " | " + "Make: " + make + " | " + "Model: "+ model + " | " + "Color: " + color + " | " + "Engine: " + engine + " | ";
    }
}
