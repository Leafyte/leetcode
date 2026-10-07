public class Question258 {

    public int addDigits(int num) {

        while (num >= 10) {

            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {

        Question258 obj = new Question258();

        int num = 38;

        int result = obj.addDigits(num);

        System.out.println("Single Digit Result = " + result);
    }
}
