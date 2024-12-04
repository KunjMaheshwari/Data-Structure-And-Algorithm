public class Update {
    static int tree[];

    public static void initialize(int n) {
        tree = new int[4 * n];
    }

    public static int segmentTreeBuilt(int arr[], int i, int start, int end) {
        if (start == end) {
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end) / 2;
        segmentTreeBuilt(arr, 2 * i + 1, start, mid);
        segmentTreeBuilt(arr, 2 * i + 2, mid + 1, end);

        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];

        return tree[i];
    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
        if (qj <= si || qi >= sj) { // This is the non overlapping case and si is the starting index of the array
                                    // and sj is the ending index of the array and qi is the starting index of the
                                    // query array and qj is the ending index of the query array
            return 0;
        } else if (si >= qi && sj <= qj) { // complete overlap
            return tree[i];
        } else {
            int mid = (si + sj) / 2; // partial overlap
            int left = getSumUtil(2 * i + 1, si, mid, qi, qj);
            int right = getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);

            return left + right;
        }

    }

    public static int getSum(int arr[], int qi, int qj) { // Time complexity of this code is O(logN);
        int n = arr.length;
        return getSumUtil(0, 0, n - 1, qi, qj);
    }

    // Update code
    public static void updateUtil(int i, int si, int sj, int idx, int diff) {
        if (idx > sj || idx < si) {
            return;
        }

        tree[i] += diff;
        if (si != sj) {
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, diff); // left
            updateUtil(2 * i + 2, mid + 1, sj, idx, diff); // right
        }
    }

    public static void update(int arr[], int idx, int newVal) {
        int n = arr.length;
        int diff = newVal - arr[idx];
        arr[idx] = newVal;

        updateUtil(0, 0, n - 1, idx, diff);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;

        initialize(n);

        segmentTreeBuilt(arr, 0, 0, n - 1);

        for (int i = 0; i <= n; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();

        System.out.println(getSum(arr, 2, 5));
        update(arr, 2, 2);
        System.out.println(getSum(arr, 2, 5));
    }
}
// Time complexity of this code will be O(logN);
