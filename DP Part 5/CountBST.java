import java.util.*;

public class CountBST {
    public static int countingBst(int n, int dp[]){
        if(n ==0 || n ==1 ){
            return 1;
        }

        int ans = 0;

        if(dp[n] != -1){
            return dp[n];
        }

        for(int i=0;i<=n-1;i++){
            ans += countingBst(i, dp) * countingBst(n-i-1, dp);
        }
        dp[n] = ans;
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;

        int dp[] = new int[n+1];

        Arrays.fill(dp, -1);

        System.out.println(countingBst(n, dp));
    }
}
