public class Question3498 {

    public int reverseDegree(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int reversePosition = 26 - (s.charAt(i) - 'a');

            int position = i + 1;

            sum += reversePosition * position;
        }

        return sum;
    }

    public static void main(String[] args) {

        Question3498 obj = new Question3498();

        String s = "abc";

        int result = obj.reverseDegree(s);

        System.out.println("Reverse Degree = " + result);
    }
}
