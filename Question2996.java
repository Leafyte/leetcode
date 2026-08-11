import java.util.*;

public class Question2996 {

    public int missingInteger(int[] nums) {

        // Find sum of longest sequential prefix
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Store all numbers in the array
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        // Find smallest missing number >= sum
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }

    public static void main(String[] args) {

        Question2996 obj = new Question2996();

        int[] nums = {1, 2, 3, 2, 5};

        int result = obj.missingInteger(nums);

        System.out.println("Smallest Missing Integer = " + result);
    }
}
