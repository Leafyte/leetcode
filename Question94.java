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

public class Question94 {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        inorder(root, result);

        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {

        if (node == null) {
            return;
        }

        inorder(node.left, result);

        result.add(node.val);

        inorder(node.right, result);
    }

    public static void main(String[] args) {

        Question94 obj = new Question94();

        // Tree:
        //     1
        //      \
        //       2
        //      /
        //     3

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = obj.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + result);
    }
}
