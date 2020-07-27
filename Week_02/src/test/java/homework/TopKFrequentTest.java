package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO
 *
 * @author bingjie.chen
 * @date 2020/7/19
 */
class TopKFrequentTest {

    private TopKFrequent topKFrequent = new TopKFrequent();

    @Test
    void topKFrequent() {
        int[] data = {3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6};
        topKFrequent.topKFrequent(data, 10);
    }

    @Test
    void topKFrequent1() {
        int[] data = {3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6};
        topKFrequent.topKFrequent1(data, 10);
    }
}
