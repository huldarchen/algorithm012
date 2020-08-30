package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-30 10:56
 */
class PowerOfTwoTest {
    private final PowerOfTwo powerOfTwo = new PowerOfTwo();

    @Test
    void isPowerOfTwo() {
        assertTrue(powerOfTwo.isPowerOfTwo(1));
        assertFalse(powerOfTwo.isPowerOfTwo(0));
        assertTrue(powerOfTwo.isPowerOfTwo(16));
        assertFalse(powerOfTwo.isPowerOfTwo(-16));
    }
}
