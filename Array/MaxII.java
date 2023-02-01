public class MaxII {
    public static void secondprint(int numbers[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];
        // Sum calculation
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                // final calcualtion
                currentsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("Max sum is: " + maxsum);
    }

    public static void main(String agrs[]) {
        int numbers[] = { 2, 4, 8, 10 };
        secondprint(numbers);
    }
}