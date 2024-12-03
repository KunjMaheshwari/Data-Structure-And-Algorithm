public class LongestCommonSubstring {
    public static int LCS(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int maxLen = 0;

        int t[][] = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                    maxLen = Math.max(maxLen, t[i][j]);
                }else{
                    t[i][j] = 0;
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "jskdefna";

        System.out.println(LCS(str1, str2));
    }
}
