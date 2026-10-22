public class Question1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int total = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                int length = j - i + 1;

                if (length % 2 == 1) {
                    total += sum;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Question1588 solution = new Question1588();

        int[] arr = {1, 4, 2, 5, 3};

        System.out.println(
            "Sum of odd-length subarrays = "
            + solution.sumOddLengthSubarrays(arr)
        );
    }
}
