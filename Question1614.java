public class Question1614 {

    public int maxDepth(String s) {

        int depth = 0;
        int maxDepth = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            }

            else if (c == ')') {
                depth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {

        Question1614 obj = new Question1614();

        String s = "(1+(2*3)+((8)/4))+1";

        int result = obj.maxDepth(s);

        System.out.println("Maximum Nesting Depth = " + result);
    }
}
