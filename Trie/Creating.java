public class Creating{
    static class Node{
        Node children[] = new Node[26];
        boolean endOfWord = false;


        Node(){ // constructor
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node(); // always empty


    public static void main(String args[]){
        String words[] = {"the", "a", "there", "their", "any", "thee"};
    }
}