public class Question62 {

    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int j = 0; j < n; j++) {
            dp[j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {

        Question62 obj = new Question62();
        int m = 3;
        int n = 7;
        int result = obj.uniquePaths(m, n);
        System.out.println("Unique Paths: " + result);
    }
}
