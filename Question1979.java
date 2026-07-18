public class Question1979 {

    public int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return gcd(min, max);
    }

    private int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        Question1979 obj = new Question1979();

        int[] nums = {2, 5, 6, 9, 10};

        int result = obj.findGCD(nums);

        System.out.println("GCD of array = " + result);
    }
}
