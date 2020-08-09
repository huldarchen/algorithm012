package homework;

/**
 * LeetCode-153: 寻找旋转数组中的最小值
 *
 * @author huldar
 * @date 2020-08-03 22:07
 */
public class FindMin {

    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return  low;
    }
}
