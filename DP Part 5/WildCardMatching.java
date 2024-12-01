public class WildCardMatching {
    public static boolean isMatch(String s, String p){
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];

        // Initialization
        dp[0][0] = true;
        // Pattern = " "
        for(int i=1;i<=n;i++){
            dp[i][0] = false;
        }
        // String  = " "
        for(int j=1;j<=m;j++){
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }

        //bottom up approach
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                //case -> ith char  == jth char || jth char == ?
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }else if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s = "baaaabab";
        String p = "*******ba********ab";

        System.out.println(isMatch(s, p));
    }
}
// Time complexity of this code is O(N X M);