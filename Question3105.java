public class Question3105 {

    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int maxLen = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1;
            }
            else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1;
            }
            else {
                inc = 1;
                dec = 1;
            }

            maxLen = Math.max(maxLen, Math.max(inc, dec));
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Question3105 solution = new Question3105();

        int[] nums = {1, 4, 3, 3, 2};

        System.out.println(
            "Longest Monotonic Subarray = "
            + solution.longestMonotonicSubarray(nums)
        );
    }
}
