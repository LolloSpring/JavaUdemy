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

        int secondScore = 60;
        if (topScore > secondScore && topScore < 100)
            System.out.println("Greater than secondScore and less than 100");

    }
}
