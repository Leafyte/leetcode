public class Question63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[] dp = new int[n];

        dp[0] = obstacleGrid[0][0] == 1 ? 0 : 1;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                // Obstacle
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                }

                // Normal cell
                else if (j > 0) {
                    dp[j] += dp[j - 1];
                }
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        Question63 obj = new Question63();

        int[][] obstacleGrid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        int result = obj.uniquePathsWithObstacles(obstacleGrid);

        System.out.println("Unique Paths with Obstacles: " + result);
    }
}
