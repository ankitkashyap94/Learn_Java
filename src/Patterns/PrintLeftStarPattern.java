package Patterns;

public class PrintLeftStarPattern {

    public static void main(String[] args) {

        int count = 6;

        
        //Logic added New Comment
        for(int i=0; i<count; i++){

            for(int j=i; j<count; j++){
                System.out.print(i);
            }
            System.out.println();


        }



    }

}
