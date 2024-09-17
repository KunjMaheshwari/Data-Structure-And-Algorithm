public class BstMirror {
    public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node leftSubtree = mirror(root.left);
        Node rightSubtree = mirror(root.right);

        root.left = rightSubtree;
        root.right = leftSubtree;

        return root;
    }
    public static void main(String[] args) {
        
    }
}
