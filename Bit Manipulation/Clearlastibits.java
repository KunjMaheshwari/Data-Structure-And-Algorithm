public class Clearlastibits {
    public static void main(String args[]) {
        int n = 15;
        int pos = 2;
        int bitmas = (~0) << pos; // ~0 is 1111111111
        System.out.println(n & bitmas);
    }
}
// if we do & 00 with any bit then we get 00 as an output.