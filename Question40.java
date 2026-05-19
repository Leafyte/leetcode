import java.util.*;

public class Question40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

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

        // invalid
        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // skip duplicates
            if (i > start &&
                candidates[i] == candidates[i - 1]) {
                continue;
            }

            // optimization
            if (candidates[i] > target) {
                break;
            }

            current.add(candidates[i]);

            // use each number only once
            backtrack(candidates,
                    target - candidates[i],
                    i + 1,
                    current,
                    result);

            // backtrack
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        Question40 obj = new Question40();

        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result =
                obj.combinationSum2(candidates, target);

        System.out.println(result);
    }
}
