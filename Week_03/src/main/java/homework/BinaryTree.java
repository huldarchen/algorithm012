package homework;

/**
 * LeetCode-89: 验证是有效的二叉搜索树
 *
 * @author bingjie.chen
 * @date 2020/7/25
 */
public class BinaryTree {

    private Integer pre = null;


    public boolean isValidBSTUseInOrder(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBSTUseInOrder(root.left)) {
            return false;
        }
        if (pre != null && root.val <= pre) {
            return false;
        }
        pre = root.val;
        return isValidBSTUseInOrder(root.right);
    }

    /**
     * 树的最大深度
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    /**
     * 反转二叉树
     */
    public TreeNode invertTree(TreeNode root) {
        //terminal
        if (root == null) {
            return null;
        }
        //左子树的节点
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;

    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
