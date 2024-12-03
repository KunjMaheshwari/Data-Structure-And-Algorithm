// Minimum number of deletion to make a string palindrome.

public class Deletion {
    public static int LCS(String str1, String str2, int n, int m, int t[][]){
        if(n ==0 || m == 0){
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
        return t[n][m];
    }
    public static void main(String[] args) {
        String str = "agzxbcba";

        StringBuilder sb = new StringBuilder();
        String newStr = sb.append(str).reverse().toString();

        int n = str.length();
        int m = newStr.length();

        int t[][] = new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                t[i][j] = -1;
            }
        }

        int LPS = LCS(str, newStr, n, m, t);
        System.out.println(n-LPS);

    }
}
