package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-10-19 12:00
 */
class FindMinTest {
    private final FindMin findMin = new FindMin();

    @Test
    void findMin() {
        assertEquals(1, findMin.findMin(new int[]{3, 4, 5, 1, 2}));
        assertEquals(-1, findMin.findMin(new int[]{}));
        assertEquals(3, findMin.findMin(new int[]{3}));
    }
}
