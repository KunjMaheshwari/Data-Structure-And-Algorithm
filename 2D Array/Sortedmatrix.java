public class Sortedmatrix {
    public static boolean staircasesearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            // 1st condition
            if (matrix[row][col] == key) {
                System.out.println("Found key at:" + "(" + row + "," + col + ")");
                return true;
                // second condition
            } else if (key < matrix[row][col]) {
                col--;
                // third condition
            } else if (key > matrix[row][col]) {
                row++;
            }

        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;

        staircasesearch(matrix, key);
    }
}
// Time complexity of this staircase search code is O(n+m)

/*
 * Time complexity depends on the size of n and m
 * if n>>m then Tiime complexity will be O(n)
 * and if m>>n then the time complexity will be O(m).
 */
