import java.util.*;

public class Question590 {

    static class Node {
        public int val;
        public List<Node> children;

        public Node(int val) {
            this.val = val;
            this.children = new ArrayList<>();
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

    public List<Integer> postorder(Node root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // Visit all children first
        for (Node child : root.children) {
            result.addAll(postorder(child));
        }

        // Visit the current node
        result.add(root.val);

        return result;
    }

    public static void main(String[] args) {

        Question590 obj = new Question590();

        /*
                 1
              /  |  \
             3   2   4
            / \
           5   6

           Postorder: 5, 6, 3, 2, 4, 1
        */

        Node root = new Node(1);

        Node node3 = new Node(3);
        node3.children.add(new Node(5));
        node3.children.add(new Node(6));

        root.children.add(node3);
        root.children.add(new Node(2));
        root.children.add(new Node(4));

        List<Integer> result = obj.postorder(root);

        System.out.println("Postorder Traversal = " + result);
    }
}
