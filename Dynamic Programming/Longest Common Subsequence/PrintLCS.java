public class PrintLCS {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "abzxmef";

        int n = str1.length();
        int m = str2.length();

        int t[][] = new int[n + 1][m + 1];
        LCS(str1, str2, n, m, t);

        int i = n;
        int j = m;

        StringBuilder sb = new StringBuilder();

        while(i > 0 && j > 0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            }else{
                if(t[i-1][j] > t[i][j-1]){
                    i--;
                }else{
                    j--;
                }
            }
        }
        System.out.println(sb.reverse().toString());
    }

    public static void LCS(String str1, String str2, int n, int m, int[][] t) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    t[i][j] = t[i - 1][j - 1] + 1;
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
    }
}
