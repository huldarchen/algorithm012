package day;

/**
 * LeetCode-213: 打家劫舍
 *
 * @author huldar
 * @date 2020-08-12 22:05
 */
public class HouseRobber {
    /**打家劫舍-II 房屋收尾相连*/
    public int rob2(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        return Math.max(dp(nums, 1, length), dp(nums, 0, length - 1));
    }

    private int dp(int[] nums, int start, int end) {
        int pre = 0, curr = 0;
        for (int i = start; i < end; i++) {
            int tmp = curr;
            curr = Math.max(curr, pre + nums[i]);
            pre = tmp;
        }
        return curr;
    }
}
