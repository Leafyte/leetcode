public class Question733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    private void dfs(int[][] image, int r, int c,
                     int originalColor, int color) {

        int m = image.length;
        int n = image[0].length;

        // Check boundaries and original color
        if (r < 0 || c < 0 || r >= m || c >= n ||
            image[r][c] != originalColor) {
            return;
        }

        // Change current pixel color
        image[r][c] = color;

        // Explore four directions
        dfs(image, r - 1, c, originalColor, color);
        dfs(image, r + 1, c, originalColor, color);
        dfs(image, r, c - 1, originalColor, color);
        dfs(image, r, c + 1, originalColor, color);
    }

    public static void main(String[] args) {
        Question733 solution = new Question733();

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1;
        int sc = 1;
        int color = 2;

        int[][] result = solution.floodFill(image, sr, sc, color);

        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
