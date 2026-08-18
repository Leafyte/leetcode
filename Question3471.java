public class Question3471 {

    public int largestInteger(int[] nums, int k) {

        int[] count = new int[51];

        for (int i = 0; i <= nums.length - k; i++) {

            boolean[] seen = new boolean[51];

            for (int j = i; j < i + k; j++) {

                int num = nums[j];

                if (!seen[num]) {
                    count[num]++;
                    seen[num] = true;
                }
            }
        }

        for (int num = 50; num >= 0; num--) {

            if (count[num] == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Question3471 obj = new Question3471();

        int[] nums = {3, 9, 2, 1, 7};
        int k = 3;

        int result = obj.largestInteger(nums, k);

        System.out.println("Largest Almost Missing Integer = " + result);
    }
}
