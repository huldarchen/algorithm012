package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO
 *
 * @author bingjie.chen
 * @date 2020/7/8
 */
class MergeTwoArrayTest {

    @Test
    void mergeTwoArrayFromTail() {
        int[] nums1 = {1,2,3,0,0,0,};
        int[] nums2 = {2,5,6};
        int[] excepted = {1,2,2,3,5,6};
        new MergeTwoArray().mergeTwoArrayFromTail(nums1,3,nums2,3);
        assertArrayEquals(excepted,nums1);
    }

    @Test
    void mergeTwoArrayNoCopy() {
        int[] nums1 = {1,2,3,0,0,0,};
        int[] nums2 = {2,5,6};
        int[] excepted = {1,2,2,3,5,6};
        new MergeTwoArray().mergeTwoArrayNoCopy(nums1,3,nums2,3);
        assertArrayEquals(excepted,nums1);
    }
}
