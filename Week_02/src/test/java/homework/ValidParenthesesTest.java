package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO
 *
 * @author bingjie.chen
 * @date 2020/7/13
 */
class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void isValidUseStack() {
        assertTrue(validParentheses.isValidUseStack("()"));
    }

    @Test
    void isValidUseStackOption() {
        assertTrue(validParentheses.isValidUseStackOption("()"));
    }
}
