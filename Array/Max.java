public class Max {
    public static void maxsubarray(int numbers[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentsum = 0;
                for (int k = start; k <= end; k++) {
                    // subarray sum
                    currentsum += numbers[k];
                }
                System.out.println(currentsum);
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("Maximum sum = " + maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        maxsubarray(numbers);
    }
}