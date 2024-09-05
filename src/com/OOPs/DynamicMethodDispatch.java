package com.OOPs;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

class Phone {
    public void On(){
        System.out.println("Turning on phone...");
    }

    public void showTime(){
        Instant timestamp = Instant.now();
        System.out.println(timestamp);
    }
}

class SmartPhone extends Phone{

    @Override
    public void On(){
        System.out.println("Turning on smartphone...");
    }

    public void music(){
        System.out.println("Playing Music....");
    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

//        Phone ph = new Phone();
//        SmartPhone smph = new SmartPhone();
//        ph.name();

        Phone ph = new SmartPhone();
        ph.On();
        ph.showTime();




    }
}
