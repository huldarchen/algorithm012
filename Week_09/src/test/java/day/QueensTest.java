package day;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-31 19:43
 */
class QueensTest {
    private final Queens queens = new Queens();

    @Test
    void solveNQueens() {
        List<List<String>> result = queens.solveNQueens(4);

        for (List<String> strings : result) {
            for (String string : strings) {
                System.out.println(string);
            }
            System.out.println();
        }
    }
}
