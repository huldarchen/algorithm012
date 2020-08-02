package homework;

/**
 * 二分查找 LeetCode
 *
 * @author huldar
 * @date 2020-08-01 22:22
 */

public class BinarySearch {
    /**
     * 旋转数组的二分查找
     */
    public int rotateArray(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //判断是否是在有序的一侧
            if (nums[low] <= nums[mid]) {
                //有序的一侧正常二分查找
                if (target >= nums[low] && target <= nums[mid]) {
                    high = high - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                //不在有序的一侧
                if (target <= nums[high] && target > nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

}
