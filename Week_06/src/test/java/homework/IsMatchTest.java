package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-11 22:16
 */
class IsMatchTest {

    private final IsMatch isMatch = new IsMatch();

    @Test
    void isMatchUseDPDownUp() {
        assertTrue(isMatch.isMatchUseDPDownUp("abc", "ab."));
        assertTrue(isMatch.isMatchUseDPDownUp("aa", "a*"));
    }

    @Test
    void isMatchUseDPUp2Down() {
        assertTrue(isMatch.isMatchUseDPUp2Down("abc", "ab."));
        assertTrue(isMatch.isMatchUseDPUp2Down("aa", "a*"));
    }
}
