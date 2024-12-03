public class CoinChangeII {
    public static int minimumNumberOfCoins(int coins[], int sum){
        int n = coins.length;
        int t[][] = new int[n+1][sum+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i == 0){
                    t[i][j] = Integer.MAX_VALUE -1; // change
                }
                if(j == 0){
                    t[i][j] = 0;
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(coins[i-1] <= j){
                    t[i][j] = Math.min(t[i-1][j], 1+ t[i][j-coins[i-1]]); //change
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int sum = 11;

        System.out.println(minimumNumberOfCoins(coins, sum));
    }
}
