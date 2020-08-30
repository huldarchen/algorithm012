package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-30 10:45
 */
class HammingWeightTest {
    private final HammingWeight hammingWeight = new HammingWeight();

    @Test
    void hammingWeight() {
       assertEquals(4, hammingWeight.hammingWeight(23));
    }
}
