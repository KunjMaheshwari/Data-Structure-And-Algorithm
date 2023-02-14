public class Get {
    public static void main(String args[]) {
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;

        // for GET we will perform AND Operation with bitmask and the number n
        if ((bitmask & n) == 0) {
            System.out.println("Bit is zero");
        } else {
            System.out.println("Bit is one");
        }
    }
}