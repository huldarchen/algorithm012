package day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 *
 * @author huldar
 * @date 2020-09-11 09:52
 */
public class Permute {

    /**
     * 全排列: 给定一个 没有重复 数字的序列，返回其所有可能的全排列
     *
     * 什么是全排列?
     *
     * 思路:
     * 1. 相当于有个N大小的数组,每个位置可以放序列中的一个值(使用了的就不能继续使用了)
     * 2. 通过深度优先递归填入
     * 3. 递归树
     *
     * @param nums 不包含重复数字的序列
     * @return 所有的可能的全排列
     */

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // 输入的健壮性
        if (nums == null || nums.length == 0) {
            return result;
        }
        dfs(result, new LinkedList<>(), nums);
        return result;
    }

    private void dfs(List<List<Integer>> result, LinkedList<Integer> tmp, int[] nums) {
        if (tmp.size() == nums.length) {
            result.add(new LinkedList<>(tmp));
            return;
        }

        for (int num : nums) {
            if (tmp.contains(num)) {
                continue;
            }
            tmp.add(num);
            dfs(result, tmp, nums);
            tmp.remove(tmp.size() - 1);
        }


    }


    /**
     * 全排列II: 给定一个可包含重复数字的序列,返回所有不重复的全排列
     * 思路:
     * 1. 画出递归树
     * 2. 进行剪枝
     *
     * @param nums 可重复的数字序列
     * @return 不重复的全排列
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        dfsUnique(result, new boolean[nums.length], new LinkedList<>(), nums);
        return result;

    }

    private void dfsUnique(List<List<Integer>> result, boolean[] visited, List<Integer> tmp, int[] nums) {
        if (tmp.size() == nums.length) {
            result.add(new LinkedList<>(tmp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // 剪枝
            if (visited[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1]) {
                break;
            }

            tmp.add(nums[i]);
            visited[i] = true;
            dfsUnique(result, visited, tmp, nums);
            tmp.remove(tmp.size() - 1);
            visited[i] = false;
        }

    }
}
