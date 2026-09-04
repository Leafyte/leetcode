public class Question3903 {

    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        // Find suffix minimum
        int[] suffixMin = new int[n];

        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            suffixMin[i] = Math.min(
                nums[i],
                suffixMin[i + 1]
            );
        }

        // Find prefix maximum and check stability
        int prefixMax = nums[0];

        for (int i = 0; i < n; i++) {

            prefixMax = Math.max(prefixMax, nums[i]);

            if (prefixMax - suffixMin[i] <= k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Question3903 obj = new Question3903();

        int[] nums = {1, 5, 3, 4, 2};
        int k = 3;

        int result = obj.firstStableIndex(nums, k);

        System.out.println("First Stable Index = " + result);
    }
}
