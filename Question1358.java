public class Question1358 {

    public int numberOfSubstrings(String s) {

        int[] count = new int[3];

        int left = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 &&
                   count[1] > 0 &&
                   count[2] > 0) {

                answer += s.length() - right;

                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Question1358 obj = new Question1358();
        String s = "abcabc";
        int result = obj.numberOfSubstrings(s);
        System.out.println("Number of Substrings: " + result);
    }
}
