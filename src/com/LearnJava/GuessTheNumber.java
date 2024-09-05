package com.LearnJava;


import java.util.Random;
import java.util.Scanner;

class Game {

    Scanner sc = new Scanner(System.in);
    private int userInput;
    int counter = 0;
    int computerInput = setComputerInput();

    private int setComputerInput() {
        Random random = new Random();
        int compInt = random.nextInt(90);
        return compInt;
    }


    public int getCompInput() {
        return computerInput;
    }


    public int setUserInput() {
        System.out.println("Enter user input");
        int userIn = sc.nextInt();
        this.userInput = userIn;
        return userInput;
    }

    public int getUserInput() {
        return userInput;
    }


    public boolean guessNumber() {

        if (userInput > computerInput) {
            System.out.println("Your number is higher");
            counter++;
            setUserInput();
        } else if (userInput < computerInput) {
            System.out.println("Your number is lower");
            counter++;
            setUserInput();
        } else if (userInput == computerInput) {
            System.out.println("You win");
            System.out.println("Your score is: " + counter);
            return true;
        }
        return false;
    }


}


public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        Game gm = new Game();
        gm.setUserInput();
        while (gm.guessNumber() != true) {
            gm.guessNumber();
        }


    }
}
