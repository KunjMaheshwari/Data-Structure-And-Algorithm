public class CoinChange {
    public static int maxNumberOfWays(int coins[], int sum){
        int n = coins.length;
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

        // coin change 1 problem here wt will become coins and W will become sum
        for(int i=1;i<=n;i++){
            for(int j=1;j<= sum;j++){
                if(coins[i-1] <= j){
                    t[i][j] = t[i-1][j] + t[i][j-coins[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int sum = 5;

        System.out.println(maxNumberOfWays(coins, sum));
    }
}
