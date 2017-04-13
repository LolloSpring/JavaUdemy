package com.lorenzotait;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);


        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 2 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result + 1 ;
        System.out.println("The result now is " + result);
        result++;
        System.out.println("The result now is " + result);
        result--;
        System.out.println("The result now is " + result);

        result += 2;
        System.out.println("The result now is " + result);
        result *= 10;
        System.out.println("The result now is " + result);
        result -= 10;
        System.out.println("The result now is " + result);
        result /= 10;
        System.out.println("The result now is " + result);


        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien");


        int topScore = 80;
        if (topScore != 100)                // <= or >= or < or >
            System.out.println("Print the topScore " + topScore);

        if (topScore >= 100)                // <= or >= or < or >
            System.out.println("Print the topScore " + topScore);

        int secondScore = 95;
        if ((topScore > secondScore) && (topScore < 100))
            System.out.println("Greater than secondScore and less than 100");

        if ((topScore > 90) || (secondScore <= 90))
            System.out.println("One of these test is true");

        int newValue = 50;
        //if (newValue = 50)
        //    System.out.println("This is an error");
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar = true)
            System.out.println("This is not suppose to happen");
        if (isCar)                  // this is MUCH BETTER
            System.out.println("This is not suppose to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        // CHALLENGE

        double a = 20d;
        double b = 80d;
        double c = (a+b)*25d;
        System.out.println(c);
        double d = c % 40;
        System.out.println(d);
        if (d<=20)
            System.out.println("Total was over the limit");


    }
}
