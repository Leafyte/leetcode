public class Question70 {

    public int climbStairs(int n) {

        if (n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {

            int current = first + second;
            first = second;
            second = current;
        }

        return second;
    }

    public static void main(String[] args) {

        Question70 obj = new Question70();

        int n = 5;

        int result = obj.climbStairs(n);

        System.out.println("Number of Ways: " + result);
    }
}
