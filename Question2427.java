
public class Question2427 {

    public int commonFactors(int a, int b) {
        int count = 0;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Question2427 solution = new Question2427();

        int a = 12;
        int b = 6;

        System.out.println("Common Factors: " + solution.commonFactors(a, b));
    }
}
