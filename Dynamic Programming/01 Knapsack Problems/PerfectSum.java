public class PerfectSum {
    public static int findtheCount(int arr[], int sum){
        // initialization 
        int n = arr.length;
        int t[][] = new int[n+1][sum+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i == 0){
                    t[i][j] = 0;
                }
                if(j == 0){
                    t[i][j] = 1;
                }
            }
        }

        // main code
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(arr[i-1] <= sum){
                    t[i][j] = t[i-1][j] + t[i-1][j-arr[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 10, 6, 8};
        int target = 10;

        System.out.println(findtheCount(arr, target));
    }
}
