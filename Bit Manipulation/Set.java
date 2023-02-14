public class Set {
    public static void main(String args[]) {
        int n = 10;
        int pos = 2;
        int bitmask = 1 << pos;

        // SET converts 0 into 1, we will perform an OR operator between bitmas and the
        // number n
        System.out.println(bitmask | n);
    }
}