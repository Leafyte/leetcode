public class Question171 {

    public int titleToNumber(String columnTitle) {
        if (columnTitle == null) {
            return -1;
        }

        int sum = 0;

        for (char c : columnTitle.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }

        return sum;
    }

    public static void main(String[] args) {
        Question171 solution = new Question171();

        String columnTitle = "AB";

        System.out.println(
            "Column Number = " + solution.titleToNumber(columnTitle)
        );
    }
}
