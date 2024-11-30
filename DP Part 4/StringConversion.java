public class StringConversion {
    public static int LCS(String str1, String str2, int n, int m, int t[][]){
        if(n == 0 || m == 0){
            return 0;
        }

        if(t[n][m] != -1){
            return t[n][m];
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            t[n][m] = 1 + LCS(str1, str2, n-1, m-1, t);
        }else{
            t[n][m] = Math.max(LCS(str1, str2, n-1, m, t), LCS(str1, str2, n, m-1, t));

        }
    }
    return t[n][m];

    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";

        int n = str1.length();
        int m = str2.length();

        int t[][] = new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                t[i][j] = -1;
            }
        }

        int insertion = m - LCS(str1, str2, n, m, t);
        int deletion = n - LCS(str1, str2, n, m, t);

        System.out.println("Insertion: "+ insertion);
        System.out.println("Deletion: "+ deletion);
    }
}
