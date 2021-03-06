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
        assertEquals(2, binarySearch.rotateArray(new int[]{2, 11, 15, 19, 30, 32, 61, 72, 88, 90, 95}, 15));
    }

    @Test
    void search() {
        binarySearch.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
    }
}
