package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 移动0单元测试
 *
 * @author bingjie.chen
 * @date 2020/7/8
 */
class MoveZerosTest {

    @Test
    void moveZerosUseIndex() {
        int[] source = {0,1,0,3,120};
        int[] target = {1,3,120,0,0};
        new MoveZeros().moveZeroesUseIndex(source);

        assertArrayEquals(target,source);
    }

    @Test
    void moveZeroesUseTowLoop() {
        int[] source = {0,1,0,3,120};
        int[] target = {1,3,120,0,0};
        new MoveZeros().moveZeroesUseTowLoop(source);

        assertArrayEquals(target,source);
    }
}
