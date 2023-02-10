public class Lowercasevowels {
    public static int detect(String str) {
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' }; // declare an array
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (ch == vowels[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "KunjMaheshwari";
        System.out.println(detect(str));
    }
}