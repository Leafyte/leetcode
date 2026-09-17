public class Question409 {

    public int longestPalindrome(String s) {

        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : freq) {

            // Use the largest even portion
            length += (count / 2) * 2;

            // One odd character can go in the center
            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length++;
        }

        return length;
    }

    public static void main(String[] args) {

        Question409 obj = new Question409();

        String s = "abccccdd";

        int result = obj.longestPalindrome(s);

        System.out.println("Longest Palindrome Length = " + result);
    }
}
