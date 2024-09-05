package com.LearnJava;

import java.util.Arrays;
import java.util.zip.InflaterOutputStream;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(12);
    }

    public static void reverseNumber(int a){
        int rem;
        int rev = 0;

        while(a>0){
            rem = a%10;
            rev = rev*10+rem;
            a= a/10;
        }
        System.out.println(rev);
    }
}
