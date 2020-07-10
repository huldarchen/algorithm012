package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 数组旋转测试
 *
 * @author bingjie.chen
 * @date 2020/7/9
 */
class RotateTest {

    @Test
    void rotateByTwoLoop() {
        int[] source = {-1, -100, 3, 99};
        int k = 2;
        new Rotate().rotateByTwoLoop(source,k);
        int[] target = {3, 99, -1, -100};
        assertArrayEquals(target,source);
    }

    @Test
    void rotateByThreeReverse() {
        int[] source = {-1, -100, 3, 99};
        int k = 2;
        new Rotate().rotateByThreeReverse(source,k);
        int[] target = {3, 99, -1, -100};
        assertArrayEquals(target,source);
    }
}
