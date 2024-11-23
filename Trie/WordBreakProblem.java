// Google Interview

public class WordBreakProblem{
    static class Node{
        Node children[] = new Node[26];
        boolean endofwords = false;

        public Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // O(L)
        Node curr = root;

        for (int level = 0; level <= word.length(); level++) {
            int index = word.charAt(level) - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }

        curr.endofwords = true;
    }

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

    public static boolean isWordExist(String key){ // Time complexity will be O(L)
        // base case
        if(key.length() == 0){
            return true;
        }
        
        for(int i=1;i<key.length();i++){
            //substring(beg index, last index)
            if(searchInTrie(key.substring(0, i)) && isWordExist(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};

        String key = "ilikesamsung"; 

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        System.out.println(isWordExist(key));

    }
}