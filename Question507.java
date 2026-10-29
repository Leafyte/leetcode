public class Question507 {

    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                sum += i;

                int pair = num / i;

                if (pair != i) {
                    sum += pair;
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Question507 solution = new Question507();

        int num = 28;

        System.out.println(
            "Is Perfect Number? " + solution.checkPerfectNumber(num)
        );
    }
}
