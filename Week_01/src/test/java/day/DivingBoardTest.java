package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO
 *
 * @author bingjie.chen
 * @date 2020/7/8
 */
class DivingBoardTest {

    @Test
    void divingBoardByDiff() {
        int shorter = 1, longer = 2, k = 3;
        int[] excepted = {3, 4, 5, 6};
        int[] result = new DivingBoard().divingBoardByDiff(shorter, longer, k);
        assertArrayEquals(excepted,result);
    }
}
