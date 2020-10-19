package medium;


/**
 * 搜索旋转素组2
 *
 * @author huldar
 * @date 2020-10-19 12:04
 */
public class SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >>> 1);
            if (nums[mid] == target) {
                return true;
            }
            if (nums[left] == nums[mid]) {
                left++;
                continue;
            }
            if (nums[left] < nums[mid]) {
                // 前半部分有序
                if (nums[mid] > target && nums[left] <= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && nums[right] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }

        return false;
    }
}
