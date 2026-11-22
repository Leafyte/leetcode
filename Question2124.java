
public class Question2124 {

    public boolean checkString(String s) {
        boolean foundB = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                foundB = true;
            } else if (foundB) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Question2124 solution = new Question2124();

        String s = "aaabbb";

        System.out.println("Valid Order: " + solution.checkString(s));
    }
}
