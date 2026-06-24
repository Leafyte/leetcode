public class Question81 {

    public boolean search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // Cannot determine sorted side
            if (nums[left] == nums[mid] &&
                nums[mid] == nums[right]) {

                left++;
                right--;
            }

            // Left half sorted
            else if (nums[left] <= nums[mid]) {

                if (nums[left] <= target &&
                    target < nums[mid]) {

                    right = mid - 1;
                }

                else {

                    left = mid + 1;
                }
            }

            // Right half sorted
            else {

                if (nums[mid] < target &&
                    target <= nums[right]) {

                    left = mid + 1;
                }

                else {

                    right = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Question81 obj = new Question81();

        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        boolean result = obj.search(nums, target);

        System.out.println("Target Found: " + result);
    }
}
