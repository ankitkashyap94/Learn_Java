package com.OOPs;


class MyMultithread1 implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<2500; i++){
            System.out.println("Thread 1 is running !!!!!!!!!!!!!!!!!!!");
        }
    }
}

class MyMultithread2 implements Runnable {

    @Override
    public void run() {
      for(int i=0; i<2000; i++){
          System.out.println("Thread 2 is running !!");
      }
    }
}



public class MultithreadingUsingRunable {

    public static void main(String[] args) {

        MyMultithread1 t1 = new MyMultithread1();
        MyMultithread2 t2 = new MyMultithread2();

        Thread gun1 = new Thread(t1);
        Thread gun2 = new Thread(t2);

        gun1.start();
        gun2.start();

    }
}
