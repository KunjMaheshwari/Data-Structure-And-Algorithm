public class Lastoccurence {

    public static int last(int arr[], int key, int i) {
        // base case
        if (i == arr.length) {
            return -1;
        }

        int isFound = last(arr, key, i + 1);
        if (isFound != -1 && arr[i] == key) {
            return i;
        }

        // check with self
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String args[]) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(last(arr, 5, 0));
    }
}