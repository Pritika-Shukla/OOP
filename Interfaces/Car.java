package Interfaces;

public class Car implements Engine,brake,media{
  public void start() {
      System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    public void acc(){
       System.out.println("acc");
    }
    public void brake(){
        System.out.println("brake");

    }

}
