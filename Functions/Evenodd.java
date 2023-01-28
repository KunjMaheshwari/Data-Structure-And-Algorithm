public class Evenodd {
    public static boolean isEven(int n) {
        if (n % 2 != 0) {
            return false;
        }
        return true;
    }

    public static void checkingevenodd(int n) {
        for (int i = 0; i <= n; i++) {
            if (isEven(i)) {
                System.out.println(i);
            }
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        checkingevenodd(10);
    }
}