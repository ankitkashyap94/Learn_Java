package InterviewPrograms;

import java.awt.*;
import java.io.InputStreamReader;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Premitive Datatypes
        byte age = 30;
        long viewsCount = 3_123_456_879L;
        float price = 10.99F;
        char letter  = 'A';
        boolean isEligible = false;

        //Reference Datatypes
        Date now = new Date();
        System.out.println(now);

        //String dataType
        String message = " Hello World" + "!! ";

        System.out.println(message.replace("d", "GG"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        System.out.println(message);

    }
}