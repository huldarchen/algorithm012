package homework;

/**
 * LeetCode: 寻找旋转数组的最小值
 *
 * @author huldar
 * @date 2020-08-17 21:20
 */
public class FindMin {
    public  int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0, right = nums.length - 1, mid;
        while (left < right) {
            mid = left + ((right - left) >>> 1);
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left];
    }
}
