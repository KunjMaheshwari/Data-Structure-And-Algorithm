public class Stringcompare {
    public static void main(String args[]) {
        String s1 = "Kunj";
        String s2 = "Kunj";
        String s3 = new String("Kunj");

        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // if (s1 == s3) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
/*
 * if we want to check the strings are equal through their values
 * then we will use the .equals()
 */