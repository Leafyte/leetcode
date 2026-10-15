import java.util.*;

public class Question2913 {

    public int sumCounts(List<Integer> nums) {

        int n = nums.size();
        int sum = 0;

        for (int i = 0; i < n; i++) {

            boolean[] seen = new boolean[101];
            int distinct = 0;

            for (int j = i; j < n; j++) {

                int num = nums.get(j);

                if (!seen[num]) {
                    seen[num] = true;
                    distinct++;
                }

                sum += distinct * distinct;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Question2913 obj = new Question2913();

        List<Integer> nums = Arrays.asList(1, 2, 1);

        int result = obj.sumCounts(nums);

        System.out.println("Sum of Counts = " + result);
    }
}
