package com.OOPs;

interface MyCamera2 {
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Saying good morning !!");
    }

    default void record4kVideo() {
        greet();
        System.out.println("Recording in 4k");
    }
}

interface MyWifi2 {
    String[] getNetwork();
    void connectToWifi();
}

class myCellphone2 {
    String number = callNumber("+91-9793705029");

    String callNumber(String phoneNumber){
        System.out.println("Calling..." + phoneNumber);
        return phoneNumber;
    }

    void pickCall(){
        System.out.println("Connecting... " + number);

    }

    void endCall(){
        System.out.println("Disconnected... " + number);

    }
}

class MysmartPhone2 extends myCellphone2 implements MyWifi2, MyCamera2 {

    public void sampleMeth(){
        System.out.println("Sample Meth");
    }

    @Override
    public void record4kVideo(){
        System.out.println("new Video Record");
    }

    @Override
    public void takeSnap() {
        System.out.println("Taking snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("recording video...");
    }

    @Override
    public String[] getNetwork() {
        String[] networkList = {"myNetwork", "Airtel wifi","Ankit's Iphone Wifi"};
        return networkList;
    }

    @Override
    public void connectToWifi() {
        String[] networks = getNetwork();
        System.out.println("Connecting to network --> " + networks[0]);
    }
}


public class Polymorphism {
    public static void main(String[] args) {

        MyCamera2 cam = new MysmartPhone2();
        cam.record4kVideo();

        MysmartPhone2 sm = new MysmartPhone2();
        sm.pickCall();
        sm.endCall();

    }
}
