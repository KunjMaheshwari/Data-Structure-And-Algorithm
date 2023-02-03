import java.util.*;

public class Question {
    public static void sorting(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        Arrays.sort(numbers);
        sorting(numbers);
    }
}