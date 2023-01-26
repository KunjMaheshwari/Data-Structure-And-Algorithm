import math;

public class Prime {
    // public static boolean isPrime(int a) {
    // boolean isPrime = true;
    // // corner cases
    // // 2
    // if (n == 2) {
    // return isPrime;
    // }
    // for (int i = 2; i <= a - 1; i++) {
    // if (a % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // return isPrime;
    // }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(12));
    }
}