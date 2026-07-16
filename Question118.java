import java.util.*;

public class Question118 {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                // First and last element
                if (j == 0 || j == i) {

                    row.add(1);
                }

                else {

                    List<Integer> prev = result.get(i - 1);

                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {

        Question118 obj = new Question118();

        int numRows = 5;

        List<List<Integer>> result = obj.generate(numRows);

        System.out.println("Pascal's Triangle:");

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
