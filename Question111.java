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

public class Question111 {

    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return 1;
        }

        // Only right subtree exists
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // Only left subtree exists
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(
                minDepth(root.left),
                minDepth(root.right)
        );
    }

    public static void main(String[] args) {

        Question111 obj = new Question111();

        // Tree:
        //        3
        //       / \
        //      9   20
        //         /  \
        //        15   7

        TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(
                        20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        int result = obj.minDepth(root);

        System.out.println("Minimum Depth: " + result);
    }
}
