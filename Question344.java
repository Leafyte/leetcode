public class Question344 {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Question344 solution = new Question344();

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        solution.reverseString(s);

        System.out.println("Reversed String = " + new String(s));
    }
}
