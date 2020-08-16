package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-11 23:18
 */
class UniquePathsTest {
    private final UniquePaths uniquePaths = new UniquePaths();

    @Test
    void uniquePathsUseDPDownUp() {
        int actual = uniquePaths.uniquePathsUseDPDownUp(3, 2);
        assertEquals(3, actual);
    }

    @Test
    void uniquePathsUseDPUpDown() {
        int actual = uniquePaths.uniquePathsUseDPUpDown(3, 2);
        assertEquals(3, actual);
    }

    @Test
    void uniquePathsWithObstaclesUseDPDownUp() {
        int actual = uniquePaths.uniquePathsWithObstaclesUseDPDownUp(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        });
        assertEquals(2, actual);
    }
}
