package InterviewPrograms;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalWithBalance {

    final static int percent = 100;
    final static int monthsInYear = 12;


    public static void main(String[] args) {

        int principle;
        float annualInterest;
        byte years = 0;
        short numberOfPaymentsMade = 0;


        principle = (int) readNumber("Principle", "Enter Principle", 1500, 1_000_000);
        annualInterest = (float) readNumber("annualInterest", "Enter Annual Interest Rate", 1, 30);
        years = (byte) readNumber("years", "Enter years", 1, 30);


        printPaymentSchedule(years, principle, annualInterest);

    }

    public static void printPaymentSchedule(byte years, int principle, float annualInterest) {
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + calculateMortgage(principle, annualInterest, years));
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("----------------");
        for(short month = 1; month <= years * monthsInYear; month++){

            double balance =  getBalance(principle, annualInterest, years, month);
           String decBalance =  NumberFormat.getCurrencyInstance(Locale.US).format(balance);
            System.out.println(decBalance);
        }
    }


    //Logic
    public static String calculateMortgage(int principle, float annualInterest, byte years) {
        double monthlyInterestR = annualInterest / percent / monthsInYear;
        float numberOfPayments = (short) years * monthsInYear;
        double mortgage = principle * (monthlyInterestR * Math.pow((1 + monthlyInterestR), numberOfPayments)) / Math.pow((1 + monthlyInterestR), numberOfPayments) - 1;
        String formattedNumber = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        return formattedNumber;

    }

    //taking balance
    public static double getBalance(int principle, float annualInterest, byte years, short numberOfPaymentsMade){
        double monthlyInterestR = annualInterest / percent / monthsInYear;
        float numberOfPayments = (short) years * monthsInYear;

        double balance = principle * (Math.pow((1+monthlyInterestR), numberOfPayments) - Math.pow((1+monthlyInterestR),numberOfPaymentsMade))
                / (Math.pow((1+monthlyInterestR),numberOfPayments) - 1);

        return balance;

    }


    //Taking input
    public static double readNumber(String prompt, String text, double min, double max) {

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
