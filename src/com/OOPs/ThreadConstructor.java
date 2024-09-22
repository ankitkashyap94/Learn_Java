package com.OOPs;

class MyNewThread extends Thread {
    public MyNewThread(String name) {
        super(name);
        System.out.println("I am not a Threat");
    }

    public void run(){
        int i = 34;
        System.out.println("Thanks You");
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {

        MyNewThread my1 = new MyNewThread("Ankit");
        MyNewThread my2 = new MyNewThread("Maven");
        my1.run();
        my2.run();
        System.out.println("This ID of thread is " + my1.getId() +" and name of ID : "+ my1.getName());
        System.out.println("This ID of thread is " + my2.getId() +" and name of ID : "+ my2.getName());



    }
}
