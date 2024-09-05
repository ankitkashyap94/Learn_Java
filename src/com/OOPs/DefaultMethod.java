package com.OOPs;




interface MyCamera {
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

interface MyWifi {
    String[] getNetwork();
    void connectToWifi();
}

class myCellphone{
    String number = callNumber("+91-9793705029");

    String callNumber(String phoneNumber){
        System.out.println("Calling..." + phoneNumber);
        return phoneNumber;
    }

    void pickCall(){
        System.out.println("Connecting... " + number);

    }
}

class MysmartPhone extends myCellphone implements MyWifi, MyCamera {


//    @Override
//    public void record4kVideo(){
//        System.out.println("new Video Record");
//    }

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


public class DefaultMethod {
    public static void main(String[] args) {

        MysmartPhone ms = new MysmartPhone();
        String[] networks = ms.getNetwork();

        System.out.println("Getting network list:");

        for(String network : networks)
            System.out.println(network);

        System.out.println();
        ms.connectToWifi();
        ms.record4kVideo();



    }

}
