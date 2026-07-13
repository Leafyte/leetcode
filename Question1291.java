import java.util.*;

public class Question1291 {

    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> result = new ArrayList<>();

        String digits = "123456789";

        for (int length = 2; length <= 9; length++) {

            for (int start = 0; start + length <= 9; start++) {

                String s = digits.substring(start, start + length);

                int num = Integer.parseInt(s);

                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Question1291 obj = new Question1291();

        int low = 100;
        int high = 300;

        List<Integer> result = obj.sequentialDigits(low, high);

        System.out.println("Sequential Digits:");

        System.out.println(result);
    }
}
