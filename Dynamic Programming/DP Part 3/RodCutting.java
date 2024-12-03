public class RodCutting {
    public static int cuttingRod(int length[], int price[], int n, int W){
        int dp[][] = new int[n+1][W+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=W;j++){
                if(length[i-1] <= j){
                    dp[i][j] = Math.max(dp[i-1][j], price[i-1] + dp[i-1][j-length[i-1]]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    
    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};
        int W = 8;
        int n = price.length;

        System.out.println(cuttingRod(length, price, n, W));
    }
}
