package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO
 *
 * @author bingjie.chen
 * @date 2020/7/10
 */
class TwoSumTest {

    @Test
    void twoSumByForce() {
        int[] source = {2,7,11,15};
        int[] result = new TwoSum().twoSumByForce(source, 9);
        int[] excepted = {0,1};
        assertArrayEquals(excepted,result);
    }

    @Test
    void twoSumByHash() {
        int[] source = {2,7,11,15};
        int[] result = new TwoSum().twoSumByHash(source, 9);
        int[] excepted = {0,1};
        assertArrayEquals(excepted,result);
    }
}
