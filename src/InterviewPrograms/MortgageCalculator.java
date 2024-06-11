package InterviewPrograms;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static double Mortgage;
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle = sc.nextInt();

        System.out.print("Annual interest Rate: ");
        float annualInterest = (float) sc.nextDouble();


        System.out.println("Period (Years): ");
        byte years = (byte) sc.nextInt();


        calculateMortage(principle, (float) annualInterest, (byte) years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(Mortgage);
        System.out.println("Mortgage :" + mortgageFormatted);
    }

    public static double calculateMortage(int principle, float annualInterest, byte years) {

        final int percent = 100;
        final int monthsInYear = 12;
        float numberOfPayments = years * monthsInYear;
        float monthlyInterest = principle / percent / monthsInYear;
        double Mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
        return Mortgage;
    }

}
