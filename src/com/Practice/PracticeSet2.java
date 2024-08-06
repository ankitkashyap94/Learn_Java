package com.Practice;

public class PracticeSet2 {

    public static void main(String[] args) {
        PracticeSet2 ps2 = new PracticeSet2();
        ps2.sum(10,20);
        ps2.sum1(10,20,20);


    }

    private void sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    private void sum1(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
    }

    protected void isDisplay(){
        System.out.println("Display This");
    }
}



