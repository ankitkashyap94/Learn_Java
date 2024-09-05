package com.Practice;

abstract class telephone{
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

//class media {
//    void music(){
//        System.out.println("Playing music");
//    }
//
//    void games(){
//        System.out.println("Playing games");
//    }
//
//    void cal(){
//        System.out.println("Using Calculator");
//    }
//}

class SmartPhone2 extends telephone{

    @Override
    void ring() {
        System.out.println("Ringing Telephone");
    }

    void ring(String type) {
        System.out.println("Ringing SmartPhone");
    }

    @Override
    void lift() {
        System.out.println("call connected...");
    }

    @Override
    void disconnect() {
        System.out.println("call disconneted");
    }

    void music(){
        System.out.println("Playing music");
    }

    void games(){
        System.out.println("Playing games");
    }

    void cal(){
        System.out.println("Using Calculator");
    }
}

public class PracticeSet12 {
    public static void main(String[] args) {

        telephone tp = new SmartPhone2();
        tp.ring();
        tp.lift();
        tp.disconnect();


        SmartPhone2 sm = new SmartPhone2();
        sm.ring();
        sm.ring("SmartPhone");
    }
}
