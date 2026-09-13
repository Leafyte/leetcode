public class Question3870 {

    public int countCommas(int n) {

        if (n < 1000) {
            return 0;
        }

        return n - 999;
    }

    public static void main(String[] args) {

        Question3870 obj = new Question3870();

        int n = 100000;

        int result = obj.countCommas(n);

        System.out.println("Total Commas = " + result);
    }
}
