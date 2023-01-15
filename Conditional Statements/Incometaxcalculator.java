import java.util.*;

public class Incometaxcalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            System.out.println(tax = 0);
        } else if (income >= 500000 && income < 1000000) {
            System.out.println(tax = (int) (income * 0.2));
        } else {
            System.out.println(tax = (int) (income * 0.3));
        }
    }
}
