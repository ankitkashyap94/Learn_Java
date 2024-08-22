package com.LearnJava;

class MyMainEmployee {

    private int id;
    private String name;

    //This is constructor or MyMainEmployee Class
    public MyMainEmployee(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public MyMainEmployee(String name, int id, String newName) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}

public class LearnConstructors {
    public static void main(String[] args) {
        MyMainEmployee myMain = new MyMainEmployee("Ankit", 33, "This is new Constructors");
        MyMainEmployee myMain1 = new MyMainEmployee("Ankit", 33);
//        myMain.setId(25);
//        myMain.setName("Ankit");
        System.out.println(myMain.getId());
        System.out.println(myMain.getName());
    }
}
