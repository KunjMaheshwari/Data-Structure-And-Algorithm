public class Arrays {
    // recursive function
    public static void changearray(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // work
        arr[i] = val; // when we go in upward direction
        changearray(arr, i + 1, val + 1);
        // backtracking step
        arr[i] = arr[i] - 2; // when we go in downward direction

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        changearray(arr, 0, 1);
        printArr(arr);
    }
}
/* NOTE - Backtracking will be called after the function. */
