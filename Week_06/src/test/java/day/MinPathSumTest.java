package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-10 12:21
 */
class MinPathSumTest {
    private final MinPathSum minPathSum = new MinPathSum();

    @Test
    void minPathSumUseRecursion() {
        int minPathSum = this.minPathSum.minPathSumUseRecursion(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        });
        assertEquals(7, minPathSum);
    }

    @Test
    void minPathSumUseDP() {
        int minPathSum = this.minPathSum.minPathSumUseDP(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        });
        assertEquals(7, minPathSum);
    }
}
