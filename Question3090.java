public class Question3090 {

    public int maximumLengthSubstring(String s) {

        int[] count = new int[26];

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            int current = s.charAt(right) - 'a';
            count[current]++;

            // Current character appears more than twice
            while (count[current] > 2) {

                int leftChar = s.charAt(left) - 'a';
                count[leftChar]--;

                left++;
            }

            maxLength = Math.max(
                    maxLength,
                    right - left + 1
            );
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Question3090 obj = new Question3090();

        String s = "bcbbbcba";

        int result = obj.maximumLengthSubstring(s);

        System.out.println("Maximum Length = " + result);
    }
}
