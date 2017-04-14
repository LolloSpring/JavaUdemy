package com.lorenzotait;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value==1){
            System.out.println("Value is 1");
        } else if (value==2){
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is no 1 or no 2");
        }


        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("Value was 3 or 4 or 5");
    //            break;

            default:
                System.out.println("Value was not 1 or 2");
        }

        char switchChar = 'A';

        switch(switchChar){
            case 'A':
                System.out.println("Letter was A");
                break;

            case 'B':
                System.out.println("Letter was B");
                break;

            case 'C':
                System.out.println("Letter was C");
                break;

            case 'D':
                System.out.println("Letter was D");
                break;

            case 'E':
                System.out.println("Letter was E");
                break;

            default :
                System.out.println("Letter was not A,B,C,D,E");
                break;
        }

        String month = "DEcember";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            case "december":
                System.out.println("Dec");
                break;

            default:
                System.out.println("Not sure");
                break;

        }





    }
}
