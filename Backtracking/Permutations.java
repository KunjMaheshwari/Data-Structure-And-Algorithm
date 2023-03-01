public class Permutations {
    public static void findstring(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // work
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            findstring(Newstr, ans + curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        findstring(str, "");
    }
}
// time complexity of this code will be O(n*n!)