public class Reverse {
    public static void main(String args[]) {
        int n = 20122002;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10;
        }
    }
}
