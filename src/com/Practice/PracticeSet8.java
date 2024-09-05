package com.Practice;


class circle{

    public int redius;

    public circle(int r) {
        System.out.println("Im circle parameterized constructor");
        this.redius = r;
    }
    public circle() {
        System.out.println("Im circle  non parameterized constructor");
    }

    public double area(){
        return Math.PI*this.redius*this.redius;
    }

}

class Cylinder1 extends circle{
    public int height;

    public Cylinder1(int r, int h) {
        super(r);
        System.out.println("Im parameterized cylinder constructor");
        this.height = h;
    }

    public double volume(){
        return Math.PI*this.redius * this.redius*this.height;
    }

}

public class PracticeSet8 {
    public static void main(String[] args) {

        //circle objC = new circle(5);
        Cylinder1 obj1 = new Cylinder1(12,4);


    }
}
