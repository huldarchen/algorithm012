package medium;

/**
 * 寻找旋转数组的最小值
 *
 * @author huldar
 * @date 2020-10-19 11:50
 */
public class FindMin {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // 特殊情况
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0, right = nums.length - 1;
        if (nums[right] > nums[0]) {
            return nums[0];
        }

        // 二分查找
        while (left <= right) {
            int mid = left + ((right - left) >>> 1);
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
