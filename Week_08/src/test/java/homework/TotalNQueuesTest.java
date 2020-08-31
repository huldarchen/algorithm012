package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    void solveNQueens() {
        List<List<String>> result = totalNQueues.solveNQueens(4);
        for (List<String> rows: result) {
            for (String row : rows) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
