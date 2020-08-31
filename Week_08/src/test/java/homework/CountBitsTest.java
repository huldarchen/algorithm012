package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-31 23:05
 */
class CountBitsTest {
    private final CountBits countBits = new CountBits();

    @Test
    void countBits() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, countBits.countBits(5));
        assertArrayEquals(new int[]{0, 1, 1}, countBits.countBits(2));
    }
}
