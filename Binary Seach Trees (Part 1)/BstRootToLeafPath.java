import java.util.*;

public class BstRootToLeafPath {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static void printPath(ArrayList<Integer> arr){
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+" ");
        }
        System.out.println("Null");
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        arr.add(root.data);
        if(root.left == null && root.right== null){
            printPath(arr);
        }
        printRootToLeaf(root.left, arr);
        printRootToLeaf(root.right, arr);

        arr.remove(arr.size()-1);
    }
    public static void main(String[] args) {
        
    }
}
