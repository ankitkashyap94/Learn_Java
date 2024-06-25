package com.LearnJava;

import java.util.Scanner;

public class MarksToPercent {

    public static void main(String[] args) {

        String[] subs = {"English", "Hindi", "Science", "Maths", "Computers"};
        int[] marks = new int[subs.length];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<subs.length; i++){

            System.out.println("Enter mark for Subject = " + subs[i]);
            marks = new int[]{sc.nextInt()};

        }


    }

    public void calculatePercentage(){


    }
}
