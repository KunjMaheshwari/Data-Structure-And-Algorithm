public class ValidateBst {
    public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }   
    public static boolean isValidBst(Node root){
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean validate(Node node, int min, int max){
        if(node == null){
            return true;
        }

        if(node.data <= min || node.data >= max){
            return false;
        }

        boolean leftSubtree = validate(node.left, min, node.data);
        boolean rightSubTree = validate(node.right, node.data, max);


        return leftSubtree && rightSubTree;
    }
}
