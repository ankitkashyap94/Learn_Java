package com.LearnJava;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class MarksToPercent {

    public static void main(String[] args) {

        String[] subs = {"English", "Hindi", "Science", "Maths", "Computers", "Env Science"};
        int[] marks = new int[subs.length];
        int maxMarks = subs.length * 100;


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < subs.length; i++) {

            System.out.println("Enter mark for Subject = " + subs[i]);
            int mcheck = sc.nextInt();

            if (mcheck > 100) {
                System.out.println("Enter number below 100");
                i = i - 1;
            } else
                marks[i] = mcheck;

        }
        convertPercent(marks);

    }

    //Logic
    public static void convertPercent(int[] marks) {

        int total = 0;
        int totalSubs = 0;

        for (int mark : marks) {
            totalSubs++;
            System.out.print(mark + " ");

            total = total + mark;

        }

        System.out.println(total);
        System.out.println(totalSubs);

        double percent = ((double) (total) / (totalSubs * 100)) * 100;

        DecimalFormat dfor = new DecimalFormat("#.##");

        System.out.println(dfor.format(percent));


    }


}


