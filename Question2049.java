
public class Question2049 {

    public static int countDaysTogether(String arriveAlice, String leaveAlice,
                                        String arriveBob, String leaveBob) {

        int aliceStart = convert(arriveAlice);
        int aliceEnd = convert(leaveAlice);
        int bobStart = convert(arriveBob);
        int bobEnd = convert(leaveBob);

        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);

        if (end < start) {
            return 0;
        }

        return end - start + 1;
    }

    public static int convert(String date) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int totalDays = day;

        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        return totalDays;
    }

    public static void main(String[] args) {
        String arriveAlice = "08-15";
        String leaveAlice = "08-18";
        String arriveBob = "08-16";
        String leaveBob = "08-19";

        int result = countDaysTogether(
            arriveAlice, leaveAlice, arriveBob, leaveBob
        );

        System.out.println(result);
    }
}
