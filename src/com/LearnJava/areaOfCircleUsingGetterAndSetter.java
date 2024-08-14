package com.LearnJava;

class Circle{
    private float a;
    private final float pie = 3.14f;
    private float r;

    public void setArea(float r){
        a = pie*(r*r);
    }

    public float getArea(){
        return a;
    }

}

public class areaOfCircleUsingGetterAndSetter {
    public static void main(String[] args) {

        Circle cir = new Circle();
        cir.setArea(5);
        System.out.println(cir.getArea());

    }
}
