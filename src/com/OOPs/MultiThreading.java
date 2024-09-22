package com.OOPs;

public class MultiThreading {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

    }
}

class MyThread1 extends Thread {

    @Override
    public void run(){
        int i=0;
        while(i<2000){

            System.out.println("Thread 1 is running !!");
            System.out.println("I'm good");
            i++;
        }
    }
}

class MyThread2 extends Thread {

    @Override
    public void run(){
        int i=0;
        while(i<1500){
            System.out.println("Thread 2 is running !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("I'm Sad !!");
            i++;
        }

    }
}
