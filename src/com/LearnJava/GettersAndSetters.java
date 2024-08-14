package com.LearnJava;

import java.sql.SQLOutput;

class Employee{
    private String name;
    private int id;

    public void setEmpName(String nameN){
        name = nameN;
    }

    public String getEmpName(){
        return name;
    }

    public void setId(int newId){
        id = newId;
    }

    public int getId(){
        return id;
    }

}

public class GettersAndSetters {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpName("Ankit");
        emp.setId(25);
        System.out.println(emp.getEmpName());
        System.out.println(emp.getId());



    }

}
