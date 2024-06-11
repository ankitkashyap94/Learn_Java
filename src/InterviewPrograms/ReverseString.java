package InterviewPrograms;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseString("My name is Ankit"));

    }
    public static String reverseString(String giverString){

        String newString = " ";
        System.out.println(giverString.length());

        for(int i = giverString.length()-1; i>=0; i--)
            newString = newString + giverString.charAt(i);
        return newString;

    }
}
