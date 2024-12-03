public class SubsetSumProblem {
    public static boolean isSubsetSum(int arr[], int target) {

        // initialization
        int n = arr.length;
        boolean[][] t = new boolean[n + 1][target + 1];

        // initialization
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                if (i == 0) {
                    t[i][j] = false;
                }
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }

        // code
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][target];
    }

    public static void main(String args[]) {
        int arr[] = { 3, 34, 4, 12, 5, 2 };
        int target = 9;

        System.out.println(isSubsetSum(arr, target));
    }
}