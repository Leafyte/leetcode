import java.util.*;

public class Question3364 {

    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums.get(j);

                int length = j - i + 1;

                if (length >= l && length <= r && sum > 0) {
                    minSum = Math.min(minSum, sum);
                }

                if (length >= r) {
                    break;
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }

    public static void main(String[] args) {
        Question3364 solution = new Question3364();

        List<Integer> nums = Arrays.asList(3, -2, 1, 4);
        int l = 2;
        int r = 3;

        System.out.println(
            "Minimum Positive Sum = "
            + solution.minimumSumSubarray(nums, l, r)
        );
    }
}
