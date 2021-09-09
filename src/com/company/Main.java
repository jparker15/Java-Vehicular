package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ticks = 0;
        int distance = 1000;
        Vehicle whip = new Vehicle(1995, "Volvo","850","White",new Diesel());
        Vehicle whipe = new Vehicle(1995, "Volvo","850","Pink",new Electric());
        Vehicle whip3 = new Vehicle(1995, "Volvo","850","Black",new Diesel());

        Vehicle choosenVeh = whip;
        Engine choosenEng;

        Diesel d = new Diesel();
        Electric e = new Electric();
//
//        whipe.start();
//        whipe.stop();
//        System.out.println(whipe);

        System.out.println("What type of engine");
        System.out.println("1. Diesel");
        System.out.println("2. Electric");
        int engineChoice = scanner.nextInt();

        switch(engineChoice){
            case 1 -> System.out.println(d);
            case 2 -> System.out.println(e);
            default -> System.out.println("Flintstone it");
        }

        System.out.println("Which vehicle would you like ?");
        int vehicleChoice = scanner.nextInt();
        switch (vehicleChoice) {
            case 1 -> System.out.println(whip);
            case 2 -> System.out.println(whipe);
            case 3 -> System.out.println(whip3);
            default -> System.out.println("You get nothing");
        }

        while(true){
            System.out.println("What would you like to do");
            System.out.println("1. Accelerate");
            System.out.println("2. Coast");
            System.out.println("3. Decelerate");
            int choice = scanner.nextInt();
            switch(choice){
                case 1 -> choosenVeh.accelerate();
                case 2 -> choosenVeh.coast();
                case 3 -> choosenVeh.decelerate();
            }
            ticks++;
            distance -= choosenVeh.getMPH();

            System.out.println(choosenVeh + "MPH: " + choosenVeh.getMPH() + " | ");
            System.out.println("\nDistance: " + distance + " mi\n");
            if(distance <= 0){
                System.out.println("You've reached your destination!");
                System.out.println("It took " + ticks + " ticks to get there!");
                break;
            }

        }
    }
}
