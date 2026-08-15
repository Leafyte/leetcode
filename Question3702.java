public class Question3702 {

    public int longestSubsequence(int[] nums) {

        int xor = 0;
        boolean hasNonZero = false;

        for (int num : nums) {

            xor ^= num;

            if (num != 0) {
                hasNonZero = true;
            }
        }

        // Entire array has non-zero XOR
        if (xor != 0) {
            return nums.length;
        }

        // XOR is zero, but we can remove one non-zero element
        if (hasNonZero) {
            return nums.length - 1;
        }

        // Every element is zero
        return 0;
    }

    public static void main(String[] args) {

        Question3702 obj = new Question3702();

        int[] nums = {1, 2, 3};

        int result = obj.longestSubsequence(nums);

        System.out.println("Longest Subsequence Length = " + result);
    }
}
