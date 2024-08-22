package com.OOPs;


import java.sql.Driver;

class Base{
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    void printMe(){
        System.out.println("Print Me");
    }
}

class derived extends Base{

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Object of base class
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        //object of derived class
        derived d = new derived();
        b.setX(5);
        System.out.println(b.getX());
    }
}
