public class CatalansNumber {
    public static int calatanMemoization(int n, int dp[]){
        if(n == 0 || n ==1){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int ans = 0;

        for(int i=0;i<=n-1;i++){
            ans += calatanMemoization(i, dp) * calatanMemoization(n-i-1, dp);
        }
        dp[n] = ans;
        return dp[n];
    }
    // Tabulation code
    public static int catalanTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            for(int j=0;j<=i;j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 30;
        int dp[] = new int[n+1];

        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }

        System.out.println(calatanMemoization(n, dp));
    }
}