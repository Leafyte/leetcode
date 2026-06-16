import java.util.*;

public class Question73 {

    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Mark rows and columns
        for (int i = 1; i < m; i++) {

            for (int j = 1; j < n; j++) {

                if (matrix[i][j] == 0) {

                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Zero rows
        for (int i = 1; i < m; i++) {

            if (matrix[i][0] == 0) {

                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero columns
        for (int j = 1; j < n; j++) {

            if (matrix[0][j] == 0) {

                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // First row
        if (firstRowZero) {

            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // First column
        if (firstColZero) {

            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        Question73 obj = new Question73();

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        obj.setZeroes(matrix);

        System.out.println("Matrix After Setting Zeroes:");

        printMatrix(matrix);
    }
}
