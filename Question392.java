public class Question392 {

    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {

        Question392 obj = new Question392();

        String s = "abc";
        String t = "ahbgdc";

        boolean result = obj.isSubsequence(s, t);

        System.out.println("Is Subsequence: " + result);
    }
}
