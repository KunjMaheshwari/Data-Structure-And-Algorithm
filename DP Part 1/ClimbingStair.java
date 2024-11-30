import java.util.*;

public class ClimbingStair {
    public static int countWays(int n, int ways[]){
        // memoization - O(n) and recursion - O(2^N)
        if(n <0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = countWays(n-1, ways) + countWays(n-2, ways);
        return ways[n];
    }
    // Tabulation Approach
    public static int countWaysTabulation(int n , int ways[]){
        int dp[] = new int[n+1]; // table creation + initialization
        dp[0] = 1;

        for(int i=1;i<=n;i++){ // Tabulation loop
            if(i == 1){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n = 5;
        int ways[] = new int[n+1]; // initialization
        Arrays.fill(ways, -1);

        System.out.println(countWays(n, ways));
    }
}
