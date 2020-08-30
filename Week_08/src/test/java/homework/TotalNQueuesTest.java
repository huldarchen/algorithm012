package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-30 17:13
 */
class TotalNQueuesTest {

    private final TotalNQueues totalNQueues = new TotalNQueues();

    @Test
    void totalNQueues() {
        totalNQueues.totalNQueues(4);
    }
}
