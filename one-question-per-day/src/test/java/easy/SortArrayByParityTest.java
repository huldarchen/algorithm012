package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-10-13 09:41
 */
class SortArrayByParityTest {
    private final SortArrayByParity sortArrayByParity = new SortArrayByParity();

    @Test
    void sortArrayByParity() {
        int[] result = sortArrayByParity.sortArrayByParity(new int[]{3, 1, 2, 4});
        System.out.println(Arrays.toString(result));
    }
}
