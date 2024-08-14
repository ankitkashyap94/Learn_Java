package com.Practice;

class Employee1{
    private String name;
    private int id;

    void setName(String i){
        name = i;
    }

    String getName(){
        return name;
    }

    void setId(int Id){
        id = Id;
    }

    int getId(){
        return id;
    }

}

public class PracticeSet5 {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1();
        emp1.setName("Ankit");
        System.out.println(emp1.getName());
        emp1.setId(1250);
        System.out.println(emp1.getId());



    }
}
