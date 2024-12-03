public class ShortestCommonSupersequence{
    public static int lcs(String str1, String str2, int n, int m, int[][] t) {
                for (int i = 0; i <= n; i++) {
                    for (int j = 0; j <= m; j++) {
                        if (i == 0 || j == 0) {
                            t[i][j] = 0;
                        } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                            t[i][j] = 1 + t[i - 1][j - 1];
                        } else {
                            t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                        }
                    }
                }
                return t[n][m];
            }
    public static void main(String args[]){
        String str1 = "AGGTAB";
        String str2 = "KUNGTABJ";

        int n = str1.length();
        int m = str2.length();
        int[][] t = new int[n + 1][m + 1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                t[i][j] = -1;
            }
        }

        System.out.println(str1.length() + str2.length() - lcs(str1, str2, n, m, t));
    }
}