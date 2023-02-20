public class Increasing {
    public static void printing(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        printing(10);
    }
}