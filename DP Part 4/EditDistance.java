public class EditDistance {
    public static int editDistance(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int t[][] = new int[n+1][m+1];

        // initialize
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i == 0){
                    t[i][j] = j;
                }
                if(j ==0){
                    t[i][j] = i;
                }
            }
        }

        // bottom up
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    t[i][j] = t[i-1][j-1];
                }else{
                    int add = t[i][j-1] + 1;
                    int delete = t[i-1][j] + 1;
                    int replace = t[i-1][j-1] + 1;

                    t[i][j] = Math.min(add, Math.min(delete, replace));
                }
            }
        }
        return t[n][m];
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "exclusion";

        System.out.println(editDistance(word1, word2));
    }
}
// Time complexity of this code will be O(n*m);