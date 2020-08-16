package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-13 00:00
 */
class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

    @Test
    void longestCommonSubsequenceUseDP() {
        int actual = longestCommonSubsequence.longestCommonSubsequenceUseDP("abcde", "ace");
        assertEquals(3, actual);
    }
}
