package day;

/**
 * LeetCode-169:多数元素
 *
 * @author huldar
 * @date 2020-08-02 11:15
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        //排序取中间
        // Arrays.sort(nums);
        // return nums[nums.length >> 1];
        //摩尔投票法
        int majority  = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (majority == nums[i]) {
                count++;
            } else if (--count == 0) {
                majority = nums[i];
                count = 1;
            }
        }
        return majority;

    }
}
