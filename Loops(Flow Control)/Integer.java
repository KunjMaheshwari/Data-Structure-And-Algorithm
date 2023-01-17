import java.util.*;

public class Integer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do {
            System.out.println("Enter the number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }
            System.out.println("Do you want to continue? Press 1 to continue or 0 to close. ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers " + oddsum);

    }
}
