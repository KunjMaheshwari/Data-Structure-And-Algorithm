public class CoinChange{
    // Type 1 Solution
    public static int maxCoin(int coins[], int sum){
        int n = coins.length;
        int t[][] = new int[n+1][sum+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                    t[i][j] = 0;
                }
                if(j == 0){
                    t[i][j] = 1;
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(coins[i-1] <= j){
                    t[i][j] = t[i-1][j] + t[i][j-coins[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }

    // Type 2 Solution
    public static int minCoins(int coins[], int sum){
        int n = coins.length;
        int t[][] = new int[n+1][sum+1];

        for(int i=0;i<= n;i++){
            for(int j=0;j<=sum;j++){
                if(i == 0){
                    t[i][j] = Integer.MAX_VALUE -1;
                }
                if(j == 0){
                    t[i][j] = 0;
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(coins[i-1] <= j){
                    t[i][j] = Math.min(t[i-1][j], t[i][j-coins[i-1]] + 1);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String args[]){
        int coins[] = {1,2,3};
        int sum = 5;

        System.out.println(maxCoin(coins, sum));

        System.out.println(minCoins(coins, sum));
    }
}