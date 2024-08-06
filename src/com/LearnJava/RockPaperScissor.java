package com.LearnJava;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        int j = 0;
        while (i < 5) {

            String[] moves = {"Rock", "Paper", "Scissor"};

            System.out.println("Let Computer to choose its move.");

            System.out.println();

            String computerMove = moves[new Random().nextInt(moves.length)];

            System.out.println("Computer has chosen its move");

            System.out.println(computerMove);


            System.out.println("Now ! its your turn to choose the move");

            String userMove = sc.nextLine();

            System.out.println("User has chosen its move");
            System.out.println();


        }


    }
}
