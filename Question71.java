import java.util.*;

public class Question71 {

    public String simplifyPath(String path) {

        Deque<String> stack = new ArrayDeque<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            if (part.equals("") || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            else {
                stack.push(part);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.insert(0, "/" + stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Question71 obj = new Question71();

        String path = "/home//foo/";

        String result = obj.simplifyPath(path);

        System.out.println("Simplified Path: " + result);
    }
}
