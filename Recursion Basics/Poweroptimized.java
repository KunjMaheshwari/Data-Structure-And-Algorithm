public class Poweroptimized {
    public static int optimizedPower(int a, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }
        int variable = optimizedPower(a, n / 2);
        int halfpower = variable * variable;
        // when n is odd
        if (n % 2 != 0) {
            return a * halfpower;
        }
        // when n is even
        return halfpower;

    }

    public static void main(String args[]) {
        System.out.println(optimizedPower(2, 10));
    }
}
// Time Complexity of this code will be O(logn)