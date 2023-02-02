public class Solutionc {
    public static int maximumprofit(int prices[]) {
        int profit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 2, 6, 4 };
        System.out.print(maximumprofit(prices));
    }
}