public class EqualPartitioningSubsetSum {
    public static boolean isSubsetSum(int arr[], int sum){
        // initialization 
        int n = arr.length;
        boolean[][] t = new boolean[n+1][sum+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i == 0){
                    t[i][j] = false;
                }
                if(j == 0){
                    t[i][j] = true;
                }
            }
        }

        // code
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j - arr[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static boolean isEqaulPartition(int arr[]){
        int n = arr.length;
        int sum = 0;

        for(int i=0;i<n;i++){
            sum += arr[i];
        }

        if(isSubsetSum(arr, sum/2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,11,5};
        System.out.println(isEqaulPartition(arr));
    }
}
