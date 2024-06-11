package InterviewPrograms;

public class LearnCreateMetthods {
    public static void main(String[] args) {

       String message =  greetUser("Ankit","Kashyap", 30);
        System.out.println(message);
    }

    public static String greetUser(String firstName, String lastName, int age){
      return  "Hello "+ firstName +" "+ lastName+ " His age is " + age;

    }
}
