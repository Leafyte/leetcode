public class Question3513 {

    public int uniqueXorTriplets(int[] nums) {

        int n = nums.length;

        if (n < 3) {
            return n;
        }

        int bits = 32 - Integer.numberOfLeadingZeros(n);

        return 1 << bits;
    }

    public static void main(String[] args) {

        Question3513 obj = new Question3513();

        int[] nums = {1, 2, 3, 4};

        int result = obj.uniqueXorTriplets(nums);

        System.out.println("Number of Unique XOR Triplets = " + result);
    }
}
