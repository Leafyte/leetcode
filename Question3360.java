public class Question3360 {

    public boolean canAliceWin(int n) {
        int remove = 10;
        boolean aliceTurn = true;

        while (n >= remove) {
            n -= remove;
            remove--;
            aliceTurn = !aliceTurn;
        }

        return !aliceTurn;
    }

    public static void main(String[] args) {
        Question3360 solution = new Question3360();

        int n = 12;

        System.out.println("Can Alice Win: " + solution.canAliceWin(n));
    }
}
