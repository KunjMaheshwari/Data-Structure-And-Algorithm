public class Constructing{  
    static int tree[];

    public static void initialize(int n){
        tree = new int[4*n];
    }

    public static int segmentTreeBuilt(int arr[], int i, int start, int end){
        if(start == end){
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start+end)/2;
        segmentTreeBuilt(arr, 2*i+1, start, mid);
        segmentTreeBuilt(arr, 2*i+2, mid+1, end);

        tree[i] = tree[2*i+1] + tree[2*i+2];

        return tree[i];
    } // Time complexity will be O(N) but on quering and updating it will take O(LogN) Time.


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;

        initialize(n);

        segmentTreeBuilt(arr, 0, 0, n-1);

        for(int i=0;i<=n;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();

    }
}