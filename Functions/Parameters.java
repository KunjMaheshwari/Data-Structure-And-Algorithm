import java.util.*;

public class Parameters {

    public static int calculatesum(int a, int b) { // formal paramters or the paramters
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first digit: ");
        int a = sc.nextInt();
        System.out.println("Enter the second digit: ");
        int b = sc.nextInt();
        int sum = calculatesum(a, b); // actual paramters or the Arguments
        System.out.println("Sum of the above 2 numbers is: " + sum);
    }
}