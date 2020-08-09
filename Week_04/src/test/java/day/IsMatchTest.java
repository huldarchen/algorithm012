package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-09 20:49
 */
class IsMatchTest {
    private final IsMatch isMatch = new IsMatch();

    @Test
    void isMatch() {
        assertTrue(isMatch.isMatch("aa", "a*"));
    }
}
