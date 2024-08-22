package com.OOPs;

class ClassOne {

    private int a;

    ClassOne(int v){
        a = v;
    }

    public int getA() {
        return a;
    }

    public int returnOne(){
        return 1;
    }

}

class ClassTwo extends ClassOne{

    ClassTwo(int c){
        super(c);
        System.out.println("Im a constructor");

    }

}


public class ThisAndSuper {

    public static void main(String[] args) {
        ClassTwo to = new ClassTwo(5);
        System.out.println(to.getA());
    }

}
