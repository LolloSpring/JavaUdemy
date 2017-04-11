package com.lorenzotait;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of float = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        double amountPounds = 200d;
        double amountKilos = amountPounds * 0.45359237d;
        System.out.println("The amount of Kilos is = " + amountKilos);

        double pi = 3.141_592_7d;
    }
}
