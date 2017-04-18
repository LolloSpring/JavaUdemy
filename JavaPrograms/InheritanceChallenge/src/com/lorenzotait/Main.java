package com.lorenzotait;

public class Main {

    public static void main(String[] args) {
        Vehicle TomTractor = new Vehicle(4,"Fiat",2,"Benzina","Blue", "Iveco");
        System.out.println(TomTractor.getGears());
        System.out.println(TomTractor.getEngine());
        System.out.println(TomTractor.getShutters());
        System.out.println(TomTractor.getFuelling());
        System.out.println(TomTractor.getColor());
        System.out.println(TomTractor.getBrand());

        TomTractor.steer();
        TomTractor.changeGears(2);
        TomTractor.move();
        TomTractor.changeGears(6);


        Car BobCar = new Car(4,"BMW", 3, "Diesel", "White", "BMW", "Z4", 2);
        System.out.println(BobCar.getGears());
        System.out.println(BobCar.getEngine());
        System.out.println(BobCar.getShutters());
        System.out.println(BobCar.getFuelling());
        System.out.println(BobCar.getColor());
        System.out.println(BobCar.getBrand());
        System.out.println(BobCar.getModel());
        System.out.println(BobCar.getSeats());

        BobCar.steer();
        BobCar.changeGears(2);
        BobCar.move();
        BobCar.changeGears(8);


        SportCar MarkSportCar = new SportCar(330, 100);
        System.out.println(MarkSportCar.getGears());
        System.out.println(MarkSportCar.getEngine());
        System.out.println(MarkSportCar.getShutters());
        System.out.println(MarkSportCar.getFuelling());
        System.out.println(MarkSportCar.getColor());
        System.out.println(MarkSportCar.getBrand());
        System.out.println(MarkSportCar.getModel());
        System.out.println(MarkSportCar.getSeats());
        System.out.println(MarkSportCar.getMaxBreak());
        System.out.println(MarkSportCar.getMaxSpeed());

        MarkSportCar.setMaxBreak(-110);

        MarkSportCar.steer();
        MarkSportCar.changeGears(1);
        MarkSportCar.changeGears(6);
        MarkSportCar.move(200);
        MarkSportCar.move(-50);
        MarkSportCar.move(0);
        MarkSportCar.move(400);
        MarkSportCar.move(-300);


















    }
}
