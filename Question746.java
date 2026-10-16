public class Question746 {

    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int prev2 = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = current;
        }

        return Math.min(prev1, prev2);
    }

    public static void main(String[] args) {

        Question746 obj = new Question746();

        int[] cost = {10, 15, 20};

        int result = obj.minCostClimbingStairs(cost);

        System.out.println("Minimum Cost = " + result);
    }
}
