package InterviewPrograms;

public class PrintPattern {
    public static void main(String[] args) {

        int count = 5;

        for(int i=0; i<=count;i++){

            for(int j=0; j<=i; j--){

                System.out.print(" * ");


            }
            System.out.println();


        }

    }
}
