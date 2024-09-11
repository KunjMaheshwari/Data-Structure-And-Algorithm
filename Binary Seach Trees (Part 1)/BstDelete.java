public class BstDelete {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static Node delete(Node root, int val){
        if(root.data < val){
            // right subtree
            root.right = delete(root.right, val);
        }else if (root.data > val){
            root.left = delete(root.left, val);
        }else {
            // case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 - single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // case 3 - both children
            Node Is = findInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }

        root = delete(root, 1);
        System.out.println(root);

    }
}
