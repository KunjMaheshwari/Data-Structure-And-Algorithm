public class PalindromePartitioning {
    public static boolean isPalindrome(String str, int i, int j){
        i = 0;
        j = str.length()-1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public static int countPartition(String str, int i, int j, int t[][]){
        // Step 2 - Base Case
        if(i >= j){
            return 0;
        }

        if(isPalindrome(str, i, j)){
            return 0;
        }

        if(t[i][j] != -1){
            return t[i][j];
        }

        int ans = Integer.MAX_VALUE;

        // Step 3 - K Loop Times
        for(int k=i;k<j;k++){
            int temp = 1+ countPartition(str, i, k, t) + countPartition(str, k+1, j, t);
            // Step 4 - Return the Minimum
            ans = Math.min(ans, temp);
            t[i][j] = ans;
        }
        return t[i][j];
    }
    public static void main(String[] args) {
        String str = "aab";
        // Step 1 - Declare i and j
        int n = str.length();
        int i = 0;
        int j = str.length()-1;

        int t[][] = new int[n+1][n+1];

        for(int p=0;p<=n;p++){
            for(int q = 0;q<=n;q++){
                t[p][q] = -1;
            }
        }

        System.out.println(countPartition(str, i, j, t));
    }
}