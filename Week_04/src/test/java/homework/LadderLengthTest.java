package homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-01 11:31
 */
class LadderLengthTest {

    private final LadderLength ladderLength = new LadderLength();

    @Test
    void ladderLengthUseBFS() {

        assertEquals(5, ladderLength.ladderLengthUseBFS("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog")));
    }

    @Test
    void ladderLengthUseDoubleBFS() {
        List<String> wordList = new ArrayList<>();
        String[] words = {"hot","cog","dog","tot","hog","hop","pot","dot"};
        Collections.addAll(wordList, words);

        String beginWord = "hot";
        String endWord = "dog";
        System.out.println(ladderLength.ladderLengthUseDoubleBFS(beginWord, endWord, wordList));
    }
}
