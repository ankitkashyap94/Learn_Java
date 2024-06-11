package InterviewPrograms;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator2 {

    public static void main(String[] args) {

        int principle;
        float annualInterest;
        byte years;


        principle = (int) readNumber("Principle","Enter Principle", 1500, 1_000_000);
        annualInterest = (float) readNumber("annualInterest","Enter Annual Interest Rate", 1, 30);
        years = (byte) readNumber("years","Enter years", 1, 30);

        System.out.println(calculateMortgage(principle, annualInterest, years));
    }


    //Logic
    public static String calculateMortgage(int principle, float annualInterest, byte years) {

        final int percent = 100;
        final int monthsInYear = 12;

        double monthlyInterestR = annualInterest / percent / monthsInYear;
        float numberOfPayments = (short) years * monthsInYear;
        double mortgage = principle * (monthlyInterestR * Math.pow((1 + monthlyInterestR), numberOfPayments)) / Math.pow((1 + monthlyInterestR), numberOfPayments) - 1;
        String formattedNumber = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        return formattedNumber;

    }


    //Taking input
    public static double readNumber(String prompt,String text, double min, double max) {

        Scanner sc = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(text);
            value = sc.nextFloat();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Please enter a value between " + min + " and " + max);
        }
        return value;

    }
}


