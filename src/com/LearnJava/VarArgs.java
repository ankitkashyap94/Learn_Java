package com.LearnJava;

public class VarArgs {

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(1));
        System.out.println(sum(1,2));
        System.out.println(sum(1,5,6,4));
        System.out.println(sum(5,7,6,9,5,4));
        System.out.println(sum(5,4,7,8,9,6,3,4));
    }

    static int sum(int x, int ...arr){

        int result = x;

        for(int a : arr){
            result += a;
        }
        return result;
    }
}
