public class Question3300 {

    public int minElement(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int num : nums) {

            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            min = Math.min(min, sum);
        }

        return min;
    }

    public static void main(String[] args) {
        Question3300 obj = new Question3300();
        int[] nums = {10, 12, 13, 14};
        int result = obj.minElement(nums);
        System.out.println("Minimum Element: " + result);
    }
}
