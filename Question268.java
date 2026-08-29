public class Question268 {

    public int missingNumber(int[] nums) {

        int result = nums.length;

        for (int i = 0; i < nums.length; i++) {

            result ^= i;
            result ^= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Question268 obj = new Question268();

        int[] nums = {3, 0, 1};

        int result = obj.missingNumber(nums);

        System.out.println("Missing Number = " + result);
    }
}
