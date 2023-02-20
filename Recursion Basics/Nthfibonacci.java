public class Nthfibonacci {
    public static int fibonacci(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return n;
        }
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    public static void main(String args[]) {
        System.out.println(fibonacci(25));
    }
}

// Note - Fibonacci means sum of previous 2 terms where base case will be
// fibonaaci of 0 = 0 and fibonaaci of 1 = 1