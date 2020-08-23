package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author huldar
 * @date 2020-08-23 17:52
 */
class TrieTest {
    private final Trie trie = new Trie();

    @BeforeEach
    private void init() {
        trie.insert("dog");
        trie.insert("cat");
    }

    @Test
    void search() {
        assertTrue(trie.search("cat"));
    }

    @Test
    void startsWith() {
        assertTrue(trie.startsWith("ca"));
    }
}
