package com.Practice;

import java.sql.SQLOutput;

abstract class human{

    abstract void singer();
    abstract void mechanic();
    abstract void dancer();

}

interface humanPets{

    void dog();
    void cat();

}

class behave extends human implements humanPets{

    @Override
    void singer() {
        System.out.println("Arijit is singing");
    }

    @Override
    void mechanic() {
        System.out.println("Car is reparing");
    }

    @Override
    void dancer() {
        System.out.println("Hrithik is dancing");
    }

    @Override
    public void dog() {
        System.out.println("Barking");
    }

    @Override
    public void cat() {
        System.out.println("Cat is meaking");
    }
}

public class PracticeSet10 {

    public static void main(String[] args) {

       behave h = new behave();
       h.cat();

    }

}
