package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO
 *
 * @author bingjie.chen
 * @date 2020/7/14
 */
class RemoveOuterParenthesesTest {

    private final RemoveOuterParentheses removeOuterParentheses = new RemoveOuterParentheses();

    @Test
    void removeOuterParenthesesUseStack() {
        assertEquals("()()()", removeOuterParentheses.removeOuterParenthesesUseStack("(()())(())"));
    }

    @Test
    void removeOuterParenthesesUseIndex() {
        assertEquals("()()()", removeOuterParentheses.removeOuterParenthesesUseCounter("(()())(())"));
    }
}
