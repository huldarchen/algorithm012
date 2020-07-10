package leetcode;

/**
 * LeetCode-26:删除排序数组中的重复项
 *  给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成
 *
 * @author bingjie.chen
 * @date 2020/7/8
 */
public class RemoveDuplicates {
    /**
     * 双指针
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     * 弊端:在完全没有重复的时候也要进行复制一遍
     */
    public int removeDuplicatesUseIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //记录长度
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
