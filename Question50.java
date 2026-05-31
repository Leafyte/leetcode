public class Question50 {

    public double myPow(double x, int n) {
        long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }
        double result = 1.0;
        while (power > 0) {
            if ((power & 1) == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }
        return result;
    }

    public static void main(String[] args) {w
        Question50 obj = new Question50();
        double x = 2.0;
        int n = 10;
        double result = obj.myPow(x, n);
        System.out.println("Power: " + result);
    }
}
