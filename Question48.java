import java.util.*;

public class Question48 {

    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // transpose matrix
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse each row
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        Question48 obj = new Question48();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        obj.rotate(matrix);

        System.out.println("Rotated Matrix:");

        printMatrix(matrix);
    }
}
