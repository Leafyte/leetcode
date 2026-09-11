public class Question3483 {

    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];

        // Count frequency of each digit
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;

        // Try every 3-digit even number
        for (int num = 100; num <= 998; num += 2) {

            int ones = num % 10;
            int tens = (num / 10) % 10;
            int hundreds = num / 100;

            // Check whether required digits are available
            int[] needed = new int[10];

            needed[ones]++;
            needed[tens]++;
            needed[hundreds]++;

            boolean possible = true;

            for (int i = 0; i < 10; i++) {
                if (needed[i] > freq[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Question3483 obj = new Question3483();

        int[] digits = {1, 2, 3, 4};

        int result = obj.totalNumbers(digits);

        System.out.println("Number of Unique 3-Digit Even Numbers = " + result);
    }
}
