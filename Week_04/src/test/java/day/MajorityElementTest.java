package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-02 11:16
 */
class MajorityElementTest {
    private final MajorityElement majorityElement = new MajorityElement();

    @Test
    void majorityElement() {
        assertEquals(3, majorityElement.majorityElement(new int[]{3, 3, 2, 3}));
    }
}
