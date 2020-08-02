package homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
}
