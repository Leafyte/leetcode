public class Question338 {

    public int[] countBits(int n) {

        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }

    public static void main(String[] args) {

        Question338 obj = new Question338();

        int n = 5;

        int[] result = obj.countBits(n);

        System.out.print("Counting Bits: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
