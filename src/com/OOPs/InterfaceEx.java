package com.OOPs;

interface Bicycle{ //this is interface class
    int a = 55;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface BlowHorn{
    void blowHornk3g();
    void blowHornFirefox();
}

class AvonCycle implements Bicycle, BlowHorn {

    int speed = 7;

    @Override
    public void applyBreak(int decrement) {
        speed -= decrement;
        System.out.println(speed);

    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println(speed);
    }

    @Override
    public void blowHornk3g() {
        System.out.println("Blowing Horn - pom pom pom");
    }

    @Override
    public void blowHornFirefox() {
        System.out.println("Blow Horn - pee pee pee");
    }
}

public class InterfaceEx {

    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();

        ac.speedUp(3);
        ac.applyBreak(4);

        ac.blowHornFirefox();
        ac.blowHornk3g();

    }

}
