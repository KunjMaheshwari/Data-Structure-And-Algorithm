public class MCM {
    public static int solve(int arr[], int i, int j, int t[][]){
        if(i >= j){
            return 0;
        }

        if(t[i][j] != -1){
            return t[i][j];
        }

        int mn = Integer.MAX_VALUE;

        for(int k=i;k<j;k++){
            int tempAns = solve(arr, i, k, t) + solve(arr, k+1, j, t) + arr[i]*arr[k+1]*arr[j];

            if(tempAns < mn){
                mn = tempAns;
            }
        }
        t[i][j] = mn;
        return t[i][j];
    }

    public static void main(String[] args) {
        int arr[] = {10,30,5,60};
        int i = 0;
        int j = arr.length-1;

        int t[][] = new int[arr.length][arr.length];

        for(int n =0;n<arr.length;n++){
            for(int m=0;m<arr.length;m++){
                t[n][m] = -1;
            }
        }

        System.out.println(solve(arr, i, j, t));
    }
}