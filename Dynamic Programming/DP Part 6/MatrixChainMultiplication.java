public class MatrixChainMultiplication {
    public static int matrixChainRec(int arr[], int i, int j){
        if( i == j){
            return 0; //single matrix case
        }

        int ans = Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++){
            int cost1 = matrixChainRec(arr, i, k);
            int cost2 = matrixChainRec(arr, k+1, j);
            int cost3 = arr[i-1]*arr[k]*arr[j];

            int finalCost = cost1+cost2+cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }

    // memoization code
    public static int matrixChainMemo(int arr[], int i, int j, int t[][]){
        if(i == j){
            return 0;
        }

        if(t[i][j] != -1){ //change 1
            return t[i][j];
        }

        int ans = Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++){
            int cost1 = matrixChainMemo(arr, i, k, t);
            int cost2 = matrixChainMemo(arr, k+1, j, t);
            int cost3 = arr[i-1]*arr[k]*arr[j];

            int finalCost = cost1+cost2+cost3;

            ans = Math.min(ans, finalCost);

            t[i][j] = ans; //change 2
        }
        return t[i][j];

    } // Time complexity of this code will be less than the recursive one.
    public static void main(String[] args) {
        int arr[] = {10, 30, 5, 60};
        int n = arr.length;
        int i = 1; // remember this
        int j = n-1;

        System.out.println(matrixChainRec(arr, i, j));

        int t[][] = new int[n+1][n+1];
        for(int l=0;l<=n;l++){
            for(int p=0;p<=n;p++){
                t[l][p] = -1;
            }
        }

        System.out.println(matrixChainMemo(arr, i, j, t));
    }
}