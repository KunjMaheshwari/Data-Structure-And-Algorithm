
// Question - Keep entering the numbers till the user enters a multiple of 10
// Solution - 
import java.util.*;

public class Breakquestion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("Oops! You entered a multiple of 10");
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
