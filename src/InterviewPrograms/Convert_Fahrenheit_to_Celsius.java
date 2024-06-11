package InterviewPrograms;

import java.util.Scanner;

public class Convert_Fahrenheit_to_Celsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in fehrenheit");
        int temperature = sc.nextInt();

        temperature = ((temperature - 32)*5)/9;

        System.out.println("Temperature in Celcius :" +  temperature);

    }
}
