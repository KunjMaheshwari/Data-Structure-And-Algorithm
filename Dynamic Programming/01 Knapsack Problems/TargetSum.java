public class TargetSum {
    public static int printTargetSum(int arr[], int target){
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        if(((sum - target) % 2 == 1) || target > sum){ // important step
            return 0;
        }

        int n = arr.length;
        int s2= (sum - target)/2; // important step

        // same code of subset sum.
        int[][] t = new int[n+1][s2+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=s2;j++){
                if(i == 0){
                    t[i][j] = 0;
                }
                if(j == 0){
                    t[i][j] = 1;
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=s2;j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j] + t[i-1][j-arr[i-1]]; // use + instead of ||
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][s2];
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1};
        int target = 3;

        System.out.println(printTargetSum(arr, target));
    }
}
