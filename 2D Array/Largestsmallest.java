import java.util.*;

public class Largestsmallest {

    public static void Largest_Smallest(int numbers[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                if (numbers[i][j] > largest) {
                    System.out.println(numbers[i][j]);
                }
                if (numbers[i][j] < smallest) {
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }

    public static void main(String args[]) {
        int numbers[][] = new int[3][3];
        int n = numbers.length;
        int m = numbers[0].length;
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < m; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        Largest_Smallest(numbers);
    }
}