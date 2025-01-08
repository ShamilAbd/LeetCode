package pro.shamilabd.CountCompleteTreeNodes;

public class Sol {

    public static void main(String[] args) {
        TreeNode r2L = new TreeNode(6);
        TreeNode l2L = new TreeNode(4);
        TreeNode l2R = new TreeNode(5);
        TreeNode rootL = new TreeNode(2, l2L, l2R);
        TreeNode rootR = new TreeNode(3, r2L, null);
        TreeNode root = new TreeNode(1, rootL, rootR);


        System.out.println(countNodes(root));
    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;
        int r = 1;
        TreeNode node = root;
        if (node.left != null || node.right != null) {
            r += countNodes(node.left);
            r += countNodes(node.right);
        }
        return r;
    }
}
