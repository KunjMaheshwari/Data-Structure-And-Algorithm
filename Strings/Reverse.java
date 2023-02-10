public class Reverse {
    public static String reversing(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() / 2; i++) {
            int frontindex = i;
            int backindex = sb.length() - 1 - i;

            char frontchar = sb.charAt(frontindex);
            char backchar = sb.charAt(backindex);

            sb.setCharAt(frontindex, backchar);
            sb.setCharAt(backindex, frontchar);

        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "Kunj";
        System.out.println(reversing(str));
    }
}