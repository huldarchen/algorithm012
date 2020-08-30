package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-30 11:05
 */
class ReverseBitsTest {
    private final ReverseBits reverseBits = new ReverseBits();

    @Test
    void reverseBits() {
        // 011  110
        reverseBits.reverseBits(3);
    }
}
