package com.lorenzotait;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int                       THESE ARE PRIMITIVES TYPES
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";
        System.out.println("This is the string = " + myString);
        myString = myString + " and this is more";
        System.out.println("This is the string = " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("This is the string" + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is" + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("my lastString is = " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("my lastString is = " + lastString);
    }
}
