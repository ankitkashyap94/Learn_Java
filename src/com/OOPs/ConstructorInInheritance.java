package com.OOPs;

class Base1{
        private Base1(){
            System.out.println("Base1 constructor");
        }

    Base1(int x){
        System.out.println("Base1 overloaded constructor of X : " + x);
    }
}
 class derived1 extends Base1{
     derived1(){
         super(0);
         System.out.println("Derived constructor");
     }

     derived1(int x, int y){
         super(x);
         System.out.println("Derived overloaded constructor of Y : " + y);
     }
 }

public class ConstructorInInheritance {
    public static void main(String[] args) {
        derived1 d = new derived1();

    }
}
