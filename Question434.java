public class Question434 {

    public int countSegments(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ' &&
                (i == 0 || s.charAt(i - 1) == ' ')) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Question434 obj = new Question434();

        String s = "Hello, my name is John";

        int result = obj.countSegments(s);

        System.out.println("Number of Segments = " + result);
    }
}
