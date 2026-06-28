import java.util.*;

public class Question1846 {

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {

        Question1846 obj = new Question1846();
        int[] arr = {2, 2, 1, 2, 1};
        int result = obj.maximumElementAfterDecrementingAndRearranging(arr);
        System.out.println("Maximum Element: " + result);
    }
}
