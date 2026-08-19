import java.util.*;

public class Question1386 {

    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Set<Integer>> reserved = new HashMap<>();

        // Store reserved seats row by row
        for (int[] seat : reservedSeats) {

            int row = seat[0];
            int col = seat[1];

            reserved
                .computeIfAbsent(row, k -> new HashSet<>())
                .add(col);
        }

        // Every completely empty row can fit 2 groups
        long result = 2L * n;

        // Only process rows that contain reservations
        for (Map.Entry<Integer, Set<Integer>> entry : reserved.entrySet()) {

            Set<Integer> seats = entry.getValue();

            boolean left = true;
            boolean right = true;
            boolean middle = true;

            // Seats 2,3,4,5
            for (int i = 2; i <= 5; i++) {
                if (seats.contains(i)) {
                    left = false;
                    break;
                }
            }

            // Seats 6,7,8,9
            for (int i = 6; i <= 9; i++) {
                if (seats.contains(i)) {
                    right = false;
                    break;
                }
            }

            // Seats 4,5,6,7
            for (int i = 4; i <= 7; i++) {
                if (seats.contains(i)) {
                    middle = false;
                    break;
                }
            }

            // This row was initially counted as 2 groups.
            // Recalculate its actual contribution.
            if (left && right) {
                // Still 2 groups
            } else if (left || right || middle) {
                result -= 1;
            } else {
                result -= 2;
            }
        }

        return (int) result;
    }

    public static void main(String[] args) {

        Question1386 obj = new Question1386();

        int n = 3;

        int[][] reservedSeats = {
            {1, 2},
            {1, 3},
            {1, 8},
            {2, 6}
        };

        int result = obj.maxNumberOfFamilies(n, reservedSeats);

        System.out.println("Maximum Number of Families = " + result);
    }
}
