package InterviewPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SubStringTest {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String str = s.substring(0, k);
        smallest = str;
        largest = str;

        for (int i = 1; i <s.length() - k; i++) {

            str = str.substring(i, i + k);
            System.out.println(str);
            if (str.compareTo(smallest) < 0) {
                smallest = str;
            }
            if (str.compareTo(largest) > 0) {
                largest = str;
            }

        }


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "welcomejava";
        int k = 3;
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}