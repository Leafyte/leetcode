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

public class Question110 {

    public boolean isBalanced(TreeNode root) {

        return height(root) != -1;
    }

    private int height(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);

        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = height(node.right);

        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        Question110 obj = new Question110();

        // Tree:
        //        3
        //       / \
        //      9  20
        //         / \
        //        15  7

        TreeNode root = new TreeNode(
            3,
            new TreeNode(9),
            new TreeNode(
                20,
                new TreeNode(15),
                new TreeNode(7)
            )
        );

        boolean result = obj.isBalanced(root);

        System.out.println("Is Balanced: " + result);
    }
}
