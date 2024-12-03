public class MinimumSumPartition {

    public static boolean[][] subsetSum(int arr[], int range){
        int n = arr.length;
        boolean[][] t = new boolean[n+1][range+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=range;j++){
                if(i == 0){
                    t[i][j] = false;
                }
                if(j == 0){
                    t[i][j] = true;
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=range;j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j] || t[i-1][j-arr[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t;
    }
    public static int minimumSum(int arr[]){
        int n = arr.length;
        int range = 0;

        for(int i=0;i<n;i++){
            range += arr[i];
        }

        int minDiff = Integer.MAX_VALUE;
        boolean[][] t = subsetSum(arr, range);

        for(int j=0;j<=range/2;j++){
            if(t[n][j]){
                minDiff = Math.min(minDiff, range-2*j);
            }
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int arr[] = {1, 6, 11, 5};

        System.out.println(minimumSum(arr));

    }
}
