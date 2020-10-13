package easy;

/**
 * 数组奇数偶数排序
 *
 * @author huldar
 * @date 2020-10-13 09:28
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        int left = 0, right = nums.length - 1;

        while (left < right) {

            while (nums[left] % 2 == 0) {
                left++;
            }
            while (nums[right] % 2 == 1) {
                right++;
            }
            int tmp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = tmp;
        }
        return nums;
    }
}
