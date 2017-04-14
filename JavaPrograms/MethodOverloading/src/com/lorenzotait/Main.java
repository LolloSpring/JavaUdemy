package com.lorenzotait;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("newScore is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println("The result is = " + calcFeetAndInchesToCentimeters(-1,1));

        System.out.println("The 2nd result is = " + calcFeetAndInchesToCentimeters(100));
    }

    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (){
        System.out.println("No score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if ((feet>=0)&&((inches>=0)&&(inches<=12))){
            return (((feet*12)+inches)*2.54);
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches){
        if (inches>=0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.printf(inches + " inches is equal to " + feet + " feet and remaining inches "+ remainingInches + " inches" );
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1;
        }
    }
}
