import java.util.*;

public class Question2089 {

    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Question2089 solution = new Question2089();

        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        System.out.println(solution.targetIndices(nums, target));
    }
}
