public class Uppercase {
    public static String convertinupper(String input) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(input.charAt(0));
        sb.append(ch);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ' ' && i < input.length() - 1) {
                sb.append(input.charAt(i));
                i++;
                sb.append(Character.toUpperCase(input.charAt(i)));
            } else {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String input = "hi, i am kunj";
        System.out.println(convertinupper(input));
    }
}
// to convert the character in uppercase in java we use
// Character.toUpperCase(ch);