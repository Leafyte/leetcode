public class Question1021 {

    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();

        int depth = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                // Add only if this is not the outermost '('
                if (depth > 0) {
                    result.append(c);
                }

                depth++;
            }

            else {
                depth--;

                // Add only if this is not the outermost ')'
                if (depth > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Question1021 obj = new Question1021();

        String s = "(()())(())";

        String result = obj.removeOuterParentheses(s);

        System.out.println("After Removing Outer Parentheses = " + result);
    }
}
