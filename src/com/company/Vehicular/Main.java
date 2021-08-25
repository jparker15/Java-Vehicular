package com.company.Vehicular;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Engine gas = new Engine("Gasoline",false,20);
        Engine petrol = new Engine("Petrol",false,60);
        Engine electric = new Engine("Electric",false,0);

        Car car = new Car(gas);
        Tire tire = new Tire(20,40);
        for(int i = 0; i < 4; i++){
            car.addTire(tire);

        }

        Boat boat = new Boat(electric,5000);

        Plane plane = new Plane(petrol,false);

        for(int i = 0; i < 6; i++){
            plane.addTire(tire);
        }

        for(int i = 0; i < 10; i++){
            Passenger customer = new Passenger("Client "+i, i * 35);
            if(i % 2 == 0){
                car.addPassenger(customer);
            }else{
                plane.addPassenger(customer);
            }
        }

        System.out.println("plane:" + plane.passengers);
        System.out.println("car:" + car.passengers);
    }
}
