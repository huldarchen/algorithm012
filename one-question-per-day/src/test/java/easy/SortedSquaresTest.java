package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-10-15 20:02
 */
class SortedSquaresTest {
    private final SortedSquares sortedSquares = new SortedSquares();

    @Test
    void sortedSquares() {
        int[] ints = sortedSquares.sortedSquares(new int[]{-1});
        System.out.println(Arrays.toString(ints));
    }
}
