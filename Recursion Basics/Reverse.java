public class Reverse {
    public static void reversing(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reversing(str, idx - 1);
    }

    public static void main(String args[]) {
        String str = "abcd";
        reversing(str, 3);
    }
}