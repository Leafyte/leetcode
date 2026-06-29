public class Question1967 {

    public int numOfStrings(String[] patterns, String word) {

        int count = 0;

        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Question1967 obj = new Question1967();

        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";

        int result = obj.numOfStrings(patterns, word);
        System.out.println("Number of Matching Strings: " + result);
    }
}
