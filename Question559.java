import java.util.*;

public class Question559 {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int max = 0;

        for (Node child : root.children) {
            max = Math.max(max, maxDepth(child));
        }

        return max + 1;
    }

    public static void main(String[] args) {
        Question559 solution = new Question559();

        // Construct an N-ary tree:
        //          1
        //       /  |  \
        //      3   2   4
        //     / \
        //    5   6

        Node root = new Node(1);
        Node node3 = new Node(3);
        Node node2 = new Node(2);
        Node node4 = new Node(4);

        node3.children.add(new Node(5));
        node3.children.add(new Node(6));

        root.children.add(node3);
        root.children.add(node2);
        root.children.add(node4);

        System.out.println(
            "Maximum Depth = " + solution.maxDepth(root)
        );
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        children = new ArrayList<>();
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}
