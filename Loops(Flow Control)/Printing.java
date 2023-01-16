import java.util.*;

public class Printing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int input = sc.nextInt();
        int i = 1;
        while (i <= input) {
            System.out.println(i);
            i++;
        }
        System.out.println("Completed");
    }
}
