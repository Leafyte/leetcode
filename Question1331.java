import java.util.*;

public class Question1331 {

    public int[] arrayRankTransform(int[] arr) {

        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        Map<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;

        for (int num : sorted) {

            if (!rankMap.containsKey(num)) {

                rankMap.put(num, rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {

        Question1331 obj = new Question1331();

        int[] arr = {40, 10, 20, 30};

        int[] result = obj.arrayRankTransform(arr);

        System.out.println("Rank Transformed Array:");

        System.out.println(Arrays.toString(result));
    }
}
