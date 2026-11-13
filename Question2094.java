import java.util.*;

public class Question2094 {

    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];

        for (int digit : digits) {
            freq[digit]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int num = 100; num <= 998; num += 2) {
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            int[] required = new int[10];

            required[a]++;
            required[b]++;
            required[c]++;

            boolean valid = true;

            for (int i = 0; i < 10; i++) {
                if (required[i] > freq[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(num);
            }
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Question2094 solution = new Question2094();

        int[] digits = {2, 1, 3, 0};

        int[] result = solution.findEvenNumbers(digits);

        System.out.println("Even Numbers = " + Arrays.toString(result));
    }
}
