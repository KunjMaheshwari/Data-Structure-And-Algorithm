public class Clear {
    public static void main(String args[]) {
        // CLEAR converts 0 into 1 and vice versa
        int n = 10;
        int pos = 1;
        int bitmask = 1 << pos; // << is the the left shift operator
        int negbitmask = ~bitmask;

        /*
         * To perform the CLEAR function, first we will do the negation of bitmask then
         * perform the AND operation with the given number.
         */
        System.out.println(negbitmask & n);
    }
}