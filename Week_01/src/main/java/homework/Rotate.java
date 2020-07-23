package homework;

/**
 * LeetCode-189:旋转数组
 * <p>
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * @author bingjie.chen
 * @date 2020/7/9
 */
public class Rotate {
    /**
     * 使用暴力解法,内外两层循环
     *  时间复杂度O(n^2)
     *  空间复杂度O(1)
     * @param nums 需要旋转的数组
     * @param k    向右移动位置
     */
    public void rotateByTwoLoop(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int tmp = nums[nums.length - 1];
            //从后往前
            for (int j = nums.length - 2; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0] = tmp;
        }
    }

    /**
     * 通过三次旋转
     *
     * 原始数组                  : 1 2 3 4 5 6 7
     * 反转所有数字后             : 7 6 5 4 3 2 1
     * 反转前 k 个数字后          : 5 6 7 4 3 2 1
     * 反转后 n-k 个数字后        : 5 6 7 1 2 3 4 --> 结果
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     * @param nums 需要旋转的数组
     * @param k    移动的位置
     *
     */
    public void rotateByThreeReverse(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        int tmp;
        while (start < end) {
            tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }
}
