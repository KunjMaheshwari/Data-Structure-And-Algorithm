public class Subset {
    // recursive function
    public static void findsubset(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }

        // work
        // yes choice
        findsubset(str, ans + str.charAt(i), i + 1);
        // no choice
        findsubset(str, ans, i + 1);

    }

    public static void main(String args[]) {
        String str = "abc";
        findsubset(str, "", 0);
    }
}
/* If we have a string of length n then the number of subset will be 2^n */
