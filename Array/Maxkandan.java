// To calculate maximum sum of a subarray we will use kadans algorithm 
// if we get all the input variables negative then we have to write a special case for that particular case.

public class Maxkandan {
    public static void print(int numbers[]) {
        int maximumsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currentsum += numbers[i];
            if (currentsum < 0) {
                currentsum = 0;
            }
            maximumsum = Math.max(currentsum, maximumsum);
        }
        System.out.println("Maximum sum is: " + maximumsum);
    }

    public static void main(String agrs[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        print(numbers);
    }
}