package homework;

/**
 * LeetCode-53: 最大子序和
 * @author huldar
 * @date 2020-08-06 21:55
 */
public class MaxSubArray {

    /** 通过分治进行问题解析 时间复杂度是 O(2^n) */
    public int maxSubArray(int[] nums) {
       return maxSubArrayDivideWithBorder(nums, 0, nums.length - 1);
    }

    private int maxSubArrayDivideWithBorder(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }

        // 分治 子问题
        int center = (start + end) / 2;
        int leftMax = maxSubArrayDivideWithBorder(nums, start, center);
        int rightMax = maxSubArrayDivideWithBorder(nums, center + 1, end);

        int leftCrossMax = Integer.MIN_VALUE;
        int leftCrossSum = 0;
        for (int i = center ; i >= start ; i --) {
            leftCrossSum += nums[i];
            leftCrossMax = Math.max(leftCrossSum, leftCrossMax);
        }

        int rightCrossMax = nums[center + 1];
        int rightCrossSum = 0;
        for (int i = center + 1; i <= end ; i ++) {
            rightCrossSum += nums[i];
            rightCrossMax = Math.max(rightCrossSum, rightCrossMax);
        }
        int crossMax = leftCrossMax + rightCrossMax;

        return Math.max(crossMax, Math.max(leftMax, rightMax));
    }
}
