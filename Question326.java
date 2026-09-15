public class Question326 {

    public boolean isPowerOfThree(int n) {
        while (n >= 3) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Question326 obj = new Question326();
        int n = 27;
        boolean result = obj.isPowerOfThree(n);
        System.out.println("Is Power of Three = " + result);
    }
}
