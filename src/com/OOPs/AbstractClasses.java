package com.OOPs;


abstract class Parent2 {

    public Parent2(){
        System.out.println("i'm base2 constructor");
    }

    public void seyHello(){
        System.out.println("Hello User");
    }

    abstract public void greet();
}

class Child2 extends Parent2{

    @Override
    public void greet(){
        System.out.println("Good Morning !!");
    }

}


public class AbstractClasses {

    public static void main(String[] args) {

    }

}
