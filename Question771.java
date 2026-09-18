import java.util.*;

public class Question771 {

    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> jewelSet = new HashSet<>();

        for (char c : jewels.toCharArray()) {
            jewelSet.add(c);
        }

        int count = 0;

        for (char c : stones.toCharArray()) {
            if (jewelSet.contains(c)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Question771 obj = new Question771();

        String jewels = "aA";
        String stones = "aAAbbbb";

        int result = obj.numJewelsInStones(jewels, stones);

        System.out.println("Number of Jewels = " + result);
    }
}
