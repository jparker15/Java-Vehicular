package com.company.Vehicular;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{
    List<Tire> tires = new ArrayList<>();

//    public Car( Engine engine,
//                String type,
//                boolean isAir,
//                boolean isLand,
//                boolean isSpace,
//                boolean isWater){
//        super(engine,type,isAir,isLand,isSpace,isWater);
//        this.type = "Car";
//        this.isAir = false;
//        this.isLand = true;
//        this.isSpace = false;
//        this.isWater = false;
//    }
    public Car(Engine engine){
        super(engine,"Car",false,true,false,false,4);

    }

    public void addTire(Tire tire){
        tires.add(tire);
//        System.out.print(tires.size() + " total tires");

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
