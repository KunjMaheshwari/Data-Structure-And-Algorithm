public class Spiralmatrix {
    public static void printSpiral(int matrix[][]) {
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcolumn = 0;
        int endcolumn = matrix[0].length - 1;

        while (startrow <= endrow && startcolumn <= endcolumn) {
            // top boundary
            for (int j = startcolumn; j <= endcolumn; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            // right boundary
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcolumn] + " ");
            }
            // bottom boundary
            for (int j = endcolumn - 1; j >= startcolumn; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            // left boundary
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcolumn == endcolumn) {
                    break;
                }
                System.out.print(matrix[startcolumn][i] + " ");
            }
            startcolumn++;
            endrow--;
            startrow++;
            endcolumn--;
        }
        System.out.println();

    }

    public static void main(String args[]) {
        // Given Matrix
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printSpiral(matrix);
    }
}