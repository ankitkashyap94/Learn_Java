package InterviewPrograms;

public class NewMain {
    public static void main(String[] args) {
      /* Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        point2.y = 2;

        System.out.println(point1 != point2);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean iseligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(iseligible);

        int temp = 10;
        if (temp >= 32) {
            System.out.println("Day is too hot " + "Drink plenty of water");
        } else if (temp > 20 && temp < 30)
            System.out.println("Beautiful day");
         else
            System.out.println("cold day");

        int income = 100_000;

        //Ternary Statement
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);

        //SwitchCase
        String role = "Admin";

        switch (role){
            case "Admin":
                System.out.println("You are a admin");
                break;

            case "Moderator":
                System.out.println("You are a Moderator");
                break;

            default:
                System.out.println("You are a guest");
                break;
        }*/

        //Print greet
     String value =    greetUser("Mosh", "Ankit");
        System.out.println(value);

    }

    public static String greetUser(String firstName, String lastName){

        return "Hello "+firstName+" "+lastName;


    }
}
