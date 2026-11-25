public class Question2404 {

    public int mostFrequentEven(int[] nums) {
        int[] freq = new int[100001];

        for (int el : nums) {
            freq[el]++;
        }

        int maxfreq = 0;
        int ans = -1;

        for (int i = 0; i < freq.length; i++) {
            if (i % 2 == 0 && freq[i] > maxfreq) {
                maxfreq = freq[i];
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Question2404 solution = new Question2404();

        int[] nums = {0, 1, 2, 2, 4, 4, 1, 2};

        System.out.println("Most Frequent Even: " +
            solution.mostFrequentEven(nums));
    }
}
