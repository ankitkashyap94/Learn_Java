package com.LearnJava;

public class FacorialRecursion {
    public static void main(String[] args) {

        System.out.println("The factorial of 5 is -> " + factorial(5));

    }

    public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            n = n * factorial(n - 1);
        }
        return n;
    }
}
