public class Question678 {

    public boolean checkValidString(String s) {

        int low = 0;
        int high = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                low++;
                high++;
            }

            else if (c == ')') {
                low--;
                high--;
            }

            else { // '*'
                low--;   // Treat '*' as ')'
                high++;  // Treat '*' as '('
            }

            // Even the maximum possibility has too many ')'
            if (high < 0) {
                return false;
            }

            // low cannot be negative
            low = Math.max(low, 0);
        }

        return low == 0;
    }

    public static void main(String[] args) {

        Question678 obj = new Question678();

        String s = "(*)";

        boolean result = obj.checkValidString(s);

        System.out.println("Valid Parenthesis String = " + result);
    }
}
