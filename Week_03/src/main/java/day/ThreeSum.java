package day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode-15: 三数之和
 *
 * @author bingjie.chen
 * @date 2020/7/25
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //边界条件
        if (nums == null || nums.length < 3) {
            return result;
        }
        //排序
        Arrays.sort(nums);
        //外层遍历
        for (int i = 0; i < nums.length; i++) {
            //如果比0大直接break
            if (nums[i] > 0) {
                break;
            }
            //过滤掉重复的结果值
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //双指针
            int index1 = i + 1, index2 = nums.length -1;
            while (index1 < index2) {
                int sum = nums[i] + nums[index1] + nums[index2];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[index1], nums[index2]));
                    while (index1 < index2 && nums[index1] == nums[++index1]){}
                    while (index1 < index2 && nums[index2] == nums[--index2]) {}
                    index1++;
                    index2--;
                } else if (sum < 0) {
                    index1++;
                } else {
                    index2--;
                }
            }

        }
        return result;
    }
}
