import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
