import java.util.*;

public class Question2492 {

    List<int[]>[] graph;
    boolean[] visited;
    int answer = Integer.MAX_VALUE;

    public int minScore(int n, int[][] roads) {

        graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] road : roads) {

            int u = road[0];
            int v = road[1];
            int w = road[2];

            graph[u].add(new int[]{v, w});
            graph[v].add(new int[]{u, w});
        }

        visited = new boolean[n + 1];

        dfs(1);

        return answer;
    }

    private void dfs(int node) {

        visited[node] = true;

        for (int[] next : graph[node]) {

            int neighbor = next[0];
            int weight = next[1];

            answer = Math.min(answer, weight);

            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {

        Question2492 obj = new Question2492();

        int n = 4;

        int[][] roads = {
            {1, 2, 9},
            {2, 3, 6},
            {2, 4, 5},
            {1, 4, 7}
        };

        int result = obj.minScore(n, roads);

        System.out.println("Minimum Score: " + result);
    }
}
