import java.util.*;

public class Question39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, target, 0,
                new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] candidates,
                           int target,
                           int start,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // found valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // invalid path
        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            current.add(candidates[i]);

            // reuse same element
            backtrack(candidates,
                    target - candidates[i],
                    i,
                    current,
                    result);

            // backtrack
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        Question39 obj = new Question39();

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result =
                obj.combinationSum(candidates, target);

        System.out.println(result);
    }
}
