package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-10-20 10:35
 */
class FindMinimumInRotatedSortedArray154Test {
    private final FindMinimumInRotatedSortedArray154 findMinimumIn = new FindMinimumInRotatedSortedArray154();

    @Test
    void findMin() {
        assertEquals(1, findMinimumIn.findMin(new int[]{1, 3, 5}));
        assertEquals(0, findMinimumIn.findMin(new int[]{2, 2, 2, 0, 1}));
        assertEquals(0, findMinimumIn.findMin(new int[]{2, 2, 2, 0, 1, 1, 1, 1}));
    }
}
