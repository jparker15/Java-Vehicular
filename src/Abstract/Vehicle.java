package Abstract;

public class Vehicle extends Engine{


    int year;
    String make;
    String model;
    String color;
    boolean isRunning = false;


    public void startEngine(){
        if(!isRunning){
            isRunning = true;
            System.out.println("Engine is running");
        }else{
            System.out.println("Engine already running");
        }
    }

    public void stopEngine(){
        if(isRunning){
            isRunning = false;
            System.out.println("Engine off");
        }else{
            System.out.println("Engine already off");
        }
    }


}
