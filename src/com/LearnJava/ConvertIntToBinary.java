package com.LearnJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConvertIntToBinary {
    public static void main(String[] args) {

        String bin = "" ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");

        int input = sc.nextInt();

        while(input>0) {
            bin = bin + ( (input % 2) == 0 ? "0" : "1");
            input = input /2;
        }

//        int numbin = Integer.parseInt(String.valueOf(bin));
//
//        int rev = 0;
//
//        Integer.reverse(numbin);



        System.out.println(bin + " " + bin.getClass().getName());


    }
}

