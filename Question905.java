public class Question905 {

    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            // Find an odd number on the left
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }

            // Find an even number on the right
            while (left < right && nums[right] % 2 != 0) {
                right--;
            }

            // Swap them
            if (left < right) {

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        Question905 obj = new Question905();

        int[] nums = {3, 1, 2, 4};

        int[] result = obj.sortArrayByParity(nums);

        System.out.print("Sorted by Parity: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
