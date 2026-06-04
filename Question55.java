public class Question55 {

    public boolean canJump(int[] nums) {

        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > farthest) {
                return false;
            }

            farthest = Math.max(
                farthest,
                i + nums[i]
            );

            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Question55 obj = new Question55();
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = obj.canJump(nums);
        System.out.println("Can Reach Last Index: " + result);
    }
}
