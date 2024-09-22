package com.OOPs;

class c1 {
    public int x = 5;
    protected int y = 45;
    int z = 50;
    private int a = 21;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}

class c2{

}


public class AccessModifiers extends c1{
    public static void main(String[] args) {
        c1 c = new c1();
        //c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a);
    }
}
