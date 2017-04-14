package com.lorenzotait;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count!=6){
            System.out.println("Print count: " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count==6)
                break;;
            System.out.println("Prin count: "+ count);
            count++;
        }


        count = 1;
        do {
            System.out.println("Count value was: " + count);
            count++;

            if (count>100)
                break;
        } while (count != 6);

        int number = 5;
        int finishNumber = 20;
        int numberEven = 0;
        while (number <= finishNumber){
            if (!isEvenNumber(number)){
                number++;
                continue;
            }

            System.out.println(number + " is an even number");
            number++;

            numberEven++;
            if (numberEven >= 5)
                break;

        }
        System.out.println("The total numbero of even number is: "+ numberEven);


    }

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        } else {
            return false;
        }
    }
}
