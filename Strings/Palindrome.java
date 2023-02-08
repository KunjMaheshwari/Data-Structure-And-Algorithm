public class Palindrome {
    public static boolean isPalindrome(String name) {
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {
                return false;
                // this is the condition of not a palindrome function
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String name = "madam";

        System.out.println(isPalindrome(name));
    }
}