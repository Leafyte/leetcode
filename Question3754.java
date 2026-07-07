public class Question3754 {

    public long sumAndMultiply(int n) {

        if (n == 0) {
            return 0;
        }

        String s = String.valueOf(n);

        long x = 0;
        long sum = 0;

        for (char ch : s.toCharArray()) {

            int digit = ch - '0';

            if (digit != 0) {
                x = x * 10 + digit;
                sum += digit;
            }
        }

        return x * sum;
    }

    public static void main(String[] args) {

        Question3754 obj = new Question3754();

        int n = 10203;

        long result = obj.sumAndMultiply(n);

        System.out.println("Result: " + result);
    }
}
