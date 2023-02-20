public class Factorial {
    public static int solution(int n) {
        if (n == 0) { // Base case
            return 1; // coz factorial of 0 is 1
        }
        return (n * (solution(n - 1)));
    }

    public static void main(String args[]) {
        System.out.println(solution(5));
    }
}