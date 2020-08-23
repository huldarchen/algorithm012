package day;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-23 17:16
 */
class GenerateParenthesisTest {
    private final GenerateParenthesis generateParenthesis = new GenerateParenthesis();

    @Test
    void generateParenthesis() {
        List<String> parenthesis = generateParenthesis.generateParenthesis(4);
        for (String par : parenthesis) {
            System.out.println(par);
        }


    }
}
