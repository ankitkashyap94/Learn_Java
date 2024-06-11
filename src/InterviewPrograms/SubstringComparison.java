package InterviewPrograms;

import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = "testsamplestring";
        int len = s.length();
        String largest = s.substring(0,3);
        String lowest = s.substring(len-3,len);

        int comparison = largest.compareTo(lowest);







    }



}
