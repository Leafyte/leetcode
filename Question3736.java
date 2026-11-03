public class Question3736 {

    public int minMoves(int[] nums) {
        int max = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
        }

        int moves = 0;

        for (int num : nums) {
            moves += max - num;
        }

        return moves;
    }

    public static void main(String[] args) {
        Question3736 solution = new Question3736();

        int[] nums = {1, 2, 3};

        System.out.println(
            "Minimum Moves = " + solution.minMoves(nums)
        );
    }
}
