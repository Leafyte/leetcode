import java.util.*;

public class Question594 {

    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of every number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;

        // Check x and x + 1
        for (int num : map.keySet()) {

            if (map.containsKey(num + 1)) {

                max = Math.max(
                    max,
                    map.get(num) + map.get(num + 1)
                );
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Question594 obj = new Question594();

        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

        int result = obj.findLHS(nums);

        System.out.println("Longest Harmonious Subsequence = " + result);
    }
}
