package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 数组交集测试
 *
 * @author bingjie.chen
 * @date 2020/7/13
 */
class InterSectTest {
    private final InterSect interSect = new InterSect();

    @Test
    void intersectUseHash() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = interSect.intersectUseHash(nums1, nums2);
        int[] excepted = {2, 2};
        assertArrayEquals(excepted, result);
    }

    @Test
    void intersectOrdered() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = interSect.intersectOrdered(nums1, nums2);
        int[] excepted = {2, 2};
        assertArrayEquals(excepted, result);
    }
}
