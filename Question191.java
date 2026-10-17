public class Question191 {

    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Question191 solution = new Question191();

        int n = 11; // Binary: 1011

        System.out.println("Number of 1 bits = " + solution.hammingWeight(n));
    }
}
