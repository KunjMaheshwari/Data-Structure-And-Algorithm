public class Tiling {
    public static int tilingProblem(int n) { // 2 x n ( floor size)
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // vertical choice
        int verticalTiles = tilingProblem(n - 1);

        // horizontal choice
        int horizontalTiles = tilingProblem(n - 2);

        int total_ways = verticalTiles + horizontalTiles;
        return total_ways;

    }

    public static void main(String args[]) {
        System.out.println(tilingProblem(5));
    }
}