package com.lorenzotait;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        displayHighScorePosition("Lorenzo", calculateHighScorePosition(1500));
        displayHighScorePosition("Sefa", calculateHighScorePosition(900));
        displayHighScorePosition("Chloe", calculateHighScorePosition(400));
        displayHighScorePosition("Gianluca", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your finalScore was " + finalScore);
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position "+ position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        } else if ((score>=500)&&(score<1000)){
            return 2;
        } else if ((score>=100)&&(score<500)){
            return 3;
        } else {
            return 4;
        }
    }
}

