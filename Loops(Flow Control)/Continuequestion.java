
// Question - Display all the number entered by the user except the multiple of 10
// Solution - 
import java.util.*;

public class Continuequestion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the number you want to print: ");
            int number = sc.nextInt();
            if (number % 10 == 0) {
                continue;
            }
            System.out.println(number);
        } while (true);
    }
}
