import java.util.*;

public class Question3963 {

    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(grid[i], '#');
        }

        // Make the first row free.
        Arrays.fill(grid[0], '.');

        // Make the last column free.
        for (int i = 0; i < m; i++) {
            grid[i][n - 1] = '.';
        }

        String[] result = new String[m];

        for (int i = 0; i < m; i++) {
            result[i] = new String(grid[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Question3963 solution = new Question3963();

        int m = 4;
        int n = 5;

        String[] grid = solution.createGrid(m, n);

        for (String row : grid) {
            System.out.println(row);
        }
    }
}
