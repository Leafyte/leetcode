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

public class Question144 {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        preorder(root, result);

        return result;
    }

    private void preorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        // Root
        result.add(root.val);

        // Left
        preorder(root.left, result);

        // Right
        preorder(root.right, result);
    }

    public static void main(String[] args) {

        Question144 obj = new Question144();

        // Tree:
        //       1
        //        \
        //         2
        //        /
        //       3

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = obj.preorderTraversal(root);

        System.out.println("Preorder Traversal: " + result);
    }
}
