public class LongestWord {
    static class Node {
        Node children[] = new Node[26];
        boolean endofwords = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String words) {
        Node curr = root;

        for (int i = 0; i < words.length(); i++) {
            int index = words.charAt(i) - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }

        curr.endofwords = true;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        // base case
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].endofwords == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);

                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }

                longestWord(root.children[i], temp);
                // backtracking
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

        // Creating a trie and inserting all the word inside the Trie.
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
