package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-31 19:03
 */
class FirstUniqCharTest {
    private final FirstUniqChar firstUniqChar = new FirstUniqChar();

    @Test
    void firstUniqChar() {
        int excepted = firstUniqChar.firstUniqChar("loveleetcode");
        assertEquals(2, excepted);
    }
}
