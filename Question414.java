public class Question414 {

    public int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {

            // Ignore duplicates
            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {

                third = second;
                second = first;
                first = num;

            } else if (num > second) {

                third = second;
                second = num;

            } else if (num > third) {

                third = num;
            }
        }

        // If third maximum doesn't exist,
        // return the maximum.
        if (third == Long.MIN_VALUE) {
            return (int) first;
        }

        return (int) third;
    }

    public static void main(String[] args) {

        Question414 obj = new Question414();

        int[] nums = {3, 2, 1};

        int result = obj.thirdMax(nums);

        System.out.println("Third Maximum = " + result);
    }
}
