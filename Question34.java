import java.util.*;

public class Question34 {

    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private int findLast(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Question34 obj = new Question34();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = obj.searchRange(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
