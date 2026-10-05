import java.util.*;

public class Question401 {

    public List<String> readBinaryWatch(int turnedOn) {

        List<String> result = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {

            for (int minute = 0; minute < 60; minute++) {

                int leds = Integer.bitCount(hour)
                         + Integer.bitCount(minute);

                if (leds == turnedOn) {
                    result.add(String.format("%d:%02d", hour, minute));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Question401 obj = new Question401();

        int turnedOn = 1;

        List<String> result = obj.readBinaryWatch(turnedOn);

        System.out.println("Possible Times = " + result);
    }
}
