public class Decreasing {
    public static void printing(int n) { // First Recursive Function
        if (n < 1) { // Base Case
            return;
        } else {
            System.out.print(n + " ");
            printing(n - 1);
        }

    }

    public static void main(String args[]) {
        printing(10);
    }
}
