package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-01 22:52
 */
class BinarySearchTest {
    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void rotateArray() {
        assertEquals(4, binarySearch.rotateArray(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}
