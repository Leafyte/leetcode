public class Question342 {

    public boolean isPowerOfFour(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        Question342 obj = new Question342();

        int n = 16;

        boolean result = obj.isPowerOfFour(n);

        System.out.println("Is Power of Four = " + result);
    }
}
