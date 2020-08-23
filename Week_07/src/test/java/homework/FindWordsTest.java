package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-23 17:48
 */
class FindWordsTest {
    private final FindWords findWords = new FindWords();

    @Test
    void findWords() {
        List<String> words = findWords.findWords(new char[][]{
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        }, new String[]{"oath", "pea", "eat", "rain"});
        for (String word : words) {
            System.out.println(word);
        }
    }
}
