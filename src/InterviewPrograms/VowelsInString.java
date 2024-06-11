package InterviewPrograms;

public class VowelsInString {

    public static void main(String[] args) {

        System.out.println(checkVowelsInString("Ankit"));;

    }

    public static boolean checkVowelsInString(String text){


        return text.toLowerCase().matches(".*[aeiou].*");


    }

}
