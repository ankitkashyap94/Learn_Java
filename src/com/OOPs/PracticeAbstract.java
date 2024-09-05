package com.OOPs;

abstract class Phones{

    abstract public void switchOn();
    abstract public void switchOff();
    abstract public void call();
    abstract public void ringtone();

}

class Samsung extends Phones{

    @Override
    public void switchOn(){
        System.out.println("Show Logo");
    }

    @Override
    public void switchOff(){
        System.out.println("Show Logo with exit tone");
    }

    @Override
    public void call(){
        System.out.println("Calling...");
    }

    @Override
    public void ringtone(){
        System.out.println("Ringing phone...");
    }

}

public class PracticeAbstract {

    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.ringtone();


    }
}
