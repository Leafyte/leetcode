import java.util.*;

public class Question78 {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int index,
                           int[] nums,
                           List<Integer> current,
                           List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            current.add(nums[i]);

            backtrack(i + 1, nums, current, result);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        Question78 obj = new Question78();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = obj.subsets(nums);
        System.out.println(result);
    }
}
