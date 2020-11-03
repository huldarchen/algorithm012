package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-11-02 20:31
 */
class TotalNQueuesTest {
    private final TotalNQueues totalNQueues = new TotalNQueues();

    @Test
    void solveNQueens() {
        System.out.println(totalNQueues.solveNQueens(4));
    }

    @Test
    void totalNQueens() {
        assertEquals(2, totalNQueues.totalNQueens(4));
        assertEquals(92, totalNQueues.totalNQueens(8));
        assertEquals(1, totalNQueues.totalNQueens(0));
    }

}
