package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-23 18:07
 */
class FindCircleNumTest {
    private final FindCircleNum findCircleNum = new FindCircleNum();

    @Test
    void findCircleNum() {
        int circleNum = findCircleNum.findCircleNum(new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        });
        assertEquals(2, circleNum);
    }
}
