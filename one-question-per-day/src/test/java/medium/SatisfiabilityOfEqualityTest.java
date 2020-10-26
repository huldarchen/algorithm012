package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-10-26 11:54
 */
class SatisfiabilityOfEqualityTest {
    private final SatisfiabilityOfEquality satisfiabilityOfEquality = new SatisfiabilityOfEquality();

    @Test
    void equationsPossible() {
        assertTrue(satisfiabilityOfEquality.equationsPossible(new String[]{"a=b", "b=c", "a=c"}));
    }
}
