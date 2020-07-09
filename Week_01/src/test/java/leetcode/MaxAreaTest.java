package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 盛水最多的容器单元测试
 *
 * @author bingjie.chen
 * @date 2020/7/8
 */
class MaxAreaTest {

    @Test
    void maxAreaUseTwoIndex() {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int excepted = 49;
        int result = new MaxArea().maxAreaUseTwoIndex(nums);
        assertEquals(excepted, result);
    }

    @Test
    void maxAreaUseTwoLoop() {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int excepted = 49;
        int result = new MaxArea().maxAreaUseTwoLoop(nums);
        assertEquals(excepted, result);
    }
}
