package com.company;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int loopCount = 0;
        char userResp = ' ';

        System.out.println("Welcome to the Guess a Number Game!");
        System.out.println("+++++++++++++++++++++++++++++++++++");

        Scanner scnr = new Scanner(System.in);
        int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println(randomNum);
        System.out.println("I'm thinking of a number between 1 and 100.");

        do {
            System.out.println("Go ahead, put in your guess:");
            int userGuess = scnr.nextInt();

            if (userGuess == randomNum) {
                System.out.println("Wow! You guessed it in " + loopCount + " tries!");
                System.out.println("Do you want to play again? (y/n):");
                userResp = scnr.next().charAt(0);
            } else {

                if (((randomNum - userGuess) < 0) && (userGuess - randomNum) <= 10) {
                    System.out.println("You're too high!");
                } else if (((randomNum - userGuess) > 0) && (randomNum - userGuess) <= 10) {
                    System.out.println("You're too low!");
                } else if (((randomNum - userGuess) < 0) && (userGuess  - randomNum) > 10) {
                    System.out.println("You're way too high!");
                } else if (((randomNum - userGuess) > 0) && (randomNum - userGuess) > 10) {
                    System.out.println("You're way too low");
                }


            }
            loopCount++;
        } while (userResp != 'n');
    }
}
