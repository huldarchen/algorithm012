package homework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 四数之和
 *
 * @author huldar
 * @date 2020-08-08 13:52
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] >= target) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int four = nums[i];
            for (int j = i + 1; i < nums.length - 2; j++) {
                if (nums[j] >= target - four) {
                    break;
                }
                if (j > 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int three = nums[j];
                int index1 = j + 1, index2 = nums.length - 1;
                while (index1 < index2) {
                    if (four + three + nums[index1] + nums[index2] == target) {
                        result.add(Arrays.asList(four, three, nums[index1], nums[index2]));
                        while (index1 < index2 && nums[index1] == nums[index1 + 1]) {
                            index1++;
                        }
                        while (index1 < index2 && nums[index2] == nums[index2 - 1]) {
                            index2--;
                        }
                        index1++;
                        index2--;
                    } else if (four + three + nums[index1] + nums[index2] < target) {
                        index1++;
                    } else {
                        index2--;
                    }
                }
            }
        }
        return  result;
    }
}
