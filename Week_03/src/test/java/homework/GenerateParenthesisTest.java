package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO
 *
 * @author bingjie.chen
 * @date 2020/7/25
 */
class GenerateParenthesisTest {

    private final GenerateParenthesis generateParenthesis = new GenerateParenthesis();
    @Test
    void generateParenthesis() {
        System.out.println(generateParenthesis.generateParenthesis(3));
    }
}
