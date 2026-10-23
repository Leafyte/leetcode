public class Question461 {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;

        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Question461 solution = new Question461();

        int x = 1;
        int y = 4;

        System.out.println(
            "Hamming Distance = " + solution.hammingDistance(x, y)
        );
    }
}
