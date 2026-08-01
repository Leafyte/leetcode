public class Question486 {

    public boolean predictTheWinner(int[] nums) {

        int n = nums.length;
        Integer[][] dp = new Integer[n][n];

        return solve(nums, 0, n - 1, dp) >= 0;
    }

    private int solve(int[] nums, int left, int right, Integer[][] dp) {

        if (left == right) {
            return nums[left];
        }

        if (dp[left][right] != null) {
            return dp[left][right];
        }

        int pickLeft = nums[left] - solve(nums, left + 1, right, dp);

        int pickRight = nums[right] - solve(nums, left, right - 1, dp);

        dp[left][right] = Math.max(pickLeft, pickRight);

        return dp[left][right];
    }

    public static void main(String[] args) {

        Question486 obj = new Question486();

        int[] nums = {1, 5, 2};

        boolean result = obj.predictTheWinner(nums);

        System.out.println("Player 1 Can Win: " + result);
    }
}
