package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-09-13 19:34
 */
class MiniWindowSubstringTest {

    private final MiniWindowSubstring miniWindowSubstring = new MiniWindowSubstring();

    @Test
    void minWindow1() {
        assertEquals("BANC", miniWindowSubstring.minWindow1("ADOBECODEBANC", "ABC"));
    }

    @Test
    void minWindow() {
        assertEquals("BANC", miniWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
    }
}
