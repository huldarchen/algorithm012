package hard;

/**
 * 寻找旋转排序数组中的最小值2
 *
 * @author huldar
 * @date 2020-10-20 10:25
 */
public class FindMinimumInRotatedSortedArray154 {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0, right = nums.length - 1;

        while (left < right) {
           if (nums[left] < nums[right]) {
               return nums[left];
           }
           int mid = left + ((right - left) >>> 1);
           if (nums[left] < nums[mid]) {
               left = mid + 1;
           } else if (nums[left] > nums[mid]) {
               right = mid;
           } else {
               left++;
           }
        }
        return nums[left];

    }
}
