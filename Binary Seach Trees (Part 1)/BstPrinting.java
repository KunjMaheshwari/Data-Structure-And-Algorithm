public class BstPrinting{
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(int val, Node root){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(val, root.left);
        }else{
            root.right = insert(val, root.right);
        }
        return root;
    }

    //inorder traversal
    public static void inorderTraversal(Node root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }
    public static void main(String args[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(values[i], root);
        }

        inorderTraversal(root);
        System.out.println(root);
    }
}