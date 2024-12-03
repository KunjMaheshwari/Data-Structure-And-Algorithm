public class UnboundedKnapSack {
    public static int unBounded(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                dp[i][j] = 0; // change from the 01 knapsack code.
            }
        } // We don't need to do this initialization in java because in java by default Java stored dp in 0.

        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                if(wt[i-1] <= j){ // remember this.
                    dp[i][j] = Math.max(val[i-1]+ dp[i][j-wt[i-1]] ,  dp[i-1][j]); // change from the 01 knapsack.
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;

        System.out.println(unBounded(val, wt, W));
    }
}
