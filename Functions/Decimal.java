public class Decimal {
    public static void Dectobin(int n) {
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int reminder = n % 2;
            bin = bin + (reminder * (int) Math.pow(10, pow));

            pow++;
            n = n / 2;
        }
        System.out.println(bin);
    }

    public static void main(String agrs[]) {
        Dectobin(5);
    }
}