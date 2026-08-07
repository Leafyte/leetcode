public class Question263 {

    public boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        Question263 obj = new Question263();

        int n = 6;

        boolean result = obj.isUgly(n);

        System.out.println("Is Ugly Number: " + result);
    }
}
