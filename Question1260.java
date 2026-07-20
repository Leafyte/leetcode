import java.util.*;

public class Question1260 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;
        int size = m * n;

        k %= size;

        int[][] shifted = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                int index = i * n + j;
                int newIndex = (index + k) % size;

                int newRow = newIndex / n;
                int newCol = newIndex % n;

                shifted[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(shifted[i][j]);
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {

        Question1260 obj = new Question1260();

        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int k = 1;

        List<List<Integer>> result = obj.shiftGrid(grid, k);

        System.out.println("Shifted Grid:");

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
