import java.util.*;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check as Prime or Non-Prime");

        int number = sc.nextInt();

        if (number == 2) {
            System.out.println("Prime Number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Non Prime number");
            }
        }

    }
}