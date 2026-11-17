
import java.util.*;

public class Question1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        // Find the minimum difference
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        // Collect all pairs with the minimum difference
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Question1200 solution = new Question1200();

        int[] arr = {4, 2, 1, 3};

        System.out.println(solution.minimumAbsDifference(arr));
    }
}
