package com.lorenzotait;

/**
 * Created by LorenzoTait on 18/04/17.
 */
public class Car extends Vehicle {
    private String model;
    private int seats;


    public Car(int gears, String engine, int shutters, String fuelling, String color, String brand, String model, int seats ){
        super(4, engine, shutters, fuelling, color, brand);
        this.model = model;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void steer(int direction){
        System.out.println("Car.steer() is called");
        super.steer();
    }

    public void changeGears(int numberGearsToChange){
        System.out.println("Car.changeGears() is called");
        super.changeGears(numberGearsToChange);
    }

    public void move(){
        System.out.println("Car.move() is called");
        super.move();
    }
}
