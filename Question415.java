public class Question415 {

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            result.append(sum % 10);
            carry = sum / 10;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Question415 solution = new Question415();

        String num1 = "456";
        String num2 = "77";

        System.out.println("Sum = " + solution.addStrings(num1, num2));
    }
}
