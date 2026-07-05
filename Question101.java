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

public class Question101 {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }

    public static void main(String[] args) {

        Question101 obj = new Question101();

        // Symmetric Tree:
        //        1
        //      /   \
        //     2     2
        //    / \   / \
        //   3   4 4   3

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2,
                new TreeNode(3),
                new TreeNode(4));

        root.right = new TreeNode(2,
                new TreeNode(4),
                new TreeNode(3));

        boolean result = obj.isSymmetric(root);

        System.out.println("Is Symmetric: " + result);
    }
}
