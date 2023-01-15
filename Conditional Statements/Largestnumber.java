import java.util.*;

public class Largestnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("The Largest Number is: " + a);
        } else {
            System.out.println("The Largest Number is: " + b);
        }
    }
}
