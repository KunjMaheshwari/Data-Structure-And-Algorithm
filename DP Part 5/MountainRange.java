public class MountainRange {
    public static int mountain(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<n+1;i++){
            // na pairs -> mountain ranges
            for(int j=0;j<i;j++){
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside * outside;
            }
        }
        return dp[n];
    }
    // Time complexity of this code will be O(n^2);
    public static void main(String args[]){
        int n = 4; // 14

        System.out.println(mountain(n));
    }
}