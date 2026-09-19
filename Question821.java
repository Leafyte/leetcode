import java.util.*;

public class Question821 {

    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] answer = new int[n];

        // Left to right
        int distance = n;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == c) {
                distance = 0;
            } else {
                distance++;
            }

            answer[i] = distance;
        }

        // Right to left
        distance = n;

        for (int i = n - 1; i >= 0; i--) {

            if (s.charAt(i) == c) {
                distance = 0;
            } else {
                distance++;
            }

            answer[i] = Math.min(answer[i], distance);
        }

        return answer;
    }

    public static void main(String[] args) {

        Question821 obj = new Question821();

        String s = "loveleetcode";
        char c = 'e';

        int[] result = obj.shortestToChar(s, c);

        System.out.println("Shortest Distances = " + Arrays.toString(result));
    }
}
