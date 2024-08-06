package com.LearnJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DycrptGrade {

    public static void main(String[] args) {

        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        //Dycrpt
        grade = (char) (grade - 8);
        System.out.println(grade);

        //Scanner sc = new Scanner(System.in);
//        int a = 20;
//        int b = sc.nextInt();
//        System.out.println(a>b);

//        int v = 2;
//        int u = 4;
//        int s = 10;
//
//        double motion = ((Math.pow(v,2) - Math.pow(u,2)) / (2*a*s));
//
//        System.out.println(motion);

//        int a = 6;
//        float b = 5.236f;
//
//        System.out.printf("The value of a is %d and value of b is %f",a,b);

        String name = "My <|name|> is Ankit";
        String name2 = "Ankit";
        System.out.println(name.substring(2, name.length()-2));

        System.out.println(name.replace('n','p'));
        System.out.println(name.replace("kit", "x"));
        System.out.println(name.startsWith("My"));
        System.out.println(name.endsWith("t"));
        System.out.println(name.indexOf("n"));
        System.out.println(name.lastIndexOf("n"));
        System.out.println(name.indexOf("is", 4));
        System.out.println(name.equals("Ankit"));
        System.out.println(name.replace(" ", "_"));


        name = name.replace("<|name|>", "Ankit");
        System.out.println(name);



    }

}
