public class Question3536 {

    public int maxProduct(int n) {

        int largest = 0;
        int secondLargest = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit >= largest) {

                secondLargest = largest;
                largest = digit;

            } else if (digit > secondLargest) {

                secondLargest = digit;
            }

            n /= 10;
        }

        return largest * secondLargest;
    }

    public static void main(String[] args) {

        Question3536 obj = new Question3536();

        int n = 63942;

        int result = obj.maxProduct(n);

        System.out.println("Maximum Product = " + result);
    }
}
