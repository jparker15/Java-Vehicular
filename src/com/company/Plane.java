package com.company;

import java.util.ArrayList;
import java.util.List;

public class Plane extends Vehicle {
    boolean isLanding;
    List<Tire> tires = new ArrayList<>();

    public Plane(Engine engine, boolean isLanding) {
        super(engine,"Plane",true,false,false,false,20);

        this.isLanding = isLanding;
    }

    public void addTire(Tire tire){
        tires.add(tire);
//        System.out.println(tires.size() + " total tires");

    }
    public void removeTire(){
        tires.remove(0);
        System.out.println("remove tire");
    }
    public void replaceTire(int tireIndex, Tire replacement){
        tires.remove(tireIndex);
        tires.add(replacement);
        System.out.println("tire replaced");
    }
}
