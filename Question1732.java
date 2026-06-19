public class Question1732 {

    public int largestAltitude(int[] gain) {

        int altitude = 0;
        int maxAltitude = 0;

        for (int g : gain) {

            altitude += g;

            maxAltitude = Math.max(maxAltitude, altitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {

        Question1732 obj = new Question1732();

        int[] gain = {-5, 1, 5, 0, -7};

        int result = obj.largestAltitude(gain);

        System.out.println("Highest Altitude: " + result);
    }
}
