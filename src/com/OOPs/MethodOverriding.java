package com.OOPs;

class Add{
     public int calculate(int a, int b){
         int c = a + b;
         return c;
     }
}

class Multiply extends Add {

    @Override
    public int calculate(int a, int b){
       int c = a * b;
       return c;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Add a =  new Add();
        System.out.println(a.calculate(5,6));

        Multiply m = new Multiply();
        System.out.println(m.calculate(5, 6 ));

    }
}
