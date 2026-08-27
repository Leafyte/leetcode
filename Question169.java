public class Question169 {

    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        Question169 obj = new Question169();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = obj.majorityElement(nums);

        System.out.println("Majority Element = " + result);
    }
}
