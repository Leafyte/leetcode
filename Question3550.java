public class Question3550 {

    public int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == i) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Question3550 obj = new Question3550();

        int[] nums = {1, 2, 3, 4, 5, 6};

        int result = obj.smallestIndex(nums);

        System.out.println("Smallest Index = " + result);
    }
}
