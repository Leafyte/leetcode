import java.util.*;

public class Question412 {

    public List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                answer.add("Fizz");
            }
            else if (i % 5 == 0) {
                answer.add("Buzz");
            }
            else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Question412 obj = new Question412();

        int n = 15;

        List<String> result = obj.fizzBuzz(n);

        System.out.println("FizzBuzz Result = " + result);
    }
}
