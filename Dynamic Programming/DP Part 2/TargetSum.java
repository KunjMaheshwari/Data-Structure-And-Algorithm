public class TargetSum {
    public static int printtargetSum(int arr[], int target) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (((sum - target) % 2 == 1) || target > sum) {
            return 0;
        }

        int n = arr.length;
        int s2 = (sum - target) / 2;

        int t[][] = new int[n + 1][s2 + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= s2; j++) {
                if (i == 0) {
                    t[i][j] = (j == 0) ? 1 : 0;
                }
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= s2; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] + t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][s2];
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 1, 3 };
        int target = 10;

        System.out.println(printtargetSum(arr, target));
    }
}
