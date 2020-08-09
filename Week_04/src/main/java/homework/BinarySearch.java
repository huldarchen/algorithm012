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
        int count = 0;
        while (low <= high) {
            System.out.println(++count);
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
    public int search(int[] nums, int target) {
        //二分查找，主要的问题是如何却分那部分是有序的那部分是包含了旋转点的
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            // 分有序一面
            if (nums[left] <= nums[mid]) { // 左边有序
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // 右边有序
                if (target >= nums[mid] && target < nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        return -1;
    }

}
