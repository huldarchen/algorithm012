package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-10-19 12:15
 */
class SearchInRotatedSortedArrayIITest {

    private final SearchInRotatedSortedArrayII searchInRotatedSortedArrayII = new SearchInRotatedSortedArrayII();

    @Test
    void search() {
        assertFalse(searchInRotatedSortedArrayII.search(new int[]{1}, 0));
    }
}
