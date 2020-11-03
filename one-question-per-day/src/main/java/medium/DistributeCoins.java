package medium;

import vo.singly.TreeNode;

/**
 * 二叉树中分配硬币
 *
 * @author huldar
 * @date 2020-11-02 19:49
 */
public class DistributeCoins {
    int res = 0;
    public int distributeCoins(TreeNode root) {
        if (dfs(root) == 0) {
            return res;
        } else {
            return 0;
        }
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int l = dfs(node.left);
        int r = dfs(node.right);
        res += Math.abs(l) + Math.abs(r);

        return node.val + l + r - 1;
    }
}
