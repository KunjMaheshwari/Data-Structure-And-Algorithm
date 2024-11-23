public class PrefixProblem {
    static class Node{
        Node children[] = new Node[26];
        boolean endofwords = true;
        int frequency; // to track the frequency of every Node inside the Trie.

        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            frequency = 1;
        }
    }

    public static Node root = new Node();

    // insert function
    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i) - 'a';

            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }else{
                curr.children[index].frequency ++;
            }

            curr = curr.children[index];
        }

        curr.endofwords = true;
    }

    public static void findPrefix(Node root, String ans){

        // base case
        if(root == null){
            return;
        }
        if(root.frequency == 1){
            System.out.println(ans);
            return;
        }

        // main part
        for(int i=0;i<26;i++){ // traversing through every indexes of the current root.
            if(root.children[i] != null){ // valid value
                findPrefix(root.children[i], ans + (char)(i+'a'));
            }
        }
    }

    public static void main(String args[]){
        String arr[] = {"zebra", "dog", "duck", "dove"};

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        root.frequency = -1;

        findPrefix(root, "");
    }
}
// Time complexity of this function will be O(L);