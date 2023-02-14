import java.util.*;

public class Update {
    public static void main(String args[]) {
        int n = 5;
        int pos = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to update: ");
        int input = sc.nextInt();
        int bitmask = 1 << pos;

        if (input == 0) {
            System.out.println(~bitmask & n); // CLEAR
        } else {
            System.out.println(bitmask | n); // SET
        }
    }
}