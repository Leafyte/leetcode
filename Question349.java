import java.util.*;

public class Question349 {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        // Store elements of nums1
        for (int num : nums1) {
            set.add(num);
        }

        HashSet<Integer> result = new HashSet<>();

        // Find common elements
        for (int num : nums2) {

            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Convert HashSet to array
        int[] ans = new int[result.size()];

        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }

    public static void main(String[] args) {

        Question349 obj = new Question349();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = obj.intersection(nums1, nums2);

        System.out.print("Intersection: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
