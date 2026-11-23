import java.util.*;

public class Question1352 {

    List<Integer> prefix;

    public Question1352() {
        prefix = new ArrayList<>();
        prefix.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            prefix.clear();
            prefix.add(1);
        } else {
            int last = prefix.get(prefix.size() - 1);
            prefix.add(last * num);
        }
    }

    public int getProduct(int k) {
        int n = prefix.size();

        if (k >= n) {
            return 0;
        }

        return prefix.get(n - 1) / prefix.get(n - 1 - k);
    }

    public static void main(String[] args) {
        Question1352 solution = new Question1352();

        solution.add(3);
        solution.add(0);
        solution.add(2);
        solution.add(5);
        solution.add(4);

        System.out.println(solution.getProduct(2)); // 20
        System.out.println(solution.getProduct(3)); // 40
        System.out.println(solution.getProduct(4)); // 0
    }
}
