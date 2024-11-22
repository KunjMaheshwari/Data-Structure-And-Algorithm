public class HeapSort {
    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void heapSorting(int arr[]) {
        // Steap 1 -> build maxHeap
        int n = arr.length;

        for (int i = n / 2; i >= 0; i--) { // Time complexity of this will be O(nlogn)
            heapify(arr, i, n);
        }

        // Step 2 -> Push Largest at end
        for (int i = n - 1; i > 0; i--) {
            // swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i); // Time compexity of this will be O(nlogn);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };

        heapSorting(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


// Time complexity of this algorithm is O(nlogn);