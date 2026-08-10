public class Question190 {

    public int reverseBits(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {

            // Get the last bit of n
            int bit = n & 1;

            // Shift result left and add the bit
            result = (result << 1) | bit;

            // Move to the next bit
            n >>>= 1;
        }

        return result;
    }

    public static void main(String[] args) {

        Question190 obj = new Question190();

        int n = 43261596;

        int result = obj.reverseBits(n);

        System.out.println("Reversed Bits = " + result);
    }
}
