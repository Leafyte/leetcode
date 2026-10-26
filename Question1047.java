public class Question1047 {

    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = stack.length();

            if (len > 0 && stack.charAt(len - 1) == c) {
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(c);
            }
        }

        return stack.toString();
    }

    public static void main(String[] args) {
        Question1047 solution = new Question1047();

        String s = "abbaca";

        System.out.println(
            "After removing duplicates = " + solution.removeDuplicates(s)
        );
    }
}
