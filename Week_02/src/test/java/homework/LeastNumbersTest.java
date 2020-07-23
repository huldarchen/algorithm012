package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 最小k个数
 *
 * @author bingjie.chen
 * @date 2020/7/19
 */
class LeastNumbersTest {
    private final LeastNumbers leastNumbers = new LeastNumbers();
    @Test
    void getLeastNumbersUseHeap() {
        assertArrayEquals(new int[]{2, 1}, leastNumbers.getLeastNumbersUseHeap(new int[]{1, 2, 3}, 2));
    }
}
