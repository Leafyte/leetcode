import java.util.*;

public class Question350 {

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Store frequency of nums1
        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Check nums2
        for (int num : nums2) {

            if (freq.getOrDefault(num, 0) > 0) {
                result.add(num);

                // Use one occurrence
                freq.put(num, freq.get(num) - 1);
            }
        }

        // Convert ArrayList<Integer> to int[]
        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Question350 obj = new Question350();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = obj.intersect(nums1, nums2);

        System.out.println("Intersection = " + Arrays.toString(result));
    }
}
