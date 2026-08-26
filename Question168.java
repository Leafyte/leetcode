public class Question168 {

    public String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {

            columnNumber--;

            int remainder = columnNumber % 26;

            char ch = (char) ('A' + remainder);

            result.append(ch);

            columnNumber /= 26;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        Question168 obj = new Question168();

        int columnNumber = 28;

        String result = obj.convertToTitle(columnNumber);

        System.out.println("Excel Column Title = " + result);
    }
}
