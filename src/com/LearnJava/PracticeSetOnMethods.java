package com.LearnJava;

public class PracticeSetOnMethods {

    public static void main(String[] args) {
        //multiplication(5);
        //pattern1(9);

//        int c = sumRec(10);
//        System.out.println(c);
//        int result = fib(7);
//        System.out.println(result);
//        pattern1Rec(5);
        pattern2Rec(5);
    }

    /////////////////////////////////////////////////////////////////
    public static void multiplication(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.format("%d * %d = %d\n", n, i, n * i);
        }
    }

    ////////////////////////////////////////////////////////////////
    public static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
/////////////////////////////////////////////////////////////////

    public static int sumRec(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n + sumRec(n - 1);
        }
    }
////////////////////////////////////////////////////////////////////

    public static int fib(int n) {

        if (n == 1 || n == 2) {
            return (n - 1);
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }
/////////////////////////////////////////////////////////////////////

    public static void pattern1Rec(int n) {

        if (n > 0) {
            pattern1Rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//////////////////////////////////////////////////////////////////////

    public static void pattern2Rec(int n) {

        for(int i=n; i>0; i--){
            for(int j = i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

