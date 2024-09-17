public class BstSearch {
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


    public static boolean isSearch(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }else if(root.data > key){
            return isSearch(root.left, key);
        }else{
            return isSearch(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(values[i], root);
        }

        System.out.println(isSearch(root, 4));


    }
}


// Time complexity of this code will be O(H);
// In the worst case this complexity will be O(N);
// In balanced tree this complexity will be O(log(N));