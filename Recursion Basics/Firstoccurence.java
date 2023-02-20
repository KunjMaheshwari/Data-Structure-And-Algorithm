public class Firstoccurence {
    public static int occurence(int arr[], int i, int key) {
        // BASE CASE
        if (arr.length == i) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return occurence(arr, i + 1, key);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5, 6, 3, 5, 7 };
        System.out.print(occurence(arr, 0, 5));
    }
}