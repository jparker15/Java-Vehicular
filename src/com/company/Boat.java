package com.company;

public class Boat extends Vehicle{
    int maxLoad;

    public Boat(Engine engine, int maxLoad) {
        super(engine,"Boat",false,false,false,true,50);

        this.maxLoad = maxLoad;

    }


}
