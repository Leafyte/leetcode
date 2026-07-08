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

public class Question104 {

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

        Question104 obj = new Question104();

        // Tree:
        //        3
        //       / \
        //      9  20
        //        /  \
        //       15   7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20,
                new TreeNode(15),
                new TreeNode(7));

        int result = obj.maxDepth(root);

        System.out.println("Maximum Depth: " + result);
    }
}
