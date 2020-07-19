package day;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode-350:连个数组的交集
 *
 * 难点在于:
 *
 * 说明：
 *  输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 *  我们可以不考虑输出结果的顺序。
 * 进阶:
 *  如果给定的数组已经排好序呢？你将如何优化你的算法？
 *  如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 *  如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 *
 * @author bingjie.chen
 * @date 2020/7/13
 */
public class InterSect {

    public int[] intersectOrdered(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index1 = 0, index2 = 0, index = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                result[index] = nums1[index1];
                index1++;
                index2++;
                index++;
            }
        }
        return Arrays.copyOfRange(result, 0 ,index);
    }






    /**
     * 遍历两遍数组,使用hash表存储 小两数组中的元素和出现的个数
     * 时间复杂度是O(m + n)
     * 空间复杂度是O(n)
     */
    public int[] intersectUseHash(int[] nums1, int[] nums2) {
        //设定第一个数组为小数组
        if (nums1.length > nums2.length) {
            return intersectUseHash(nums2, nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        //第一遍遍历取出小数组中的值和出现次数
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        //声明 一个结果数组
        int[] result = new int[nums1.length];
        int index = 0;
        //第二遍遍历
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                result[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                  map.remove(num);
                }
            }
        }

        return Arrays.copyOfRange(result, 0, index);
    }
}
