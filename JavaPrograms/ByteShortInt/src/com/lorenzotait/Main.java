package com.lorenzotait;

public class Main {

    public static void main(String[] args) {

        // Integer has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        int myTotal = (myMinValue/2);
        System.out.println("My total = " + myTotal);

        // Byte has a width of 8
        byte myByteValue = -128;

        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("MyNewByteValue = " + myNewByteValue);


        // Short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("MyNewShortValue = " + myNewShortValue);


        // Long has a width of 64
        long myLongValue = 100L;


        byte a = 87;
        short b = 3400;
        int c = 2_780_003;
        long d = (50000L + 10L * (a+b+c));
        short f =  (short) (50000L + 10L * (a+b+c));

        System.out.println("LongValue = " + d);
        System.out.println("ShortValue = " + f);


    }
}
