package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-09-23 09:48
 */
class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void isValid() {
        assertTrue(validParentheses.isValid("[]{}()"));
    }
}
