import java.util.*;

public class Product {
    public static int calculatemultiply(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the vakue of the second number: ");
        int b = sc.nextInt();
        int multiply = calculatemultiply(a, b);
        System.out.println("Multiple of the 2 numbers is: " + multiply);
    }
}
