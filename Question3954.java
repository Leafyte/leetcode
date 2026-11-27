public class Question3954 {

    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;

        int start = Math.max(1, n - k);
        int end = n + k;

        for (int x = start; x <= end; x++) {
            if ((n & x) == 0) {
                sum += x;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Question3954 solution = new Question3954();

        int n = 2;
        int k = 3;

        System.out.println("Sum of Compatible Numbers: " +
            solution.sumOfGoodIntegers(n, k));
    }
}
