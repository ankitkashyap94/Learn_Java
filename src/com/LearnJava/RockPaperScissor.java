package com.LearnJava;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("0. Rock \t 1. Paper \t 2. Scissor");
        System.out.println();
        System.out.println("Enter Your Choice");
        int userIn = sc.nextInt();

        Random random = new Random();
        int compIn = random.nextInt(3);

        if(userIn<3){
            if(userIn == compIn){
                System.out.println("Draw");
            }else if(userIn == 0 && compIn == 1 || userIn == 1 && userIn == 0 || userIn == 2 && userIn == 1){
                System.out.println("You Win");
            }else {
                System.out.println("Computer Wins");
            }
        }else{
            System.out.println(new IllegalArgumentException("Value is invalid"));
        }

    }
}
