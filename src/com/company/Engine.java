package com.company;

 abstract class Engine {

    protected boolean isRunning = false;
    private String type;

    public Engine (String type){
        this.type = type;
    }

    abstract void start();

    abstract void stop();

    public String toString(){
        return type;
    }

}
