public class BstPrintInRange {
    public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static void printingNumbers(Node root, int n1, int n2){
        if(root == null){
            return;
        }
        if(root.data >= n1 && root.data <= n2){
            printingNumbers(root.left, n1, n2);
            System.out.println(root.data);
            printingNumbers(root.right, n1, n2);
        }
        else if(root.data < n1){
            printingNumbers(root.left, n1, n2);
        }else{
            printingNumbers(root.right, n1, n2);
        }
    }

    public static void main(String[] args) {
        int values[] =  {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }

        inroder(root);
        System.out.println();

        printingNumbers(root, 5, 12);
    }
}
