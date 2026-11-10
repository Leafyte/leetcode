import java.util.*;

public class Question1051 {

    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();

        Arrays.sort(expected);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Question1051 solution = new Question1051();

        int[] heights = {1, 1, 4, 2, 1, 3};

        System.out.println(
            "Students in Wrong Positions = "
            + solution.heightChecker(heights)
        );
    }
}
