package homework;

import java.util.HashMap;
import java.util.Map;

/**
 *  LeetCode-1: 两数之和
 *
 * @author bingjie.chen
 * @date 2020/7/10
 */
public class TwoSum {
    //第一种解题思路 暴力求解
    /**
     * 暴力求解
     * 时间复杂度为O(n)
     * 空间复杂度为O(1)
     */
    public int[] twoSumByForce(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * 使用hash求解
     */
    public int[] twoSumByHash(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hash.containsKey(diff)) {
                return new int[]{hash.get(diff), i};
            }
            hash.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
