package InterviewPrograms;

import javax.swing.text.NumberFormatter;
import java.sql.SQLOutput;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Locale;

public class TestPractice {
    public static void main(String args[]) {
      /* int[] numbers = new int[5];
       numbers[0] = 1;
       numbers[1] = 2;
       numbers[2] = 3;*/

        /*
        //Single Dimensional Array
        int[] numbers = {5,5,6,4,8,9,5,1,4,2};

        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));*/

       /* int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[1][1] = 2;

        int[][] numerics = {{1,4,2},{5,4,8}};
        //Arrays.sort(numerics);
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(Arrays.deepToString(numerics));

        int arthi = 10+3;
        System.out.println(arthi);*/

        /*String x = "1.1";
        double y = Double.parseDouble(x) + 2;*/

        int result = (int)Math.round(Math.random() * 100);

        NumberFormat perct = NumberFormat.getPercentInstance();
        String curr = perct.format(0.1);
        System.out.println(curr);
        //System.out.println(NumberFormat.getCurrencyInstance().format(result));


    }
}
