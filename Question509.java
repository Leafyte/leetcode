public class Question509 {

    public int fib(int n) {

        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }

    public static void main(String[] args) {

        Question509 obj = new Question509();

        int n = 4;

        int result = obj.fib(n);

        System.out.println("Fibonacci Number = " + result);
    }
}
