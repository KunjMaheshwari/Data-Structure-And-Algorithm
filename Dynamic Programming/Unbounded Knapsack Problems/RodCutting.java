public class RodCutting {
    public static int rodCuttingProblem(int price[], int length[], int N) {
        int n = price.length; // Number of lengths (or pieces)
        int dp[][] = new int[n + 1][N + 1];

        // Build the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= N; j++) {
                if (length[i - 1] <= j) {
                    // Either include the current length or skip it
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    // Skip the current length
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][N]; // Maximum profit
    }
    public static void main(String[] args) {
        int price[] = {12,14,11,25};
        int length[] = {2,5,7,3,1};
        int N = 10;

        System.out.println(rodCuttingProblem(price, length, N));
    }
}
