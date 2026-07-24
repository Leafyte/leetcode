public class Question125 {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Question125 obj = new Question125();

        String s = "A man, a plan, a canal: Panama";

        boolean result = obj.isPalindrome(s);

        System.out.println("Is Palindrome: " + result);
    }
}
