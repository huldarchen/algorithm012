package day;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-16 20:39
 */
class FindWordsITest {
    private final FindWordsI findWordsI = new FindWordsI();

    @Test
    void findWords() {
        char[][] board = {{'a', 'b', 'c'}, {'a', 'e', 'd'}, {'a', 'f', 'g'}};
        String[] words = {"abcdefg", "gfedcbaaa", "eaabcdgfa", "befa", "dgc", "ade"};
        List<String> strings = findWordsI.findWords(board, words);
        System.out.println(strings);
    }
}
