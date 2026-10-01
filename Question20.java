import java.util.*;

public class Question20 {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // Opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // Closing brackets
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (c == ')' && top != '(') {
                    return false;
                }

                if (c == '}' && top != '{') {
                    return false;
                }

                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Question20 obj = new Question20();

        String s = "()[]{}";

        boolean result = obj.isValid(s);

        System.out.println("Valid Parentheses = " + result);
    }
}
