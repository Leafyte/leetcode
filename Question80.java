import java.util.*;

public class Question80 {

    public int removeDuplicates(int[] nums) {

        int k = 0;

        for (int num : nums) {

            if (k < 2 || num != nums[k - 2]) {

                nums[k] = num;
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        Question80 obj = new Question80();

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = obj.removeDuplicates(nums);

        System.out.println("k = " + k);

        System.out.print("Modified Array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}
