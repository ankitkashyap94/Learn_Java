package com.Practice;


class Cylinder{

    private int redius;
    private int height;

    public Cylinder(int red, int hei){
        this.redius = red;
        this.height = hei;
    }

    public int getRedius() {
        return redius;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        double result = Math.floor((2*Math.PI*redius*height) + (2*Math.PI*redius*redius));
        return result;
    }
}

class NewRectangle {
    private int height;
    private int breath;

    public NewRectangle() {
        this.height = 4;
        this.breath = 12;
    }
    public NewRectangle(int height, int breath) {
        this.height = height;
        this.breath = breath;
    }

    public int getHeight() {
        return height;
    }

    public int getBreath() {
        return breath;
    }
}


public class PracticeSet6 {
    public static void main(String[] args) {

        Cylinder mycyl = new Cylinder(9, 12);

        System.out.println(mycyl.getHeight());
        System.out.println(mycyl.getRedius());
        System.out.println(mycyl.surfaceArea());

        NewRectangle r = new NewRectangle(52, 65);
        System.out.println(r.getBreath());
        System.out.println(r.getHeight());




    }
}
