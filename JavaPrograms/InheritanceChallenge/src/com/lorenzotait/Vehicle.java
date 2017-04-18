package com.lorenzotait;

/**
 * Created by LorenzoTait on 18/04/17.
 */
public class Vehicle {
    private int gears;
    private String engine;
    private int shutters;
    private String fuelling;
    private String color;
    private String brand;

    private int currentDirection;



    public Vehicle(int gears, String engine, int shutters, String fuelling, String color, String brand){
        this.gears = gears;
        this.engine = engine;
        this.shutters = shutters;
        this.fuelling = fuelling;
        this.color = color;
        this.brand = brand;

        this.currentDirection = 0;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getShutters() {
        return shutters;
    }

    public void setShutters(int shutters) {
        this.shutters = shutters;
    }

    public String getFuelling() {
        return fuelling;
    }

    public void setFuelling(String fuelling) {
        this.fuelling = fuelling;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void steer(int direction){
        System.out.println("Vehicle.steer() is called");
        this.currentDirection += direction;
    }

    public void changeGears(int numberGearsToChange){
        System.out.println("Vehicle.changeGears() is called");
        if (numberGearsToChange>this.gears){
            System.out.println("Number of gears is too much");
        } else {
            System.out.println("Gears changed");
        }
    }

    public void move(){
        System.out.println("Vehicle.move() is called");
    }
}
