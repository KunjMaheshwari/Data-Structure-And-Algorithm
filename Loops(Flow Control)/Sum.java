import java.util.*;

public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Your sum is: " + sum);
    }
}
