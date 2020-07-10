package leetcode;

/**
 * LeetCode-11:盛水最多的容器
 *
 * @author bingjie.chen
 * @date 2020/7/8
 */
public class MaxArea {

    /**
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     * 双指针夹逼
     */
    public int maxAreaUseTwoIndex(int[] nums) {
        int max = 0;
        for (int i = 0, j = nums.length - 1; i < j; ) {
            int minHeight = nums[i] < nums[j] ? nums[i++] : nums[j--];
            max = Math.max(max,(j - i + 1) * minHeight);
        }
        return max;
    }

    /**
     * 时间复杂度O(n^2)
     * 空间复杂度O(1)
     * 枚举法,两层循环
     */
    public int maxAreaUseTwoLoop(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int minHeight = Math.min(nums[i], nums[j]);
                max = Math.max(max, minHeight * (j - i));
            }
        }
        return max;
    }

}
