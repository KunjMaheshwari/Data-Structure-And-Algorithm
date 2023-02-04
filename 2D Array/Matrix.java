import java.util.*;

public class Matrix {
    // searching in the matrix
    public static boolean search(int numbers[][], int key) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] == key) {
                    System.out.println("Found at index: " + i + "," + j);
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }

    public static void main(String args[]) {
        // creating a 2D array
        int numbers[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = numbers.length; // 3
        int m = numbers[0].length; // 3

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        search(numbers, 5);

    }
}
