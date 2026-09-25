public class Question701 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

    // Inorder traversal to display the BST
    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Question701 obj = new Question701();

        /*
                 4
                / \
               2   7
              / \
             1   3

            Insert 5

                 4
                / \
               2   7
              / \ /
             1  3 5
        */

        TreeNode root = new TreeNode(
            4,
            new TreeNode(
                2,
                new TreeNode(1),
                new TreeNode(3)
            ),
            new TreeNode(7)
        );

        int val = 5;

        root = obj.insertIntoBST(root, val);

        System.out.print("Inorder Traversal = ");
        obj.inorder(root);
    }
}
