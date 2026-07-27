public class Question1464 {

    public int maxProduct(int[] nums) {

        int max1 = 0;
        int max2 = 0;

        for (int num : nums) {

            if (num >= max1) {

                max2 = max1;
                max1 = num;

            } else if (num > max2) {

                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }

    public static void main(String[] args) {

        Question1464 obj = new Question1464();

        int[] nums = {3, 4, 5, 2};

        int result = obj.maxProduct(nums);

        System.out.println("Maximum Product = " + result);
    }
}
