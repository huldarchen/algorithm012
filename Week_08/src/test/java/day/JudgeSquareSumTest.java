package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-26 19:34
 */
class JudgeSquareSumTest {
    private final JudgeSquareSum judgeSquareSum = new JudgeSquareSum();

    @Test
    void judgeSquareSum() {
        assertTrue(judgeSquareSum.judgeSquareSum(1));
        assertTrue(judgeSquareSum.judgeSquareSum(5));
        assertTrue(judgeSquareSum.judgeSquareSum(4));
        assertFalse(judgeSquareSum.judgeSquareSum(3));
    }

}
