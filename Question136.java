public class Question136 {

    public int singleNumber(int[] nums) {

        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {

        Question136 obj = new Question136();

        int[] nums = {4, 1, 2, 1, 2};

        int result = obj.singleNumber(nums);

        System.out.println("Single Number = " + result);
    }
}
