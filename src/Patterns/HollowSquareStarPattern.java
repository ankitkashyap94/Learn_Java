package Patterns;

public class HollowSquareStarPattern {
    public static void main(String[] args) {

        int count = 6;


        for (int i = 0; i <= count; i++) { //For Rows

           System.out.println();

            for (int j = 0; j < count; j++) { //For Columns
                String output = ((i > 0 && i < count) && (j > 0 && j < count)) ? "  " : "* ";
                System.out.print(output);
            }
            System.out.print("* ");

        }
    }


}
