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

public class Question112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        int remaining = targetSum - root.val;

        return hasPathSum(root.left, remaining) ||
               hasPathSum(root.right, remaining);
    }

    public static void main(String[] args) {

        Question112 obj = new Question112();

        // Tree:
        //
        //          5
        //        /   \
        //       4     8
        //      /     / \
        //     11    13  4
        //    /  \         \
        //   7    2         1

        TreeNode root = new TreeNode(
            5,
            new TreeNode(
                4,
                new TreeNode(
                    11,
                    new TreeNode(7),
                    new TreeNode(2)
                ),
                null
            ),
            new TreeNode(
                8,
                new TreeNode(13),
                new TreeNode(
                    4,
                    null,
                    new TreeNode(1)
                )
            )
        );

        int targetSum = 22;

        boolean result = obj.hasPathSum(root, targetSum);

        System.out.println("Has Path Sum: " + result);
    }
}
