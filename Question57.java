import java.util.*;

public class Question57 {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        // Add intervals before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {

            newInterval[0] =
                    Math.min(newInterval[0], intervals[i][0]);

            newInterval[1] =
                    Math.max(newInterval[1], intervals[i][1]);

            i++;
        }

        result.add(newInterval);

        // Add remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        Question57 obj = new Question57();

        int[][] intervals = {
            {1, 3},
            {6, 9}
        };

        int[] newInterval = {2, 5};

        int[][] result = obj.insert(intervals, newInterval);

        System.out.println("Intervals After Insertion:");

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
