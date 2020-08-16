package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-12 23:04
 */
class GenerateParenthesisTest {
    private final GenerateParenthesis generateParenthesis = new GenerateParenthesis();

    @Test
    void generateParenthesis() {
        System.out.println(generateParenthesis.generateParenthesis(3));
    }
}
