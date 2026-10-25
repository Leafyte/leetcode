import java.util.*;

public class Question819 {

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> freq = new HashMap<>();

        String[] words = paragraph.toLowerCase().split("[!?',;. ]+");

        String answer = "";
        int maxCount = 0;

        for (String word : words) {
            if (bannedSet.contains(word)) {
                continue;
            }

            int count = freq.getOrDefault(word, 0) + 1;
            freq.put(word, count);

            if (count > maxCount) {
                maxCount = count;
                answer = word;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Question819 solution = new Question819();

        String paragraph =
            "Bob hit a ball, the hit BALL flew far after it was hit.";

        String[] banned = {"hit"};

        System.out.println(
            "Most Common Word = "
            + solution.mostCommonWord(paragraph, banned)
        );
    }
}
