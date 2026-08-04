import java.util.*;

public class Question3731 {

    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Question3378 obj = new Question3378();

        int[] nums = {1, 3, 5, 6};

        List<Integer> result = obj.findMissingElements(nums);

        System.out.println("Missing Elements: " + result);
    }
}
