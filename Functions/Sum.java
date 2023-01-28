import java.util.*;

public class Sum {
    public static void value(int n) {
        int sum = 0;
        while (n > 0) {
            int reminder = n % 10;
            sum = sum + reminder;

            n = n / 10;
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        value(n);
    }
}