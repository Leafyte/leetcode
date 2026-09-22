import java.util.*;

public class Question455 {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;
        int count = 0;

        while (child < g.length && cookie < s.length) {

            if (s[cookie] >= g[child]) {
                // Cookie can satisfy this child
                count++;
                child++;
            }

            // Move to the next cookie
            cookie++;
        }

        return count;
    }

    public static void main(String[] args) {

        Question455 obj = new Question455();

        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        int result = obj.findContentChildren(g, s);

        System.out.println("Content Children = " + result);
    }
}
