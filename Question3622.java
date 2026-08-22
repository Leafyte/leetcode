public class Question3622 {

    public boolean checkDivisibility(int n) {

        int temp = n;
        int sum = 0;
        int product = 1;

        while (temp > 0) {

            int digit = temp % 10;

            sum += digit;
            product *= digit;

            temp /= 10;
        }

        return n % (sum + product) == 0;
    }

    public static void main(String[] args) {

        Question3622 obj = new Question3622();

        int n = 99;

        boolean result = obj.checkDivisibility(n);

        System.out.println("Is Divisible: " + result);
    }
}
