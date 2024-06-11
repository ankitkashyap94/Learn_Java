package InterviewPrograms;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String Value");
        String str = scan.nextLine().toLowerCase();
        System.out.println(checkPalindrome(str));

    }

    public static boolean checkPalindrome(String str) {

        boolean ans = false;
        String text = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            text = text + str.charAt(i);
        }
        System.out.println(text);

        if (text.equals(str)) {
           return ans = true;
        }

        return ans;
    }
}
