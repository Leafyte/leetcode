import java.util.*;

public class Question290 {

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char c = pattern.charAt(i);
            String word = words[i];

            // Check character -> word
            if (charToWord.containsKey(c)) {

                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            }

            // Check word -> character
            if (wordToChar.containsKey(word)) {

                if (wordToChar.get(word) != c) {
                    return false;
                }
            }

            charToWord.put(c, word);
            wordToChar.put(word, c);
        }

        return true;
    }

    public static void main(String[] args) {

        Question290 obj = new Question290();

        String pattern = "abba";
        String s = "dog cat cat dog";

        boolean result = obj.wordPattern(pattern, s);

        System.out.println("Follows Pattern: " + result);
    }
}
