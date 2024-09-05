package com.Practice;

import java.sql.SQLOutput;

abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen{

    @Override
    void write() {
        System.out.println("write");
    }

    @Override
    void refill() {
        System.out.println("Refill");
    }

    void changeNib(){
        System.out.println("changing the nib");
    }
}

class monkey{
    void jump(){
        System.out.println("Monkey jumping");
    }
    void bite(){
        System.out.println("Monkey biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}

class Human1 extends monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hi, My name is Fred");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class PracticeSet11 {
    public static void main(String[] args) {
        pen fp = new fountainPen();
       fp.write();
       fp.refill();

      //polymorphism
        monkey hu = new Human1();
        hu.bite();
        hu.jump();

        BasicAnimal b = new Human1();
        b.eat();
        b.sleep();


        Human1 hu1 = new Human1();
        hu1.sleep();
        hu1.speak();
    }
}
