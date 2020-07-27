package homework;

import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode-46:全排列
 *
 * @author bingjie.chen
 * @date 2020/7/26
 */
public class Permute {
    /**
     * 全排列
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        backtrack(result, new LinkedList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, LinkedList<Integer> tmp, int[] nums) {
        if (tmp.size() == nums.length) {
            result.add(new LinkedList<>(tmp));
            return;
        }

        for (int num : nums) {
            if (tmp.contains(num)) {
                continue;
            }
            tmp.add(num);
            backtrack(result, tmp, nums);
            tmp.removeLast();
        }

    }
}
