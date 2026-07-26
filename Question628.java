public class Question628 {

    public int maximumProduct(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {

            // Three largest numbers
            if (num >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if (num >= max2) {
                max3 = max2;
                max2 = num;
            }
            else if (num > max3) {
                max3 = num;
            }

            // Two smallest numbers
            if (num <= min1) {
                min2 = min1;
                min1 = num;
            }
            else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3,
                        max1 * min1 * min2);
    }

    public static void main(String[] args) {

        Question628 obj = new Question628();

        int[] nums = {-10, -10, 5, 2};

        int result = obj.maximumProduct(nums);

        System.out.println("Maximum Product = " + result);
    }
}
