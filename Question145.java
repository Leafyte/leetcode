import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Question145 {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        postorder(root, result);

        return result;
    }

    private void postorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        // Left
        postorder(root.left, result);

        // Right
        postorder(root.right, result);

        // Root
        result.add(root.val);
    }

    public static void main(String[] args) {

        Question145 obj = new Question145();

        // Tree:
        //       1
        //        \
        //         2
        //        /
        //       3

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = obj.postorderTraversal(root);

        System.out.println("Postorder Traversal: " + result);
    }
}
