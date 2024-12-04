public class Quering {
    static int tree[];

    public static void initialize(int n){
        tree = new int[4*n];
    }

    public static int constructing(int arr[], int i, int si, int sj){
        if(si == sj){
            tree[i] = arr[si];
            return arr[si];
        }

        int mid = (si+sj)/2;

        constructing(arr, 2*i+1, si, mid);
        constructing(arr, 2*i+2, mid+1, sj);

        tree[i] = tree[2*i+1] + tree[2*i+2];
        return tree[i];
    }
    // Querying
    // getSumUtil is the helper function which is performing all the task
    public static int getSumUtil(int i, int si, int sj, int qi, int qj){
        if(qj <= si || qi >= sj){ // This is the non overlapping case and si is the starting index of the array and sj is the ending index of the array and qi is the starting index of the query array and qj is the ending index of the query array
            return 0;
        }else if(si >= qi && sj <= qj){ // complete overlap
            return tree[i];
        }else{
            int mid = (si + sj)/2; // partial overlap
            int left = getSumUtil(2*i+1, si, mid, qi, qj);
            int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);

            return left + right;
        }
        
    }
    public static int getSum(int arr[], int qi, int qj){ // Time complexity of this code is O(logN);
        int n =arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;

        initialize(n);

        constructing(arr, 0, 0, n-1);

        for(int i=0;i<=n;i++){
            System.out.print(tree[i] +" ");
        }
        System.out.println();

        System.out.println(getSum(arr, 2, 5));
    }
}