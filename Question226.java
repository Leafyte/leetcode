public class Question226 {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        // Swap left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Invert both subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {

        Question226 obj = new Question226();

        // Original tree:
        //
        //       4
        //      / \
        //     2   7
        //    / \ / \
        //   1  3 6  9

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        obj.invertTree(root);

        System.out.println("Tree inverted successfully.");
    }
}

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
