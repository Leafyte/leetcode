public class Question836 {

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        int width = Math.min(rec1[2], rec2[2])
                  - Math.max(rec1[0], rec2[0]);

        int height = Math.min(rec1[3], rec2[3])
                   - Math.max(rec1[1], rec2[1]);

        return width > 0 && height > 0;
    }

    public static void main(String[] args) {

        Question836 obj = new Question836();

        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};

        boolean result = obj.isRectangleOverlap(rec1, rec2);

        System.out.println("Rectangles Overlap = " + result);
    }
}
