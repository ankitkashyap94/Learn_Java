package com.LearnJava;

public class DivideTwoIntegers {
    public static void main(String[] args) {

        //Divide two integers without using division, multiplication and mod.

        System.out.println(divideIntegers(50,5));


    }

    public static int divideIntegers(int dividend, int divisor){

        int result;
        int count = 0;

        do{
            result = dividend - divisor;
            count++;
            dividend = result;
        }while(result != 0);

        return count;
    }

}
