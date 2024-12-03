import java.util.*;

public class LongestIncreasingSubsequence {
    public static int LCS(int arr[], int arr2[], int n, int m, int t[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (t[n][m] != -1) {
            return t[n][m];
        }

        if (arr[n - 1] == arr2[m - 1]) {
            t[n][m] = 1 + LCS(arr, arr2, n - 1, m - 1, t);
        } else {
            t[n][m] = Math.max(LCS(arr, arr2, n - 1, m, t), LCS(arr, arr2, n, m - 1, t));
        }
        return t[n][m];
    }

    public static void main(String[] args) {
        int arr[] = { 50, 3, 10, 7, 40, 80 };
        int n = arr.length;

        HashSet<Integer> set = new HashSet<>(); // used to store unique elements.
        for (int i = 0; i <= n; i++) {
            set.add(arr[i]);
        }

        int arr2[] = new int[set.size()];

        int i = 0;
        for (int num : set) {
            arr2[i] = num;
            i++;
        }

        int m = arr2.length;

        int t[][] = new int[n + 1][m + 1];

        for (int k = 0; k <= n; k++) {
            for (int j = 0; j <= m; j++) {
                t[k][j] = -1;
            }
        }

        System.out.println(LCS(arr, arr2, n, m, t));
    }
}
