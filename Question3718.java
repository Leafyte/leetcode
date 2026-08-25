import java.util.*;

public class Question3718 {

    public int missingMultiple(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int multiple = k;

        while (set.contains(multiple)) {
            multiple += k;
        }

        return multiple;
    }

    public static void main(String[] args) {

        Question3718 obj = new Question3718();

        int[] nums = {1, 2, 3, 4, 6, 8, 10};
        int k = 2;

        int result = obj.missingMultiple(nums, k);

        System.out.println("Smallest Missing Multiple = " + result);
    }
}
