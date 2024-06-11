package InterviewPrograms;

public class PrimeNumber {

    public static void main(String[] args) {

        checkPrimeNumber(132);

    }

    public static void checkPrimeNumber(int num) {

        int temp = num;

        if (num % 2 == 0 && num % temp == 0) {
                System.out.println("its prime");
        } else {
            System.out.println("Not a prime");
        }
    }

}
