public class Solutiona {
    public static void main(String args[]) {
        int matrix[][] = { { 4, 7, 8 },
                { 8, 8, 7 } };
        int numberoftimes = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    numberoftimes++;
                }
            }
        }
        System.out.println("7 is present " + numberoftimes + " times");
    }
}