public class Question58 {

    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;

        // skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int length = 0;

        // count last word characters
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {

        Question58 obj = new Question58();

        String s = "Hello World";

        int result = obj.lengthOfLastWord(s);

        System.out.println("Length of Last Word: " + result);
    }
}
