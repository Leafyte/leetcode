import java.util.*;

public class Question1288 {

    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {

            if (a[0] == b[0]) {
                return b[1] - a[1];
            }

            return a[0] - b[0];
        });

        int count = 0;
        int maxEnd = 0;

        for (int[] interval : intervals) {

            if (interval[1] > maxEnd) {

                count++;
                maxEnd = interval[1];
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Question1288 obj = new Question1288();

        int[][] intervals = {
            {1, 4},
            {3, 6},
            {2, 8}
        };

        int result = obj.removeCoveredIntervals(intervals);

        System.out.println("Remaining Intervals: " + result);
    }
}
