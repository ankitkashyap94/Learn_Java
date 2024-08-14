package com.LearnJava;

class MyMainEmployee {

    private int id;
    private String name;

    //This is constructor or MyMainEmployee Class
    public MyMainEmployee() {
        id = 45;
        name = "My name is not defined";
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
        MyMainEmployee myMain = new MyMainEmployee();
        myMain.setId(25);
        myMain.setName("Ankit");
        System.out.println(myMain.getId());
        System.out.println(myMain.getName());
    }
}
