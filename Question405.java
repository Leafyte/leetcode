public class Question405 {

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        while (num != 0) {
            int digit = num & 15;
            result.append(hex[digit]);
            num >>>= 4;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Question405 solution = new Question405();

        int num = 26;

        System.out.println("Hexadecimal = " + solution.toHex(num));
    }
}
