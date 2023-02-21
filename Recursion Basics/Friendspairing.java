public class Friendspairing {
    public static int pairing(int n) {
        // Base condition
        if (n == 1 || n == 2) {
            return n;
        }
        // Condition for single
        int single = pairing(n - 1);
        // Condition for pair
        int pair = (n - 1) * pairing(n - 2);

        return single + pair;
    }

    public static void main(String args[]) {
        System.out.println(pairing(3));
    }
}