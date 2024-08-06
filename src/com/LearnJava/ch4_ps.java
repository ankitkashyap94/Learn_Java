package com.LearnJava;

import java.util.Scanner;

public class ch4_ps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Quest2
        /*System.out.println("Enter mark on Maths");
        int m1 = sc.nextInt();
        System.out.println("Enter mark on physics");
        int m2 = sc.nextInt();
        System.out.println("Enter mark on Chemistry");
        int m3 = sc.nextInt();

        float avg = (m1 + m2 + m3) / 3.0f;

        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congrats ! You have been promoted.");
        }else {
            System.out.println("Sorry ! You have been not promoted. Please try again.");
        }

        System.out.println("your avg marks is: " + avg);*/

        //Quest3
        /*double tax = 0;
        float income = 7.0f;
        if (income <= 2.5) {
            tax = tax + 0;
            System.out.println("Payble Tax" + tax);
        }
        else if (income > 2.5f && income <= 5.0f) {
            tax = tax + 0.05 * (income - 2.5f);
            System.out.println("Payble Tax" + tax);
        }
        else if (income > 5.0 && income <= 10.0) {
            tax = tax + 0.05 * (income - 2.5f);
            System.out.println("Payble Tax" + tax);
        }
        else if (income > 10.0) {
            tax = tax + (30 / income) * 100;
            System.out.println("Payble Tax" + tax);
        }*/

        //Quest4

//        int day = 2;
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//
//        }

        //Quest6

        String website = "www.google.com";
        if(website.endsWith(".com")){
            System.out.println("This is an commercial website");
        }else if(website.endsWith(".org")){
            System.out.println("This is and organisation website");
        }else if(website.endsWith(".in")){
            System.out.println("This is an indian website");
        }






    }
}
