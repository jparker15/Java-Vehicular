package com.company;

public class Passenger {

    String name;
    int weight;

    public Passenger(){

    }

    public Passenger(String name, int weight){
        this.name = name;
        this.weight = weight;

    }

    @Override

    public String toString(){
        return "Name:" + name + "  " + "Weight:" + weight + "\n";
     }
}
