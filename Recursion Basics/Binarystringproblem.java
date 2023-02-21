public class Binarystringproblem {
    public static void printbinarystring(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Work
        printbinarystring(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printbinarystring(n - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {
        printbinarystring(3, 0, "");
    }
}