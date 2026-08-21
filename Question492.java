public class Question492 {

    public int[] constructRectangle(int area) {

        for (int w = (int) Math.sqrt(area); w >= 1; w--) {

            if (area % w == 0) {

                int l = area / w;

                return new int[]{l, w};
            }
        }

        return new int[]{area, 1};
    }

    public static void main(String[] args) {

        Question492 obj = new Question492();

        int area = 37;

        int[] result = obj.constructRectangle(area);

        System.out.println(
            "Length = " + result[0] +
            ", Width = " + result[1]
        );
    }
}
