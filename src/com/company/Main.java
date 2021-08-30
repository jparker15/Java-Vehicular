package com.company;

public class Main {
    public static void main(String[] args) {
        Vehicle whipe = new Vehicle(1995, "Volvo","850","Black",new Diesel());

        whipe.start();
        whipe.stop();
        System.out.println(whipe);
    }
}
