package medium;

import vo.singly.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 路径总和2
 *
 * @author huldar
 * @date 2020-10-28 19:50
 */
public class PathSum2 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, sum, 0, new ArrayList<>(), result);
        return result;
    }

    private void dfs(TreeNode root, int sum, int total, List<Integer> list, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        total += root.val;

        if (root.left == null && root.right == null) {
            if (sum == total) {
                result.add(new ArrayList<>(list));
            }
            list.remove(list.size() - 1);
            return;
        }
        dfs(root.left, sum, total, list, result);
        dfs(root.right, sum, total, list, result);
        list.remove(list.size() - 1);
    }

}
