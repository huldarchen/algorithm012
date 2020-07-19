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
        int[] data = {1, 1, 1, 2, 2, 3};
        topKFrequent.topKFrequent(data, 2);
    }
}
