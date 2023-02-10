// If two strings contain the same characters but in a different order,they can
// be said to be anagrams.
public class Anagram {
    public static void main(String args[]) {
        String str1 = "race";
        String str2 = "care";

        // First we will convert the strings character into lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check the length of the strings
        if (str1.length() == str2.length()) {
            // convert the strings into char array
            char str1chararray[] = str1.toCharArray();
            char str2chararray[] = str2.toCharArray();
            // sort the char array
            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);
            // Printing the result
            boolean result = Arrays.equals(str1chararray, str2chararray);
            if (result) {
                System.out.println("The strings are anagram");
            } else {
                System.out.println("The strings are not anagram");
            }
        } else {
            System.out.println("The strings are not anagram");
        }
    }
}