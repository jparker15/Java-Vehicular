package com.company;

public class Electric extends Engine{

    String type = "Electric";
    @Override
    public void start(){
        isRunning = true;
        System.out.println("Electric is running: " + isRunning);
    }

    public void stop(){
        isRunning = false;
        System.out.println("Electric is running: " + isRunning);
    }
}
