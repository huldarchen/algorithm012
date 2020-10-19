package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-10-16 11:39
 */
class MountainArrayTest {
    private final MountainArray mountainArray = new MountainArray();

    @Test
    void peakIndexInMountainArray() {
        assertEquals(1, mountainArray.peakIndexInMountainArray(new int[]{0, 1, 0}));
        assertEquals(1, mountainArray.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
    }
}
