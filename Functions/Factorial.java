import java.util.*;

public class Factorial {
    public static int facto(int a) {
        int f = 1;
        for (int i = a; i >= 1; i--) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        int fact = facto(a);
        System.out.println("Factorial of the number is: " + fact);
    }
}