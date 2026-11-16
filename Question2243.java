
public class Question2243 {

    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;

                for (int j = i; j < Math.min(i + k, s.length()); j++) {
                    sum += s.charAt(j) - '0';
                }

                result.append(sum);
            }

            s = result.toString();
        }

        return s;
    }

    public static void main(String[] args) {
        Question2243 solution = new Question2243();

        String s = "11111222223";
        int k = 3;

        System.out.println("Digit Sum: " + solution.digitSum(s, k));
    }
}
