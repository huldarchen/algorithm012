package day;

/**
 * LeetCode:最大乘积问题
 *
 * @author huldar
 * @date 2020-08-20 12:14
 */
public class MaxProduct {
    public int maxProductDpOption(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(min * nums[i], Math.max(max * nums[i], nums[i]));
            min = Math.min(min * nums[i], Math.min(max * nums[i], nums[i]));
            result = Math.max(max, result);
        }
        return result;
    }

    public int maxProductDpOrigin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        int[] dpMax = new int[length];
        dpMax[0] = nums[0];
        int[] dpMin = new int[length];
        dpMin[0] = nums[0];

        int result = nums[0];
        /*
         * dpMax[] 记录最大值
         * dpMin[] 记录最小值
         *
         * dpMax的递推
         * 1. nums[i] >= 0 && dpMax[i - 1] >= 0 >>>>>> dpMax[i - 1] * nums[i]
         * 2. nums[i] >= 0 && dpMax[i - 1] < 0 >>>>>>  nums[i]
         * 3. nums[i] < 0 && dpMin[i - 1] < 0 >>>>>>> dpMin[i - 1] * nums[i]
         * 4. nums[i] < 0 && dpMin[i - 1] >= 0 >>>>>>> nums[i]
         *
         * dpMin一样
         */
        for (int i = 1; i < length; i++) {
            dpMax[i] = Math.max(dpMin[i - 1] * nums[i], Math.max(dpMax[i - 1] * nums[i], nums[i]));
            dpMin[i] = Math.min(dpMin[i - 1] * nums[i], Math.min(dpMax[i - 1] * nums[i], nums[i]));
            result = Math.max(result, dpMax[i]);
        }

        return result;
    }
}
