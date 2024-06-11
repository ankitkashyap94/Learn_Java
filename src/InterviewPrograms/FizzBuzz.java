package InterviewPrograms;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i=0; i<=a; i++) {

            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.println("FizzBuzz");

                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else {

                System.out.println(i);
            }
        }

    }
}
