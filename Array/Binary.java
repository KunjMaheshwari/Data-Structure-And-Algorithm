// Binary Search is always applicable on sorted arrays.
public class Binary {

    public static int search(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // right case
                start = mid + 1;
            } else {
                end = mid - 1; // left case
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        System.out.println("index of the key is: " + search(numbers, key));
    }
}
// Time complexity in the binary searh is O(log n)
