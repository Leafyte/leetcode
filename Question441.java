public class Question441 {

    public int arrangeCoins(int n) {
        long left = 1;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coins = mid * (mid + 1) / 2;

            if (coins == n) {
                return (int) mid;
            } else if (coins < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right;
    }

    public static void main(String[] args) {
        Question441 solution = new Question441();

        int n = 8;

        System.out.println(
            "Complete Rows = " + solution.arrangeCoins(n)
        );
    }
}
