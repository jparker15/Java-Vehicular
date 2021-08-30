package com.company;

public class Diesel extends Engine{

    String type = "Diesel";

    @Override
    void start() {
        isRunning = true;
        System.out.println("Diesel is running: " + isRunning);
    }

    void stop(){
        isRunning = false;
        System.out.println("Diesel is running: " + isRunning);
    }
}
