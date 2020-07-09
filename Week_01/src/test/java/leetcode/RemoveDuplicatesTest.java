package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO
 *
 * @author bingjie.chen
 * @date 2020/7/8
 */
class RemoveDuplicatesTest {

    @Test
    void removeDuplicatesUseIndex() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int excepted = 5;
        int result = new RemoveDuplicates().removeDuplicatesUseIndex(nums);
        assertEquals(excepted, result);
    }
}
