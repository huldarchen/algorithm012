package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-10-22 12:04
 */
class SearchA2DMatrixTest {
    private final SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();

    @Test
    void searchMatrix() {
        assertTrue(searchA2DMatrix.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3));
        assertFalse(searchA2DMatrix.searchMatrix(new int[][]{}, 3));
    }
}
