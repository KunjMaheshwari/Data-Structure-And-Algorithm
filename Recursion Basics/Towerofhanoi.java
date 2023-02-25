public class Towerofhanoi {
    public static void transfer(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer disk " + "from " + source + " to " + destination);
            return;
        }

        transfer(n - 1, source, destination, helper);
        System.out.println("transfer disk " + "from " + source + " to " + destination);
        transfer(n - 1, helper, source, destination);
    }

    public static void main(String args[]) {
        int n = 2;
        transfer(n, "S", "H", "D");
    }
}