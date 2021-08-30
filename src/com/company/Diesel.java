package com.company;

public class Diesel extends Engine{


    @Override
    void run() {
        isRunning = true;
        System.out.println("Diesel is running: " + isRunning);
    }
}
