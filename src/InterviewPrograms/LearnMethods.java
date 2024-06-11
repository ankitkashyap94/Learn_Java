package InterviewPrograms;

public class LearnMethods {

    public static void main(String[] args) {

        String message = greetUser("Mosh", "hamadani");
        System.out.println(message);


    }

    public static String greetUser(String fristName, String lastName){

        return "Hello "+fristName+" "+lastName;

    }
}

