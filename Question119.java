import java.util.*;

public class Question119 {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();

        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {

            row.add(1);

            for (int j = i - 1; j > 0; j--) {

                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }

    public static void main(String[] args) {

        Question119 obj = new Question119();

        int rowIndex = 3;

        List<Integer> result = obj.getRow(rowIndex);

        System.out.println("Pascal Row " + rowIndex + ":");

        System.out.println(result);
    }
}
