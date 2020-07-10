package leetcode;

/**
 * LeetCode-88:
 * 合并两个有序数组
 *
 * @author bingjie.chen
 * @date 2020/7/8
 */
public class MergeTwoArray {
    /**
     * 从尾部进行遍历,添加到长数组的尾部
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     * @param nums1 第一个数组
     * @param m     第一个数组的非零长度
     * @param nums2 第二个数组
     * @param n     第二个数组的非零长度
     */
    public void mergeTwoArrayFromTail(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1, len2 = n - 1, len = m + n - 1;
        while (len1 >= 0 && len2 >= 0) {
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        //最后把nums2中剩余的copy到nums1中
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
    }
    /**
     * 从尾部进行遍历,添加到长数组的尾部
     * note:最后不需要进行copy
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     * @param nums1 第一个数组
     * @param m     第一个数组的非零长度
     * @param nums2 第二个数组
     * @param n     第二个数组的非零长度
     */
    public void mergeTwoArrayNoCopy(int[] nums1, int m, int[] nums2, int n) {
        while (n > 0) {
            nums1[m + n -1] = (m == 0 || nums2[n - 1] > nums1[m - 1]) ? nums2[--n] : nums1[--m];
        }
    }
}
