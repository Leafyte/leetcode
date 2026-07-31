public class Question198 {

    public int rob(int[] nums) {

        int prev2 = 0;
        int prev1 = 0;

        for (int num : nums) {

            int current = Math.max(prev1, prev2 + num);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {

        Question198 obj = new Question198();

        int[] nums = {2, 7, 9, 3, 1};

        int result = obj.rob(nums);

        System.out.println("Maximum Money Robbed = " + result);
    }
}
