package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 丑数测试
 *
 * @author bingjie.chen
 * @date 2020/7/19
 */
class NthUglyNumberTest {
    private final NthUglyNumber  nthUglyNumber = new NthUglyNumber();
    @Test
    void nthUglyNumberUseIndex() {
        assertEquals(12, nthUglyNumber.nthUglyNumberUseIndex(10));
    }
}
