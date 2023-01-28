import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder; // logic behind the palindrome
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("The given number is a Palindrome Number.");
        } else {
            System.out.println("The given number is not a Palindrome Number");
        }
    }
}
