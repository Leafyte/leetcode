import java.util.*;

public class Question66 {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {

        Question66 obj = new Question66();

        int[] digits = {9, 9, 9};

        int[] result = obj.plusOne(digits);

        System.out.println(Arrays.toString(result));
    }
}
