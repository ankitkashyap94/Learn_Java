package InterviewPrograms;

import org.w3c.dom.ls.LSOutput;

public class FabonacciSeries {

    public static void main(String[] args) {


        int a = 0;
        int b = 1;
        int count = 10;

        System.out.print(a+" ");
        System.out.print(b+" ");

        for (int i = 0; i <= count - 2; i++) {
            int c = a + b;
            System.out.print(c+" ");
            int temp = a;
            a = b;
            b = c;

        }

    }

}

