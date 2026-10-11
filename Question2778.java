public class Question2778 {

    public int sumOfSquares(int[] nums) {

        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                sum += nums[i] * nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Question2778 obj = new Question2778();

        int[] nums = {1, 2, 3, 4};

        int result = obj.sumOfSquares(nums);

        System.out.println("Sum of Squares = " + result);
    }
}
