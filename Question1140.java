import java.util.*;

public class Question1140 {

    public int stoneGameII(int[] piles) {

        int n = piles.length;

        // suffix[i] = sum of piles from i to n-1
        int[] suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        Integer[][] dp = new Integer[n][n + 1];

        return solve(piles, suffix, 0, 1, dp);
    }

    private int solve(int[] piles, int[] suffix,
                      int i, int M, Integer[][] dp) {

        int n = piles.length;

        // Can take all remaining piles
        if (i + 2 * M >= n) {
            return suffix[i];
        }

        if (dp[i][M] != null) {
            return dp[i][M];
        }

        int best = 0;

        for (int X = 1; X <= 2 * M; X++) {

            int nextM = Math.max(M, X);

            int opponent = solve(
                    piles,
                    suffix,
                    i + X,
                    nextM,
                    dp
            );

            int current = suffix[i] - opponent;

            best = Math.max(best, current);
        }

        dp[i][M] = best;

        return best;
    }

    public static void main(String[] args) {

        Question1140 obj = new Question1140();

        int[] piles = {2, 7, 9, 4, 4};

        int result = obj.stoneGameII(piles);

        System.out.println("Maximum Stones Alice Can Get = " + result);
    }
}
