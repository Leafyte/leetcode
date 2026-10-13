import java.util.*;

public class Question3727 {
  
    public long maxAlternatingSum(int[] nums) {

        long[] squares = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        long score = 0;
        int n = squares.length;

        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                score -= squares[i];
            } else {
                score += squares[i];
            }
        }

        return score;
    }

    public static void main(String[] args) {

        Question3507 obj = new Question3507();

        int[] nums = {1, 2, 3};

        long result = obj.maxAlternatingSum(nums);

        System.out.println("Maximum Alternating Sum = " + result);
    }
}
