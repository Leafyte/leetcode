public class Question389 {

    public char findTheDifference(String s, String t) {
        char result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }

    public static void main(String[] args) {
        Question389 solution = new Question389();

        String s = "abcd";
        String t = "abcde";

        System.out.println(
            "Extra character = " + solution.findTheDifference(s, t)
        );
    }
}
