package InterviewPrograms;

import java.util.Scanner;

public class SumOfFirstNEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumFirstEvenNumbers(n));


    }

    public static int sumFirstEvenNumbers(int n) {

        int count = 0;
        int sum = 0;

        for (int i = 0; i >= -1; i++) {

            if (i % 2 == 0) {

                sum = sum + i;

                count++;

                if (count == n) {

                    break;

                }
            }
        }

        return sum;
    }
}
