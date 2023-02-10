public class Oddeven {
    public static void oddoreven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String args[]) {
        oddoreven(3);
        oddoreven(11);
        oddoreven(20);
    }
}