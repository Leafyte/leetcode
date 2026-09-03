public class Question283 {

    public void moveZeroes(int[] nums) {

        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill remaining positions with zero
        while (index < nums.length) {

            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        Question283 obj = new Question283();

        int[] nums = {0, 1, 0, 3, 12};

        obj.moveZeroes(nums);

        System.out.print("After Moving Zeroes: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
