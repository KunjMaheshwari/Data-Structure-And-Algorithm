public class Pyramid {
    public static void invertedRotated(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        invertedRotated(4);
    }
}