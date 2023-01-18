public class Inverted {
    public static void main(String args[]) {
        int number = 4;
        for (int i = 1; i <= number; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}