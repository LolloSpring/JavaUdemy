package com.lorenzotait;

/**
 * Created by LorenzoTait on 18/04/17.
 */
public class SportCar extends Car {
    private int maxSpeed;
    private int maxBreak;

    public SportCar (int maxSpeed, int maxBreak){
        super(4,"Sport Engine", 2,"Turbo", "Red", "Ferrari", "F23", 1);
        this.maxSpeed = maxSpeed;
        this.maxBreak = maxBreak;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxBreak() {
        return maxBreak;
    }

    public void setMaxBreak(int maxBreak) {
        this.maxBreak = maxBreak;
    }

    public void steer(int direction){
        System.out.println("SportCar.steer() is called");
        super.steer();
    }

    public void changeGears(int numberGearsToChange){
        System.out.println("SportCar.changeGears() is called");
        super.changeGears(numberGearsToChange);
    }

    public void move (int speed){
        System.out.println("SportCar.move() is called");


        if (speed < 0){
            if (speed < this.maxBreak){
                System.out.println("DANGER!!! You can't break like this!");
            } else {
                System.out.println("Your SuperCar is decreasing the speed by " + speed);
            }
        } else if (speed == 0) {
            super.move();
        } else {
            if (speed>maxSpeed){
                System.out.println("DANGER!!! You can't go fast like this!");
            } else {
                System.out.println("Your SuperCar is increasing the speed by " + speed);
            }
        }
    }
}
