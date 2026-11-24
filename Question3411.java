public class Question3411 {

    public int maxLength(int[] nums) {
        int maxLen = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            long product = 1;
            long gcd = 0;
            long lcm = 1;

            for (int j = i; j < n; j++) {
                int num = nums[j];

                product *= num;
                gcd = findGCD(gcd, num);
                lcm = (lcm * num) / findGCD(lcm, num);

                if (product == gcd * lcm) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    private long findGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Question3411 solution = new Question3411();

        int[] nums = {2, 1, 1, 5, 6};

        System.out.println("Maximum Length: " + solution.maxLength(nums));
    }
}
