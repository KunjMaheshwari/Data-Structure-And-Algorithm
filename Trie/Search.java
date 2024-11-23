// VERY IMPORTANT - Microsoft, Amazon, DeShaw Interviews

public class Search {
    static class Node {
        Node children[] = new Node[26];
        boolean endofwords = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static boolean searchInTrie(String key){
        Node curr = root;

        for(int level = 0;level < key.length();level++){
            int idx = key.charAt(level) - 'a';

            if(curr.children[idx] == null){
                return false; // key does not exist in Trie.
            }else{
                curr = curr.children[idx];
            }
        }
        return curr.endofwords = true;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };

        System.out.println(searchInTrie("any"));
        System.out.println(searchInTrie("kunj"));

    }
}

