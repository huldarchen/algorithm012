package homework;

/**
 * LeetCode-55: 跳跃游戏
 *
 * @author huldar
 * @date 2020-08-01 17:18
 */
public class CanJump {

    public boolean canJump(int[] nums) {
        int reach = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (reach >= i) {
                reach = Math.max(reach, i + nums[i]);
            }
        }
        return reach >= length - 1;
    }
}
