package com.OOPs;

class EmpData{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("This is emp id: " +id);
        System.out.println("This is emp name: "+ name);

    }

    public int getSalary(){
        return salary;
    }

}


public class CustomClassCreation {

    public static void main(String[] args) {

        System.out.println("This is custom class created");

        EmpData emp1 = new EmpData();
        EmpData emp2 = new EmpData();
        emp1.id = 12;
        emp1.name = "Ankit";

        emp2.id = 15;
        emp2.name = "John";
        emp2.salary = 35_000;

//        System.out.println(emp.id);
//        System.out.println(emp.name);
        emp1.printDetails();
        //emp2.printDetails();
        System.out.println(emp2.getSalary());




    }


}