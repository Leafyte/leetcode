public class Question3345 {

    public int smallestNumber(int n, int t) {

        while (true) {

            if (digitProduct(n) % t == 0) {
                return n;
            }

            n++;
        }
    }

    private int digitProduct(int num) {

        int product = 1;

        while (num > 0) {

            product *= num % 10;

            num /= 10;
        }

        return product;
    }

    public static void main(String[] args) {

        Question3345 obj = new Question3345();

        int n = 10;
        int t = 2;

        int result = obj.smallestNumber(n, t);

        System.out.println("Smallest Number = " + result);
    }
}
