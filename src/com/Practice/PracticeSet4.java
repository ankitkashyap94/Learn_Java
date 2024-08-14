package com.Practice;


class Employee{

    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void SetName(String n){
        name = n;

    }

}

class CellPhone{

    public void ringing(){
        System.out.println("Phone is ringing");
    }

    public void Vibrating(){
        System.out.println("Phone is vibrating");
    }

    public void callFriend(){
        System.out.println("Calling Himanshu");
    }
}

class Square {
    int side;

     public int areaSqur(){
         return (side * side);
     }

     public int perimeter(){
         return (4*side);
     }
}

class Rectangle {
    int side;

     public int areaSqur(){
         return (side * side);
     }

     public int perimeter(){
         return (4*side);
     }
}


public class PracticeSet4 {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.SetName("Ankit");
        emp1.salary = 12_500;
        System.out.println(emp1.getSalary());
        System.out.println(emp1.getName());

        CellPhone cp = new CellPhone();

        cp.callFriend();
        cp.ringing();
        cp.Vibrating();

        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.areaSqur());
        System.out.println(sq.perimeter());
    }

}
