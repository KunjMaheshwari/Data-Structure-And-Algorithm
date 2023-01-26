import java.util.*;

public class Binomial {

    public static int coefficient(int a, int b) {
        int c = a - b;
        int solution;
        for (int i = 1; i <= a; i++) {
            a = a * i;
            b = b * i;
            c = c * i;
        }
        solution = (a / (b * c));
        return solution;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(coefficient(a, b));
    }
}