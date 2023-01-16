public class Break {
    public static void main(String agrs[]) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
    }
}
